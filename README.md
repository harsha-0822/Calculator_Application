# 🧮 Premium Glass Calculator

A **Full Stack Java Web Application** that performs real-time arithmetic and scientific operations with a **modern glassmorphic UI** design and dynamic AJAX backend — built using **HTML, CSS, JavaScript, and Java Servlets**.

---

## 🪄 Project Overview

**Project Name:** Premium Glass Calculator  
**Developer:** Harshavardhan S M  
**IDE:** Eclipse IDE for Enterprise Java Developers  
**Server:** Apache Tomcat v10.1  
**Languages Used:** HTML, CSS, JavaScript, Java (Servlets)

---

## ✨ Features

- 💎 **Glassmorphic UI:** Elegant, futuristic, and animated design  
- ⚙️ **Dynamic AJAX Operations:** Instant results without reloading pages  
- 🔢 **Basic Arithmetic:** Add, Subtract, Multiply, Divide  
- 🧠 **Scientific Functions:** sin, cos, tan, log, ln, sqrt, square, inverse, π, e  
- ⚡ **Responsive Design:** Works on both desktop and mobile  
- 🎯 **Error Handling:** Displays proper messages for invalid inputs  

---

## 📁 Project Structure

CalculatorApp/
│
├── src/
│ └── com/cec/servlets/
│ └── CalculatorServlet.java
│
├── WebContent/
│ └── index.html
│
├── screenshots/
│ ├── Home UI.png
│ ├── Normal Operations.png
│ ├── Scientific Function.png
│ ├── Error Handling.png
│ └── Eclipse Project Structure.png
│
├── .classpath
├── .project
└── build/

---

## 🧠 How It Works

- The **frontend (index.html)** handles user interaction and sends input data using `fetch()`  
- The **backend (CalculatorServlet.java)** processes the request, performs calculation, and returns the result  
- The result is displayed instantly on the same page without any reload  

---

## ⚙️ Steps to Run the Project

1. Open **Eclipse IDE → File → New → Dynamic Web Project**  
2. Project Name → `CalculatorApp`  
3. Set **Target Runtime:** `Apache Tomcat v10.1`  
4. Paste the files into your workspace  
5. Right-click → **Run As → Run on Server**  
6. Open your browser and visit:  
   🌐 `http://localhost:8080/CalculatorApp/index.html`

✅ You’ll see the glass calculator running with smooth animations and instant results.

---

## 🖼️ Screenshots

### 🏠 Home UI
![Home UI](./screenshots/Home%20UI.png)

---

### ➕ Normal Operations
Example: `8 + 2 = 10`
![Normal Operations](./screenshots/Normal%20Operations.png)

---

### 🧮 Scientific Function
Example: `sin(30)`, `5^2`, `log(10)`
![Scientific Function](./screenshots/Scientific%20Function.png)

---

### ⚠️ Error Handling
Example: `9 ÷ 0`
![Error Handling](./screenshots/Error%20Handling.png)

---

### 🧱 Eclipse Project Structure
![Eclipse Project Structure](./screenshots/Eclipse%20Project%20Structure.png)

---

## 🧑‍💻 Tech Stack

| Category | Technology |
|-----------|-------------|
| Frontend | HTML5, CSS3, JavaScript (AJAX) |
| Backend | Java Servlets |
| Server | Apache Tomcat v10.1 |
| IDE | Eclipse IDE |
| Architecture | MVC-Style Web Application |

---

## 📜 License

This project was developed as part of an academic submission for educational purposes.  
You are free to fork, enhance, and modify it for learning or personal use.

---
