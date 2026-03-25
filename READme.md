# 💰 Smart Expense Tracker with Multithreaded Chat

## 🚀 Overview

This project is a Java-based application that combines **expense tracking** with a **multithreaded chat system**.
It demonstrates core Java concepts such as **Object-Oriented Programming (OOP), multithreading, synchronization, collections, and exception handling**.

The system allows users to:

* Split expenses among a group
* Track balances
* Simulate real-time chat using threads

---

## ✨ Features

* 💸 Expense splitting among users
* 📊 Balance calculation
* 🧵 Multithreaded chat simulation
* 🔒 Thread synchronization using `wait()` and `notifyAll()`
* 🧠 Clean OOP-based design

---

## 🏗️ Project Structure

```
src/
 ├── model/
 │    ├── User.java
 │    ├── Message.java
 │
 ├── service/
 │    ├── ExpenseService.java
 │
 ├── chat/
 │    ├── ChatRoom.java
 │
 ├── threads/
 │    ├── UserThread.java
 │
 └── Main.java
```

---

## ⚙️ Technologies Used

* Java (Core)
* Multithreading
* Collections Framework
* Synchronization (`synchronized`, `wait()`, `notifyAll()`)

---

## ▶️ How to Run

### Step 1: Compile

```
javac */*.java Main.java
```

### Step 2: Run

```
java Main
```

---

## 🧪 Sample Output

```
=== Expense Summary ===
Alice: 250.0
Bob: -250.0

=== Chat Simulation Started ===
Alice: Message 1
Bob: Message 1
Alice: Message 2
Bob: Message 2
Alice: Message 3
Bob: Message 3
```

---

## 🧠 Concepts Used

### Object-Oriented Programming

* Classes: `User`, `Message`
* Encapsulation and modular design

### Multithreading

* Each user is represented as a separate thread

### Synchronization

* Controlled execution using:

  * `synchronized`
  * `wait()`
  * `notifyAll()`

### Collections

* `ArrayList` used for storing users and messages

---

## 🔥 Key Learning

* Handling race conditions in multithreading
* Coordinating threads using shared resources
* Designing modular Java applications
* Applying OOP in real-world problems

---

## ⚠️ Limitations

* Console-based application
* Supports only two users (fixed turn system)
* No GUI or database integration

---

## 🚀 Future Enhancements

* Add GUI (JavaFX / Web interface)
* Support multiple users dynamically
* Add database (JDBC)
* Real-time chat using sockets

---

## 👨‍💻 Author

Vishwesh Singh

---

## 📌 Note

This project was developed as part of a **Java Programming ** course to demonstrate practical implementation of core concepts.
