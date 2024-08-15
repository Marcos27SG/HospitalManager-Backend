## Spring Boot Project - Getting Started

This guide details how to set up and run a Spring Boot project that connects to a PostgreSQL database.

### Prerequisites:

Java Development Kit (JDK) 11 or later (https://www.oracle.com/java/technologies/downloads/)
Maven build tool (https://maven.apache.org/)
PostgreSQL database server (https://www.postgresql.org/)
Installation:

Clone or download the project:
Use Git or download the project ZIP file.

### Set up database connection:

Create a PostgreSQL database:
Follow your PostgreSQL server's instructions to create a database for your project. Note down the database name, username, and password.

Configure application.properties:
Open the src/main/resources/application.properties file and update the following properties with your database credentials:

Properties
```spring.datasource.url=jdbc:postgresql://localhost:5432/<your_database_name> ```
```spring.datasource.username=<your_database_username>  ```

spring.datasource.password=<your_database_password> 

Usa el código con precaución.

Important: Replace <your_database_name>, <your_database_username>, and <your_database_password> with your actual values.

Running the Project:

Open a terminal/command prompt.
Navigate to the project directory: Use the cd command to change directories. For example:
Bash
cd my-spring-boot-project
Usa el código con precaución.

Run the application:
Using Maven (recommended):
Execute the following command:

Bash
mvn spring-boot:run
