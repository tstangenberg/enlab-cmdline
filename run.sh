#!/bin/bash

# This script runs the Spring Boot application with optional parameters.
# Usage: ./run.sh <param1> <param2>

# Navigate to the project directory
cd "$(dirname "$0")"

# Print the parameters that will be used
echo "Running Spring Boot application with parameters: \"$@\""

# Run the Spring Boot application using Maven with parameters
./mvnw -Dorg.slf4j.simpleLogger.defaultLogLevel=error spring-boot:run -Dspring-boot.run.arguments="$1 $2"