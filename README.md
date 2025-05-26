# Alarm App

A simple Android Alarm application built with **Jetpack Compose** and **Kotlin**. Users can set a specific alarm time using a time picker, and the app will trigger a system-level alarm with a notification at the specified time—even when the device is idle.

---

## Features

-  Real-time digital clock
-  TimePicker dialog for selecting alarm time
-  Alarm notifications using `AlarmManager`
-  Custom notification with title and message
-  Supports `setExactAndAllowWhileIdle` for idle devices
-  Permission handling for Android 13+ (`POST_NOTIFICATIONS`, `SCHEDULE_EXACT_ALARM`)

---

## Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **AlarmManager**
- **PendingIntent**
- **NotificationCompat**
- **BroadcastReceiver**
- **TimePickerDialog**

---

## Screenshot

![image](https://github.com/user-attachments/assets/ad962068-9bf0-4fda-bcd6-9303825b21dd)

![image](https://github.com/user-attachments/assets/2b8beec8-a2f5-41a5-a1c0-eff174e5b65a)

