# E-Bank Backend

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

![img.png](images%2Fimg.png)
_Successful connection to MySQL database_

### Database Tables

![img_1.png](images%2Fimg_1.png)
_Customer table structure and sample data_

![img_3.png](images%2Fimg_3.png)
_Bank Account table structure and sample data_

![img_2.png](images%2Fimg_2.png)
_Operations table structure and sample data_

