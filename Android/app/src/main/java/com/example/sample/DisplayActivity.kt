package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sample.databinding.ActivityDisplayBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class DisplayActivity : AppCompatActivity() {

    private lateinit var binding4: ActivityDisplayBinding
    private lateinit var recRecyclerView: RecyclerView
    private lateinit var recList: ArrayList<RecordModel>
    private lateinit var dbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding4 = ActivityDisplayBinding.inflate(layoutInflater)
        setContentView(binding4.root)

        recRecyclerView = binding4.rvRec
        recRecyclerView.layoutManager = LinearLayoutManager(this)
        recRecyclerView.setHasFixedSize(true)

        recList = arrayListOf<RecordModel>()
        getRecordData()

    }

    private fun getRecordData() {
        recRecyclerView.visibility = View.GONE
        binding4.tvLoading.visibility = View.VISIBLE
        dbRef = FirebaseDatabase.getInstance().getReference("Signs")
        dbRef.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                recList.clear()
                if (snapshot.exists()){
                    for (recSnap in snapshot.children){
                        val recData = recSnap.getValue(RecordModel::class.java)
                        recList.add(recData!!)
                    }
                    val mAdapter = RecordAdapter(recList)
                    recRecyclerView.adapter = mAdapter

                    recRecyclerView.visibility = View.VISIBLE
                    binding4.tvLoading.visibility = View.GONE
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }
}