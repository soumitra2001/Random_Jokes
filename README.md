

<h1 align=center>👻 Random_Jokes 😀</h1>

Welcome to the Random_Jokes repository! This application allows users to sign up, add jokes, retrieve random jokes, view their own posted jokes, and get details of all users. It is built using a Java programming language and follows the Model-View-Controller (MVC) architecture.


## Frameworks and Language used

[![JAVA Docs](https://img.shields.io/badge/JAVA-v20.0.1-blue.svg)](https://docs.oracle.com/en/java/)
[![GPLv3 License](https://img.shields.io/badge/Spring_Boot-v3.0.6-yellow.svg)](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)


## Required Dependencies

To run this project, you will need to add the following dependencies to your pom.xml file

`Spring Web`, `Spring Boot Dev Tool`, `Lombok`, `Validation`


## Endpoints
The following are the available endpoints in the Random_Jokes application:

### User Sign Up

* #### Endpoint: /api/signup
* #### Method: POST
* #### Description: Allows a new user to sign up.
* #### Request Body:
    *  `username` (string): The username of the user.
    * `password` (string): The password of the user.
### Add Joke
* #### Endpoint: /api/jokes
* #### Method: POST
* #### Description: Allows a registered user to add a new joke.
* #### Request Body:
    * `joke` (string): The content of the joke.
## Get Random Joke
* #### Endpoint: /api/jokes/random
* #### Method: GET
* #### Description: Retrieves a random joke.
## Get User's Posted Jokes
* #### Endpoint: /api/users/{userId}/jokes
* #### Method: GET
* #### Description: Retrieves the posted jokes of a particular user.
* #### Path Parameters:
    * `userId` (string): The ID of the user.
## Get All Users
* #### Endpoint: /api/users
* #### Method: GET
* #### Description: Retrieves details of all users.
Please note that the actual base URL of the endpoints may vary depending on your local setup or deployment configuration.

## Data Structure used in project :
- List

## Contribution
Contributions to the Todo_Application project are welcome. If you would like to contribute, please refer to the guidelines outlined in the CONTRIBUTING.md file. Bug fixes, feature enhancements, and documentation improvements are highly appreciated.

## Project Summary :

````
 The Random_Jokes application provides various endpoints to perform different operations related to user sign-up, joke management, and user details retrieval. These endpoints can be accessed using HTTP requests.

To use the application, you can either interact with the endpoints directly using tools like `curl` or use a web-based API client like Postman.
 
````


