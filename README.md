# Simpleroot

Simpleroot is a Spring Boot application that provides a RESTful API for managing user data. It allows you to perform CRUD operations (Create, Read, Update, Delete) on user records.

## Features

- Create a new user
- Retrieve a list of all users
- Update an existing user
- Delete a user
- Get a user by ID
- Get a user by ID and address

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)
- ModelMapper
- Lombok

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/simpleroot.git
    ```
2. Navigate to the project directory:
    ```sh
    cd simpleroot
    ```
3. Build the project:
    ```sh
    mvn clean install
    ```

### Running the Application

You can run the application using the following command:
```sh
mvn spring-boot:run
```
The application will start running on [http://localhost:8080](http://localhost:8080).

## API Endpoints

- `GET /api/v1/user/getUsers`: Retrieve a list of all users
- `POST /api/v1/user/saveUser`: Create a new user
- `PUT /api/v1/user/updateUser`: Update an existing user
- `DELETE /api/v1/user/deleteUser`: Delete a user
- `GET /api/v1/user/getUserByUserID/{userID}`: Get a user by ID
- `GET /api/v1/user/getUserByIdAndAddress/{userID}/{address}`: Get a user by ID and address

## Testing

The project includes a simple test case (`SimplerootApplicationTests.java`) to verify the application context loads correctly. You can run the tests using the following command:
```sh
mvn test
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the Apache License 2.0.
