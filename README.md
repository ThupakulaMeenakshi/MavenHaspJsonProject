# MyFirstMavenProject 🚀

A beginner-friendly Java application built using **Apache Maven** and **IntelliJ IDEA**. This project demonstrates core Maven concepts, dependency management, and build automation by integrating a third-party library without manual configuration.

## 📌 Features & Concepts Covered
* **Dependency Management**: Leveraged Maven Central Repository to automatically download and manage the **Google GSON** library.
* **Project Structure**: Followed the standard Maven directory structure (`src/main/java`).
* **POM.xml Configuration**: Customized properties, compiler targets (Java 23), and dependencies.
* **Build Automation**: Used Maven lifecycles (`mvn clean package`) to compile code and generate a deployable **JAR** file.

## 🛠️ Technologies Used
* **Language**: Java 23
* **Build Tool**: Apache Maven
* **IDE**: IntelliJ IDEA (Community Edition)
* **Libraries**: Google GSON (v2.11.0)

## 💻 Sample Code Overview
The application creates a Java `HashMap` containing user details and utilizes the **GSON** library to dynamically convert the structured Java data into a clean **JSON** string format.

```java
Gson gson = new Gson();
String jsonResult = gson.toJson(user);
System.out.println(jsonResult);
```

## ⚙️ How to Build and Run

### Prerequisites
Make sure you have **JDK** and **Apache Maven** installed on your local machine and configured in your environment system path.

### 1. Clone the repository
```bash
git clone https://github.com
cd MyFirstMavenProject
```

### 2. Build the project (Generate JAR)
Run the following Maven command in your terminal to clean old builds and package the application:
```bash
mvn clean package
```
This will create a `target` folder containing the compiled `MyFirstMavenProject-1.0-SNAPSHOT.jar` file.

### 3. Execution Output
When run, the console outputs the formatted JSON data safely managed by Maven dependencies:
```text
-----Maven Gson Dependency Output
{"name":"Meenakshi","technology":"Maven & Java","status":"Learning"}
```

## 🎯 Learning Takeaways
Understanding the clear architectural differences between **JAR** (Java Archive) and **WAR** (Web Archive) structures, and executing basic Maven lifecycle phases smoothly.
