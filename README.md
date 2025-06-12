
# 🚀 Backend Challenge – Prime Number Checker (Java + Spring Boot)

This is a simple Spring Boot API that accepts a number as input and returns whether it is a prime number or not.

---

## 📌 Challenge Requirement

> Write a simple API endpoint that takes a number as input and returns whether it's a prime number or not. Provide instructions on how to run and test your endpoint locally.

---

## 🧪 Sample API Usage

### ➤ Endpoint

```

GET /is-prime?number=7

````

### ➤ Sample Response

```json
{
  "number": 7,
  "method": "fast",
  "isPrime": true
}
````

---

## 🧑‍💻 Tech Stack

* Java 17+
* Spring Boot 3.x
* Maven

---

## 🔧 How to Run Locally

1. **Clone the Repository**

   ```bash
   git clone https://github.com/Stud-KK/backend-challenge.git
   cd backend-challenge
   ```

2. **Import in Eclipse or IntelliJ**

   * As a Maven Project
   * Locate and run `PrimeApplication.java` as a Java application

   OR run via terminal:

   ```bash
   ./mvnw spring-boot:run
   ```

3. **Test the Endpoint**
   Open your browser or Postman:

   ```
   http://localhost:8080/is-prime?number=19
   ```

---

## 📁 Project Structure

```
src/
 └── main/
     └── java/
         └── com.example.demo/
             ├── PrimeApplication.java     # Main class to bootstrap Spring Boot app
             └── PrimeController.java      # REST controller handling /is-prime endpoint
```

---

## ⚙️ Error Handling

* If the number is negative or zero, it correctly returns `false`.
* Only valid integers are accepted as input.

---

## 📎 Notes

* The `isPrimeFast()` method uses an optimized check to reduce unnecessary iterations.
Below is the screenshot of the task:
![Screenshot (257)](https://github.com/user-attachments/assets/c4deb572-f113-4f7c-909f-77917b52637a)
