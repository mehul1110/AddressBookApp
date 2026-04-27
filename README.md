# Address Book Application

The **Address Book Application** is a Spring Boot-based backend service designed to manage contact information efficiently. It provides a RESTful API for performing CRUD operations on address book entries. This project follows clean code principles and demonstrates various enterprise-grade features in Spring Boot.

## 🚀 Key Features

- **RESTful API**: Intuitive endpoints for creating, reading, updating, and deleting address book entries.
- **N-Tier Architecture**: Well-defined layers including Controller, Service, Model, and DTO.
- **Data Validation**: Integrated JSR-303 validation to ensure data consistency and integrity.
- **Global Exception Handling**: Centralized error management for standardizing API responses.
- **Logging**: Robust logging using Slf4j for monitoring application flow and debugging.
- **Profile Management**: Support for environment-specific configurations (e.g., development, production).

## 🛠️ Technologies Used

- **Java 21**
- **Spring Boot 4.0.5**
- **Maven**
- **Lombok**
- **JPA / Hibernate**
- **MySQL** (Placeholder Configuration)

## 📋 Implemented Use Cases (UC)

The application was built following an incremental development approach:

- **UC 1**: **Project Setup**: Initialized the project using Spring Initializr with dependencies like **Spring Web**, **Lombok**, **Validation**, and **Spring Data JPA**. Established the base package structure.
- **UC 2**: **REST Controller**: Created a placeholder `AddressBookController` to handle HTTP requests. Implemented `GET`, `POST`, `PUT`, and `DELETE` endpoints returning initial response messages.
- **UC 3**: **DTO & Model**: Developed `AddressBookDTO` for data transfer and `AddressBookData` for the core entity. Included fields such as `fullName`, `address`, `city`, `state`, `zip`, and `phoneNumber`.
- **UC 4**: **Service Layer Abstraction**: Introduced the `IAddressBookService` interface to define business logic contracts and a unified `ResponseDTO` to standardize API responses with a message and data object.
- **UC 5**: **In-Memory CRUD**: Implemented the service layer logic using a `List<AddressBookData>` to store and manage contact information in memory, enabling full CRUD functionality.
- **UC 6**: **Lombok Integration**: Refactored the project to use **Lombok** annotations like `@Data`, `@NoArgsConstructor`, and `@AllArgsConstructor`, significantly reducing boilerplate code for getters, setters, and constructors.
- **UC 7**: **Logging with Slf4j**: Integrated the **Slf4j** logging framework. Added logging statements at various levels (Info, Debug) to track request processing and service execution.
- **UC 8**: **Profile & Properties Configuration**: Configured `application.properties` to support multiple environment profiles (e.g., `dev`). Set custom logging levels and application metadata.
- **UC 9**: **Database Placeholders**: Added configuration placeholders for **MySQL** in `application-dev.properties`, including datasource URL, username, and password, preparing for database persistence.
- **UC 10**: **Bean Validation**: Implemented robust request body validation using **JSR-303** annotations. Added `@Pattern` for name and phone number formats and `@NotEmpty` for address-related fields in `AddressBookDTO`.
- **UC 11**: **Global Validation Handler**: Developed a `@RestControllerAdvice` to handle `MethodArgumentNotValidException`. This ensures validation errors are returned as a structured JSON response to the client.
- **UC 12**: **Custom Exception Handling**: Created a custom `AddressBookNotFoundException` to handle cases where an entry is not found by ID. Integrated this exception with the global handler for consistent error reporting.

## ⚙️ Setup and Installation

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   ```
2. **Build the project**:
   ```bash
   mvn clean install
   ```
3. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```
