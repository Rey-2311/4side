# Quiz App

An interactive quiz application built with **Jetpack Compose** in **Kotlin** for Android. This app allows users to take math quizzes, track their progress by name, and even generate new question sets via the AI21 Studio API.

---

## Features

-  Simple **True/False** question format
-  Name-based user tracking with progress saved locally
-  Quiz progress is automatically saved and restored
-  Integrates with **AI21 Studio API** to dynamically generate questions
-  Enhanced UI with Lottie animations and visual feedback
-  Reads and writes quiz data from a local JSON file

---

##  Development Process

1. **Simple Answer UI**  
   Users answer Yes/No to math questions with a clean, tap-friendly interface.

2. **Answer Logic**  
   Verifies answers against `correctAnswer` from the local JSON.

3. **Save User Name**  
   A text field lets users input their name to uniquely track their quiz sessions.
   
4. **Save User Progress**  
   Progress is stored in internal storage per user in `username.txt`.

5. **UI Enhancement**  
   - Colors indicate quiz status: Passed, Failed, Unattempted  
   - Lottie animations show correctness feedback after each question.

6. **AI Integration**  
   New question sets are generated via **AI21 Studio**, replacing or appending to the local `questions.json`.

7. **Bug Fixes**  
   Resolved layout glitches, user unintended activity.

---
   
## 🧗 Challenges

- Managing **UI visibility states** (e.g., quiz screen vs overlay vs result state)
- Learning to use **AI21 Studio's Chat API** to:
  - Send prompts
  - Parse structured responses
  - Integrate with Kotlin Serialization
- Storing and updating a hardcoded `questions.json` file using AI-generated content
- Persisting user-specific progress in internal storage.

---
## Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Material 3**
- **Lottie Animations**
- **Kotlin Serialization**
- **OkHttp**
- **AI21 Studio API**

---

## Screenshot

![image](https://github.com/user-attachments/assets/f2894bbd-4281-43b8-aab9-599246da28c1)

YouTube link: https://youtu.be/AXy9IGb84Dw
