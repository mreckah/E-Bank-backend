# E-Bank Backend

<h1 align="center">
  <a href="https://github.com/mreckah">
    <img height="100" width="200" src="images/img_13.png" alt="e-Bank App" style="max-width: 300px ; border-radius: 10px;">
  </a>
</h1>
<p align="center">
  &nbsp;    
  <a target="_blank" href="https://www.linkedin.com/in/nabbar-oussama/">
    <img height="20" src="https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white" alt="LinkedIn Badge" />
  </a>
  <a href="mailto:m.reckahwalt@gmail.com" target="_blank" onclick="window.open(this.href,'_blank'); return false;">
    <img height="20" src="https://img.shields.io/badge/Gmail-D14836?style=flat&logo=gmail&logoColor=white" alt="Gmail Badge" />
  </a>
  <a target="_blank" href="https://github.com/mreckah">
    <img height="20" src="https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white" alt="GitHub Badge" />
  </a>
</p>

A robust banking backend system built with Spring Boot, providing comprehensive banking operations management with customer and account management features.

## Features

### Customer Management

- **Create Customer**: Add new customers with their personal information
- **Read Customer**: View customer details including their accounts
- **Update Customer**: Modify customer information
- **Delete Customer**: Remove customers from the system
- **Search Customers**: Search customers by name or other criteria

### Account Management

- **Account Types**:
  - Current Accounts (with overdraft facility)
  - Savings Accounts (with interest rate)
- **Account Operations**:
  - Debit: Withdraw money from accounts
  - Credit: Deposit money into accounts
  - Transfer: Transfer money between accounts
- **Account History**: View transaction history
- **Account Details**:
  - Account ID
  - Account Type
  - Balance
  - Customer Information
  - Creation Date
  - Status
  - Overdraft Limit (for Current Accounts)
  - Interest Rate (for Savings Accounts)

## Technical Stack

### Backend

- Spring Boot 3.4.5
- Spring Data JPA
- MySQL Database
- H2 Database (for development)
- Lombok
- SpringDoc OpenAPI (Swagger)

## Project Structure

```
ebank-backend/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/ebankbackend/
│       │       ├── controllers/    # REST Controllers
│       │       ├── services/       # Business Logic
│       │       ├── repositories/   # Data Access Layer
│       │       ├── entities/       # JPA Entities
│       │       ├── dtos/          # Data Transfer Objects
│       │       ├── mappers/       # Object Mappers
│       │       ├── enums/         # Enumerations
│       │       └── exceptions/    # Custom Exceptions
│       └── resources/
│           └── application.properties
└── pom.xml
```

## API Endpoints

### Customer Endpoints

- `GET /customers` - List all customers
- `GET /customers/{id}` - Get customer by ID
- `GET /customers/search?keyword={keyword}` - Search customers
- `POST /customers` - Create new customer
- `PUT /customers/{id}` - Update customer
- `DELETE /customers/{id}` - Delete customer

### Account Endpoints

- `GET /accounts` - List all accounts
- `GET /accounts/{id}` - Get account by ID
- `GET /accounts/{id}/operations` - Get account operations
- `POST /accounts/debit` - Debit operation
- `POST /accounts/credit` - Credit operation
- `POST /accounts/transfer` - Transfer operation

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven
- MySQL 8.0 or higher

### Setup and Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/mreckah/E-Bank-backend.git
   cd ebank-backend
   ```

2. Configure the database:

   - Update `application.properties` with your MySQL credentials
   - Or use the default H2 database configuration for development

3. Build the project:

   ```bash
   ./mvnw clean install
   ```

4. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

5. Access Swagger UI:
   - Open your browser and navigate to: `http://localhost:8080/swagger-ui.html`

## Database Schema

The application uses a table-per-class inheritance strategy for account types:

- `Customer`: Stores customer information
- `BankAccount`: Base class for all account types
- `CurrentAccount`: Extends BankAccount with overdraft facility
- `SavingsAccount`: Extends BankAccount with interest rate
- `Operation`: Stores all banking operations

## Screenshots and Test Results

### Database Connection

_Successful connection to MySQL database_
![img.png](images%2Fimg.png)

### Customer Management

#### Swagger UI Tests

_GET - List all customers_
![img_4.png](images%2Fimg_4.png)

_POST - Create new customer_
![img_5.png](images%2Fimg_5.png)

_PUT - Update customer_
![img_6.png](images%2Fimg_6.png)

_DELETE - Remove customer_
![img_7.png](images%2Fimg_7.png)

### Account Operations

#### Postman & Swagger Tests

_GET - Retrieve account details_
![img_8.png](images%2Fimg_8.png)

_POST - Create new Transfer_
![img_9.png](images%2Fimg_9.png)

_POST - Create new Credit_
![img_11.png](images%2Fimg_11.png)

_POST - Create new Debit_
![img_12.png](images%2Fimg_12.png)

_GET - Retrieve account operations_
![img_10.png](images%2Fimg_10.png)

### Database Tables

_Customer table structure and sample data_
![img_1.png](images%2Fimg_1.png)

_Bank Account table structure and sample data_
![img_3.png](images%2Fimg_3.png)

_Operations table structure and sample data_
![img_2.png](images%2Fimg_2.png)

## Security

### Authentication

The application now uses JWT (JSON Web Token) based authentication.

### Available Users

- Regular User:

    - Username: `oussama`
    - Password: `pass`
    - Role: `USER`

- Admin User:
    - Username: `mreckah`
    - Password: `pass`
    - Roles: `USER`, `ADMIN`

### Security Features

- JWT-based authentication
- Role-based authorization
- Stateless session management
- CORS enabled for all origins
- CSRF protection disabled (as it's a REST API)

### Testing Security in Swagger
-Unauthorized access attempt (Error 401)'
![img_14.png](images%2Fimg_14.png)

- 🔙 **Backend Repository**:
  > 🔗 This backend connects to the [Digital Banking Frontend](https://github.com/mreckah/DigitalBanking-front), an Angular application that consumes the REST API and handles all core banking logic and data management.

