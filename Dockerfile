# Use an official Java runtime as a parent image
FROM openjdk:17

  # Set the working directory in the container
WORKDIR /app

  # Copy the JAR file into the container
COPY target/message-app.jar message-app.jar

  # Expose the port the app runs on
EXPOSE 8081

  # Run the application
ENTRYPOINT ["java", "-jar", "message-app.jar"]
