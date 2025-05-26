# Alarm App

An alarm application built with **Jetpack Compose** in **Kotlin**. This app lets users set daily alarms, shows real-time clock updates, and sends notifications at the scheduled time—even if the app is closed or swiped away.

---

## Features

-  Live display of current time
-  Schedule alarms using a time picker
-  Alarm notification appears at the selected time
-  Works while idle or after app is closed/swiped
-  Requests necessary permissions (e.g., **Post Notifications**, **Exact Alarms**) dynamically

---

##  Development Process

1. **Real-Time Clock Display**  
   Updates every second to show current time on screen.

2. **Alarm Setup**  
   Opens a time picker dialog for users to select alarm time.

3. **Notification Trigger**  
   At the scheduled time, the app wakes and shows a notification.

4. **Runs in Background**  
   Uses `AlarmManager.setExactAndAllowWhileIdle()` and `BroadcastReceiver` to function even after the app is swiped away or the device is idle.

---

##  Challenges

- Understanding and handling **runtime permissions** in Android 13+:
  - `POST_NOTIFICATIONS`
  - `SCHEDULE_EXACT_ALARM`
- Learning how to **schedule alarms** with `AlarmManager` that persist and trigger even when:
  - The app is closed

---

##  Tech Stack

-  **Kotlin**
-  **Jetpack Compose**
-  **AlarmManager**, **PendingIntent**, **BroadcastReceiver**
-  **Material 3**
-  **Android Studio**

---

## Screenshot

![image](https://github.com/user-attachments/assets/ad962068-9bf0-4fda-bcd6-9303825b21dd)

![image](https://github.com/user-attachments/assets/2b8beec8-a2f5-41a5-a1c0-eff174e5b65a)

