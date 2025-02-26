# Spring Boot Command Line Application

This repository contains a simple Spring Boot command line application for students of the HSLU Enterprise Programming Lab (ENLAB) module. The application demonstrates how to create a command line runner in Spring Boot that takes two integer parameters and outputs their sum.

## Features

- Spring Boot CommandLineRunner implementation
- Command line argument processing
- Unit testing of command line applications
- Maven build configuration

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6 or higher

### Running the Application

You can run the application using the provided shell script:

```bash
./run.sh 1 2
```

This will output: `The sum of 1 and 2 is: 3`

### Running Tests

To run the tests, use Maven:

```bash
./mvnw test
```

## Project Structure

- `src/main/java/ch/hslu/enlab/cmdline/SumApplication.java`: Main application class
- `src/test/java/ch/hslu/enlab/cmdline/SumApplicationTests.java`: Test class
- `src/main/resources/application.properties`: Application configuration
- `run.sh`: Shell script to run the application

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

Thorben Stangenberg (thorben.stangenberg@hslu.ch)

## For HSLU Students

This example is provided for educational purposes as part of the HSLU Enterprise Programming Lab module. Feel free to use it as a reference for your own projects.
