# 📚 Java Day11 Project 2 - Student Course Enrollment System

This is a **Spring Boot** application that manages **Students**, **Courses**, and **Enrollments** using a clean **DTO-based architecture**.  
It demonstrates **CRUD operations**, **DTO mapping**, and **RESTful API** best practices.

---

## ✅ Features
- 👨‍🎓 Manage Students (Create, Read, Update, Delete)
- 📘 Manage Courses (Create, Read, Update, Delete)
- 📝 Enroll Students into Courses
- 🔍 View:
  - All Enrollments
  - Courses by Student ID
  - Students by Course ID
- 🚫 Prevents infinite JSON recursion using **DTOs**
- ✅ Clean layered structure: **Controller → Service → Repository → Entity/DTO**

---

## 🗂️ Project Structure
```
Directory structure:
└── adrin-bershik-c-j-java-day11-proj2/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── request.http
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── training/
    │   │   │           └── day11proj2/
    │   │   │               ├── Day11proj2Application.java
    │   │   │               ├── controller/
    │   │   │               │   ├── CourseController.java
    │   │   │               │   ├── EnrollmentController.java
    │   │   │               │   └── StudentController.java
    │   │   │               ├── dto/
    │   │   │               │   ├── CourseDTO.java
    │   │   │               │   ├── EnrollmentDTO.java
    │   │   │               │   └── StudentDTO.java
    │   │   │               ├── entity/
    │   │   │               │   ├── Course.java
    │   │   │               │   ├── Enrollment.java
    │   │   │               │   └── Student.java
    │   │   │               ├── repository/
    │   │   │               │   ├── CourseRepository.java
    │   │   │               │   ├── EnrollmentRepository.java
    │   │   │               │   └── StudentRepository.java
    │   │   │               └── service/
    │   │   │                   ├── CourseServiceInterface.java
    │   │   │                   ├── CourseServiceInterfaceImplementation.java
    │   │   │                   ├── EnrollmentServiceInterface.java
    │   │   │                   ├── EnrollmentServiceInterfaceImplementation.java
    │   │   │                   ├── StudentServiceImplementation.java
    │   │   │                   └── StudentServiceInterface.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── training/
    │                   └── day11proj2/
    │                       └── Day11proj2ApplicationTests.java
    └── .mvn/
        └── wrapper/
            └── maven-wrapper.properties
```

---

## ⚙️ Technologies Used
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Hibernate**
- **H2 / MySQL** (configurable)
- **Lombok** (for boilerplate code)

---

## 🚀 How to Run
1. **Clone** the repository:
   ```bash
   git clone https://github.com/Adrin-Bershik-C-J/java-day11-proj2.git
   cd java-day11-proj2
