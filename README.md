# ☕ Java Setup Guide for Windows + VS Code

This guide walks you through installing Java on your Windows PC and configuring Visual Studio Code (VS Code) for Java development.

---

## 🛠️ Prerequisites

- Windows 10 or 11
- Internet connection
- Administrator access

---

## 1️⃣ Install Java Development Kit (JDK)

### 🔹 Step 1: Download JDK
- Visit the official Oracle JDK page: [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)
- Alternatively, use OpenJDK: [https://adoptium.net](https://adoptium.net)
- Choose the latest **LTS version** (e.g., Java 17 or Java 21)

### 🔹 Step 2: Install JDK
- Run the installer and follow the prompts
- Default install path: `C:\Program Files\Java\jdk-<version>`

### 🔹 Step 3: Set Environment Variables
1. Open **System Properties** → Advanced → Environment Variables
2. Under **System Variables**, click `New`:
   - **Variable name**: `JAVA_HOME`
   - **Variable value**: `C:\Program Files\Java\jdk-<version>`
3. Edit the `Path` variable:
   - Add: `%JAVA_HOME%\bin`

### ✅ Verify Installation
Open Command Prompt and run:
```bash
java -version
javac -version