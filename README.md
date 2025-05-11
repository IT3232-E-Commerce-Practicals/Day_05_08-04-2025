# Spring Boot CRUD Application – Students and Courses

This project is a basic Spring Boot REST API that demonstrates **generic CRUD operations** using a reusable `CRUDController` class. The API supports operations on `Course` and `Student` entities.

## 🔧 Technologies Used

- Java 17+
- Spring Boot 3.x
- Maven
- RESTful Web Services
- In-memory data structures (Map/List)
---

## 🧠 How It Works

### ✅ `CRUDController<K, T>`

A **generic controller class** to handle common CRUD operations for any data type `T` identified by key `K`.

Supports:
- `GET /` — Get all entries
- `POST /add/{id}` — Add new entry
- `PUT /update/{id}` — Update existing entry
- `DELETE /delete/{id}` — Delete entry



### 🎓 `StudentController`

Extends `CRUDController<String, Student>` and contains some custom endpoints if needed.

**Base URL:** `/student`

## 📁 API Endpoints
#### 1. List All Students (GET)
Endpoint: 
```
http://localhost:8080/student/
```
Response:
```
{
    "2020ICT95": {
        "regNo": "2020ICT95",
        "name": "Saduni",
        "age": 30,
        "course": "AMC",
        "gpa": 3.25
    },
    "2020ASB88": {
        "regNo": "2020ASB88",
        "name": "Nimna",
        "age": 23,
        "course": "BIO Science",
        "gpa": 4.0
    },
    "2020ICT56": {
        "regNo": "2020ICT56",
        "name": "Pabodha",
        "age": 25,
        "course": "IT",
        "gpa": 3.59
    },
    "2020CS31": {
        "regNo": "2020CS31",
        "name": "Ruwini",
        "age": 24,
        "course": "CS",
        "gpa": 3.8
    },
    "2020ICT47": {
        "regNo": "2020ICT47",
        "name": "Maleesha",
        "age": 23,
        "course": "IT",
        "gpa": 3.66
    }
}
```

Output:

<img width="959" alt="image" src="https://github.com/user-attachments/assets/dc9757ef-dc4e-43aa-ae35-75dc62fcda7b" />


#### 2. Add a new student (PosT)
Endpoint: 
```
http://localhost:8080/student/add/2023ICT03
```
Input:
```
{
    "regNo":"2023ICT03",
    "name": "Kavishka",
    "age": 24,
    "course":"ICT",
    "gpa": 3.76
}
```
Response:
```
New object is added
```

Output:
<img width="959" alt="image" src="https://github.com/user-attachments/assets/9dd41256-5e43-4531-bce0-542f3023676b" />


#### 3. Delete a student (DELETE)
Endpoint: 
```
http://localhost:8080/student/delete/2021BIO23
```
Response:
```
The Details are Deleted
```

Output:
<img width="959" alt="image" src="https://github.com/user-attachments/assets/3bb3c5d6-08b8-4dca-a9b8-60846f73de8f" />


#### 4. Update an exising student (PUT)
Endpoint: 
```
http://localhost:8080/student/update/2022ASP02
```
Input:
```
{
    "regNo":"2022ASP02",
    "name": "Nirmani",
    "age": 24,
    "course":"CS",
    "gpa": 3.76
}
```
Response:
```
The details are updated
```

Output:
<img width="959" alt="image" src="https://github.com/user-attachments/assets/8c4029a9-b275-4e89-9318-ff1d1ef4342b" />






---
### 📘 `CourseController`

Extends `CRUDController<String, Course>`, automatically providing full CRUD support.

**Base URL:** `/course`



## 📁 API Endpoints
#### 1. List All Courses (GET)
Endpoint: 
```
http://localhost:8080/student/
```
Response:
```
{
    "IT3232": {
        "code": "IT3232",
        "name": "E-Commerce",
        "credits": 2
    },
    "IT2234": {
        "code": "IT2234",
        "name": "Web Service And Server Technology",
        "credits": 4
    },
    "CSC3132": {
        "code": "CSC3132",
        "name": "Web Application Development",
        "credits": 2
    }
}
```

Output:
<img width="959" alt="image" src="https://github.com/user-attachments/assets/271d4a86-8d17-47b4-9815-609c2012cfd7" />



#### 2. Add a new course (POST)
Endpoint: 
```
http://localhost:8080/course/add/IT1113
```
Input:
```
{
    "code":"IT1113",
    "name":"Information Technology",
    "credits":3
}
```
Response:
```
New object is added
```

Output:
<img width="959" alt="image" src="https://github.com/user-attachments/assets/ce2f271d-54c9-4cf2-b29f-54b6fc079608" />



#### 3. Delete a course (DELETE)
Endpoint: 
```
http://localhost:8080/course/delete/CSC3132
```
Response:
```
The Details are Deleted
```

Output:
<img width="959" alt="image" src="https://github.com/user-attachments/assets/81f5d57f-5ffe-448b-bb55-6671ce2e2252" />



#### 4. Update an exising course (PUT)
Endpoint: 
```
http://localhost:8080/course/update/IT2234
```
Input:
```
{
    "code":"IT2234",
    "name":"Web Service And Server Technology II",
    "credits":4
}
```
Response:
```
The details are updated
```

Output:
<img width="959" alt="image" src="https://github.com/user-attachments/assets/fae81f35-9d95-40a2-bb44-6f6778851abf" />





