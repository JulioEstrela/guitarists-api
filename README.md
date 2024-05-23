# Guitarists API
Java | Spring Boot | REST API | Maven

[![Technologies](https://skillicons.dev/icons?i=java,spring,postman,maven)](https://skillicons.dev)

- [Guitarists API](#guitarists-api)
  - [Run](#-run)
      - [Cloning](#1-cloning)
      - [Running the Jar File](#2-running-the-jar-file)
  - [URLs](#urls)
  - [Postman Demo](#postman-demo)

## 🚀 Run
### 1. Cloning:
1. Clone the repository:
   ```sh
   git clone https://github.com/JulioEstrela/guitarists-api.git
2. Navigate to the project directory:
   ```sh
   cd guitarists-api
3. Build the project:  
   You may use mvnw packed-in with the project:
   ```sh
   mvnw clean install
   ```
   or, if you have Maven already installed:
   ```sh
   mvn clean install
4. Run on localhost 8080:
   ```sh
   mvnw spring-boot:run
   ```
   or
   ```sh
   mvn spring-boot:run
### 2. Running the Jar File:
1. Download Jar file:  
   Get the latest release: https://github.com/JulioEstrela/guitarists-api/releases
2. Run on localhost 8080:  
   ```sh
   java -jar guitarists-api-1.0-SNAPSHOT.jar

# URLs:
- `GET` `localhost:8080/guitarists` shows all guitarists
- `POST` `localhost:8080/guitarists` adds guitarist with two required arguments (name, lastName)
- `GET` `localhost:8080/guitarists/lastName` shows guitarist with specified last name (e.g. `../../Hendrix` shows Jimi Hendrix)

# Postman Demo:
- `GET` `localhost:8080/guitarists`
```json
[
    {
        "name": "Jimi",
        "lastName": "Hendrix"
    },
    {
        "name": "Eric",
        "lastName": "Clapton"
    }
]
```
---
- `POST` `localhost:8080/guitarists`  

![image](https://github.com/JulioEstrela/guitarists-api/assets/97416841/50c0e83e-0767-4014-a31b-cb06593620e6)  
```json
{
    "name": "George",
    "lastName": "Harrison"
}
```
---
- `GET` `localhost:8080/guitarists/Harrison`  
```json
{
    "name": "George",
    "lastName": "Harrison"
}
```
