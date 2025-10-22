# Spring Boot Demo Application

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com/yourusername/springboot-demo)
[![Tests](https://img.shields.io/badge/tests-passing-brightgreen)](https://github.com/yourusername/springboot-demo)
[![Coverage](https://img.shields.io/badge/coverage-100%25-brightgreen)](https://github.com/yourusername/springboot-demo)

A simple **Spring Boot 3** application demonstrating REST endpoints with **unit and integration tests**, **Jacoco coverage**, and CLI-based verification.

---

## **Project Structure**

```

springboot-demo/
├─ src/main/java/com/example/demo/
│  ├─ DemoApplication.java
│  └─ controller/
│     └─ HelloController.java
├─ src/test/java/com/example/demo/controller/
│  ├─ HelloControllerUnitTest.java   # Unit tests
│  └─ HelloControllerIT.java         # Integration tests
├─ pom.xml
└─ README.md

````

---

## **Endpoints**

| Endpoint | Method | Description | Example |
|----------|--------|-------------|---------|
| `/hello` | GET    | Returns a greeting | `curl "http://<IP>:8080/hello"` |
| `/greet` | GET    | Personalized greeting | `curl "http://<IP>:8080/greet?name=Prayag"` |
| `/greet` | GET    | Default greeting | `curl "http://<IP>:8080/greet"` |

---

## **Getting Started**

### **1. Compile**
```bash
mvn compile
````

### **2. Run Unit Tests**

```bash
mvn test
```

* Executes **unit tests** (`HelloControllerUnitTest.java`)
* Verifies controller methods without starting Spring context.

### **3. Run Integration Tests**

```bash
mvn verify
```

* Runs **unit + integration tests** (`HelloControllerIT.java`)
* Uses `MockMvc` to test endpoints with full Spring context.

### **4. Generate Jacoco Coverage**

```bash
mvn jacoco:report
```

* Open report at: `target/site/jacoco/index.html`

### **5. Run Application**

```bash
mvn spring-boot:run
```

* Runs Spring Boot app on **port 8080**.

### **6. Test via CLI**

```bash
# Hello endpoint
curl "http://<IP>:8080/hello"

# Greet endpoint with name
curl "http://<IP>:8080/greet?name=Prayag"

# Greet endpoint without name
curl "http://<IP>:8080/greet"
```

---

## **Testing Overview**

| Test Type        | File                           | Purpose                                 |
| ---------------- | ------------------------------ | --------------------------------------- |
| Unit Test        | `HelloControllerUnitTest.java` | Validates individual controller methods |
| Integration Test | `HelloControllerIT.java`       | Verifies endpoints in Spring context    |
| Coverage         | Jacoco                         | Measures test coverage for all tests    |

All tests are **passing**, and endpoints are **verified via curl**.

---

## **Technologies Used**

* Java 17
* Spring Boot 3
* Maven
* JUnit 5
* Spring Boot Test
* Jacoco
* CLI (`curl`)


---

**Author:** Prayag Sangode
**Date:** 16/10/2025


