# Use openjdk 13 as a base image
FROM openjdk:13

# Set Label
LABEL maintainer "kylinsoong.1214@gmail.com"

# Set the working directory to /app
WORKDIR /app

# Copy the runable jar into the container at /app
ADD target/frontend-0.0.4.jar /app

# Make port 8090 available to the world outside this container
EXPOSE 8090

ENV APP_DATACENTER_NAME="local"
ENV APP_VERSION_NUMBER="0.0"
ENV BACKEND_HOST="backend"
ENV BACKEND_PORT="80"

# Run  when the container launches
CMD ["java", "-jar", "frontend-0.0.4.jar"]
