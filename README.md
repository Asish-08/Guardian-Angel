# GuardianAngel
## Introduction
Guardian Angel is a cutting-edge, personalized context-aware application meticulously crafted to elevate the quality of life and safety for individuals with diabetes. This revolutionary app seamlessly integrates health monitoring with travel-specific features, creating a comprehensive solution to ensure user well-being.
## How Guardian Angel Works
## :ledger: Index

- [Project Structure](#beginner-ProjectStructure)
- [Usage](#zap-usage)
  - [Installation](#electric_plug-installation)
  - [Inputs](#notebook-Inputs)
  - [Development Environment](#nut_and_bolt-development-environment)
  - [Build](#hammer-build)  
  - [Deployment](#rocket-deployment)  
  - [Contribution](#fire-contribution)  
- [FAQ](#question-faq)
- [Credit/Acknowledgment](#star2-creditacknowledgment)

##  :beginner: Project Structure

The project is divided into three main sections:

## Section 1: User Information

In this section, the mobile application collects user information, including Heart Rate, Respiratory Rate, Blood Sugar levels, User Schedules, User’s Travel Bookings, and Medical Records. All data is stored in the database for future reference.

## Section 2: Vehicle and Travel Information

User vehicle and travel details are captured, encompassing the distance between two cars, the speed of the car, and travel specifics like source, destination, and road conditions. This information is vital for understanding the user's travel environment.

## Section 3: Advisory Controller

The Advisory Controller processes heart rate, respiratory rate, and vehicle information from Sections 1 and 2. It calculates whether the user needs to switch. If the output suggests 'no switch,' the app prompts the user to "Relax." For 'switch,' an alert is sent through the mobile app, while a 'crash' prediction triggers automatic contact with emergency services.

## :zap: Usage
**Significance of Guardian Angel:**

Guardian Angel isn't just another app – it's a game-changer for those navigating life with diabetes. Imagine having a personal health companion that not only tracks your vital stats but also watches over you while you travel. The magic happens when Guardian Angel combines your health data, travel plans, and real-time road conditions. This isn't just about convenience; it's a safety net, a guardian that steps in when there's a potential danger on your journey.

Think about the everyday scenarios: you measure your blood sugar, check your heart rate, and report how you're feeling. Guardian Angel takes this information and, with a touch of tech wizardry, predicts if there's a risk during your travels. It's your virtual lookout, ready to alert emergency services and even contact the nearest hospital if needed. The significance here is clear – it's about empowerment, safety, and an elevated quality of life. Guardian Angel isn't just an app; it's a friend in your pocket, offering peace of mind and actively contributing to your well-being.

###  :electric_plug: Installation

### 1. **Installation:**
   - Download the Guardian Angel APK file.
   - Install the application on your Android device by allowing installations from unknown sources in your device settings.

### 2. **Login:**
   - Open the Guardian Angel app and navigate to the login page.
   - Choose between signing in with Google or entering credentials (username and password).

### 3. **Health Metrics Input:**
   - Upon successful login, enter your calculated blood sugar levels.
   - Measure heart rate and respiratory rate by tapping the corresponding buttons on the main screen.

### 4. **Symptoms Reporting:**
   - Click on the "Symptoms" button to report your current health condition.
   - Select symptoms from the dropdown menu and rate their severity using the star rating system.
   - Click on "Upload" to save the symptom data.

### 5. **Road Conditions:**
   - Navigate to the "Road Conditions" section.
   - Enter source (src) and target (tgt) locations for your travel route.
   - Input the speed and distance between cars for real-time traffic conditions.

### 6. **Collision Prediction:**
   - The app analyzes your health metrics and road conditions using MATLAB.
   - It provides feedback on whether there is a potential collision risk during your travel.

### 7. **Flight Itinerary and Hotel Bookings:**
   - Enter your flight itinerary details, including departure and arrival information.
   - Input your hotel booking details, ensuring comprehensive travel data.

### 8. **Emergency Protocols:**
   - Guardian Angel, in case of a potential collision, initiates immediate emergency protocols.
   - It contacts the nearest hospital and sends them relevant health information.

### 9. **Regular Monitoring:**
   - Periodically update your health metrics by tapping the relevant buttons.
   - Review and update your symptoms regularly for accurate health analysis.

By following these formal usage instructions, you ensure that Guardian Angel maximizes its capabilities in health monitoring, travel safety, and emergency response. The app's comprehensive features aim to enhance your overall well-being, providing a tailored and vigilant guardian for individuals managing diabetes.

### :notebook: Inputs
1. **Blood Sugar:** Please accurately input your current blood sugar levels for precise health monitoring.
2. **Vehicle Speed:** Enter your vehicle speed to enhance real-time analysis and collision risk prediction.
3. **Source/Destination:** Provide correct source and destination locations for accurate road condition assessments.
4. **Symptoms:** Report symptoms with severity ratings for comprehensive health insights.


###  :nut_and_bolt: Development Environment
**Utilized Technologies in Guardian Angel:**
Guardian Angel is powered by a robust technological stack, combining Firebase for seamless real-time data synchronization, a local database for efficient storage and retrieval of user-specific information, and the integration of Google APIs, including Maps APIs, to enhance location accuracy and road condition assessments. The collision status determination is intelligently executed using MATLAB, adding a layer of sophisticated analysis to ensure proactive safety measures. Developed with Kotlin, Guardian Angel leverages the strengths of Android development to deliver a user-friendly and technologically advanced experience.
- **Firebase Integration:**
  - Utilized Firebase for real-time data synchronization, ensuring the app stays updated with the latest user information.

- **Local Database Management:**
  - Implemented a local database for efficient storage and retrieval of user-specific data, enhancing the overall performance of Guardian Angel.

- **Google APIs Integration:**
  - Integrated various Google APIs, including Maps APIs, to improve location accuracy and provide reliable data for road condition assessments.

- **MATLAB for Collision Determination:**
  - Leveraged MATLAB for in-depth analysis, allowing Guardian Angel to intelligently determine collision status and mitigate potential risks.

- **Kotlin for Android Development:**
  - Developed the Guardian Angel app using Kotlin, taking advantage of its concise syntax and powerful features for robust Android application development.

###  :hammer: Build
# Guardian Angel Mobile App Build Instructions

## Prerequisites:
- Android Studio installed
- Kotlin development environment set up

## Build Steps:
1. Clone the Guardian Angel repository to your local machine.
2. Open Android Studio and select "Open an existing Android Studio project."
3. Navigate to the cloned repository and select the "app" folder.
4. Ensure that the necessary dependencies are resolved by syncing the project with Gradle files.
5. Build and run the app on an Android emulator or a connected device.

## Additional Notes:
- Make sure to configure the Firebase integration with your project.
- Adjust API keys and other credentials as needed.
- For detailed debugging and testing, use the Android Studio tools and emulators.

# Guardian Angel MATLAB Build Instructions

## Prerequisites:
- MATLAB installed
- Simulink support installed
- ThingSpeak account for channel integration

## Build Steps:
1. Clone the Guardian Angel repository to your local machine.
2. Navigate to the MATLABScripts directory.
3. Open the LaneMaintainSystem.slx file in MATLAB.
4. Ensure all required MATLAB toolboxes are available.
5. Set up a ThingSpeak channel for data integration.
6. Run the MATLAB scripts, ensuring data is being transmitted to ThingSpeak.
7. Adjust parameters and scripts as needed based on simulation results.

## Additional Notes:
- Ensure proper channel configuration in ThingSpeak for data transmission.
- Debug and test simulations in MATLAB to validate collision prediction and advisory control.
- Update MATLAB scripts based on the project requirements and integration specifications.

### :rocket: Deployment
# Guardian Angel Mobile App Deployment Instructions

## Prerequisites:
- Android device or emulator
- Guardian Angel app APK file

## Deployment Steps:
1. Ensure your Android device allows installations from unknown sources.
2. Download the Guardian Angel APK file to your Android device.
3. Open the device's File Manager and locate the downloaded APK file.
4. Tap on the APK file to initiate the installation process.
5. Follow the on-screen instructions to complete the installation.
6. Once installed, open the Guardian Angel app.
7. Log in with your credentials or sign in using Google.
8. Enter the required health metrics and travel information as prompted.

## Additional Notes:
- Grant necessary permissions to the app for optimal functionality.
- Ensure a stable internet connection for real-time data synchronization.
- Regularly update the app for the latest features and improvements.

# Guardian Angel MATLAB Deployment Instructions

## Prerequisites:
- MATLAB installed
- Simulink support installed
- ThingSpeak account for channel integration

## Deployment Steps:
1. Clone the Guardian Angel repository to your local machine.
2. Navigate to the MATLABScripts directory.
3. Open the LaneMaintainSystem.slx file in MATLAB.
4. Ensure all required MATLAB toolboxes are available.
5. Set up a ThingSpeak channel for data integration.
6. Configure MATLAB scripts with appropriate parameters and integration details.
7. Run the MATLAB scripts for simulation and data analysis.
8. Validate results and adjust parameters as needed for accurate predictions.

## Additional Notes:
- Ensure proper ThingSpeak channel configuration for data transmission.
- Keep MATLAB scripts updated based on project requirements.
- Regularly test simulations to ensure collision prediction and advisory control accuracy.

 ###  :fire: Contribution

 # Contribution Summary

## Kavya Chandrika Vempalli

Contributions:
- Developed the advisory control functionality for MATLAB.
- Worked on the integration of ThingSpeak, ensuring seamless data transmission.

## Rishitej Yadav Pallapothu

Contributions:
- Designed and implemented the home page and symptoms page in the Guardian Angel app.
- led the Integration Google APIs to enhance the functionality of the application.

## Asish Addanki

Contributions:
- creation of the login page and road conditions page in the Guardian Angel app.
- Implemented and managed the databases across the application for efficient data storage and retrieval.


## :question: FAQ
## Q1: What is Guardian Angel?

**A:** Guardian Angel is a personalized application designed for individuals with diabetes, integrating health monitoring and travel-specific features to enhance overall well-being and safety.

## Q2: How does Guardian Angel ensure safety during travel?

**A:** The app analyzes health metrics and travel plans using MATLAB, identifying potential collision risks. In emergencies, Guardian Angel triggers an immediate response for user safety.

## Q3: What health metrics does Guardian Angel monitor?

**A:** Guardian Angel monitors Heart Rate, Respiratory Rate, and Blood Sugar levels. Users can input this information for real-time health tracking.

## Q4: How does Guardian Angel incorporate context monitoring?

**A:** Guardian Angel employs context monitoring to synthesize diverse data sources, including health metrics and travel conditions. This comprehensive approach allows the app to offer personalized insights and proactive safety measures.

## Q5: What travel-specific features does Guardian Angel offer?

**A:** Guardian Angel provides insights into road conditions, traffic, and potential collisions. It integrates with Google APIs for real-time mapping and travel recommendations.

Feel free to reach out if you have more questions or need further clarification!


## :star2: Credit/Acknowledgment
Rishitej Yadav Pallapothu
,Asish Addanki
,Kavya Chandrika Vempalli
