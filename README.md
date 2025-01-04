# Meeting Platform Backend

This project implements the backend for a meeting platform that allows users to register, log in, and access a Jitsi meeting room. The backend is built using **Spring Boot** and **H2 Database**, with **Spring Security** for authentication. The frontend will be implemented separately using **Angular**.

## Features Implemented

- **User Registration**: Users can create accounts with a username and password.
- **User Authentication**: Users can log in using basic authentication (username and password).
- **Jitsi Integration**: After successful login, users are redirected to a Jitsi meeting room, where they can choose a username and join the meeting.
- **H2 In-Memory Database**: Used for storing user data temporarily (useful for development and testing).
- **Spring Security**: Secures the API and provides basic authentication.

## Project Structure

- `src/main/java/com/example/meeting`: Contains the backend implementation.
    - **Entities**: Defines the `User` entity for the database.
    - **Repository**: Manages user data with `UserRepository`.
    - **Service**: Handles user registration and login logic.
    - **Controller**: Provides endpoints for user registration and login.
    - **SecurityConfig**: Configures Spring Security to handle authentication and CORS for the Angular frontend.

- `src/main/resources/application.properties`: Configures the application, including database setup and Spring Security.

## Setup and Run

### 1. Clone the repository

Run the following command to clone the repository and navigate into the project folder:

git clone https://github.com/amineasri/meeting.git cd meeting 


### 2. Configure H2 Database

The project is set up to use an **in-memory H2 database** for development and testing. You can access the H2 database console by navigating to:

http://localhost:8080/h2-console

### 3. Access the API

- **Register**: POST `/api/users/register`  
  Request body:  
  json :
  {
    "username": "your-username",
    "password": "your-password"
  }
- **Login**: POST `/api/users/login`  
  Request body:  
  json :
  {
    "username": "your-username",
    "password": "your-password"
  }


  ## 4. CORS Configuration

CORS has been enabled to allow requests from the Angular frontend . When the Angular app is ready, it can make API requests to the backend without running into CORS issues.

## Angular Frontend (To Be Implemented)

Your task is to create the Angular frontend that interacts with this backend.

### Angular Features:

- **Registration and Login Pages**: Users should be able to register and log in.
- **Jitsi Redirection**: After a successful login, users should be redirected to a Jitsi meeting room, where they can choose a username and join the meeting.

### Required Actions:

1. Set up the Angular app to handle user registration and login.
2. Make API calls to the backend for user registration and login.
3. After login, redirect the user to a Jitsi meeting room with the chosen username.
4. Implement the frontend design using **Angular** and ensure it works seamlessly with the Spring Boot backend.

---

### Notes for Angular Development

- Make sure to use **Angular's HttpClient** to communicate with the backend.
- The backend currently uses **Basic Authentication** (username and password). You'll need to send the credentials in the request headers.
- The `H2` database is configured to be in-memory for development, but for production, you might want to change this to a persistent database configuration.

## Final Notes

- Once the frontend is implemented, the full application should allow users to create an account, log in, and be redirected to a Jitsi meeting room to join a call.

If you have any questions or need further assistance, feel free to ask!

---

### To-Do for Your Teammate (Angular Frontend):

- Set up the Angular project.
- Implement the **registration** and **login** forms.
- Call the backend's **register** and **login** APIs from the frontend.
- After logging in, redirect the user to the **Jitsi meeting room** with a username input for joining the meeting.
