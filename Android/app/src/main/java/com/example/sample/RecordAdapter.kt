package com.example.sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecordAdapter (private val recList: ArrayList<RecordModel>): RecyclerView.Adapter<RecordAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_disprec, parent, false)
        return ViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentRec = recList[position]
        holder.tvRName1.text = currentRec.heartRate.toString()
        holder.tvRName2.text = currentRec.respRate.toString()
        holder.tvRName3.text = currentRec.bloodSugar.toString()
        holder.tvRName4.text = currentRec.nausea.toString()
        holder.tvRName5.text = currentRec.headache.toString()
        holder.tvRName6.text = currentRec.diarrhea.toString()
        holder.tvRName7.text = currentRec.sour.toString()
        holder.tvRName8.text = currentRec.fever.toString()
        holder.tvRName9.text = currentRec.muscle.toString()
        holder.tvRName10.text = currentRec.loss.toString()
        holder.tvRName11.text = currentRec.cough.toString()
        holder.tvRName12.text = currentRec.short.toString()
        holder.tvRName13.text = currentRec.feel.toString()
    }
    override fun getItemCount(): Int {
        return recList.size
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvRName1: TextView = itemView.findViewById(R.id.tvRName1)
        val tvRName2: TextView = itemView.findViewById(R.id.tvRName2)
        val tvRName3: TextView = itemView.findViewById(R.id.tvRName3)
        val tvRName4: TextView = itemView.findViewById(R.id.tvRName4)
        val tvRName5: TextView = itemView.findViewById(R.id.tvRName5)
        val tvRName6: TextView = itemView.findViewById(R.id.tvRName6)
        val tvRName7: TextView = itemView.findViewById(R.id.tvRName7)
        val tvRName8: TextView = itemView.findViewById(R.id.tvRName8)
        val tvRName9: TextView = itemView.findViewById(R.id.tvRName9)
        val tvRName10: TextView = itemView.findViewById(R.id.tvRName10)
        val tvRName11: TextView = itemView.findViewById(R.id.tvRName11)
        val tvRName12: TextView = itemView.findViewById(R.id.tvRName12)
        val tvRName13: TextView = itemView.findViewById(R.id.tvRName13)
    }
}