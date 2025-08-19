<div align="center">
<h1 align="center">Manual Web Server</h1>
<p align="center">
Web server whitout frameworks, that supports multiple non-concurrent requests
</p>
</div>

</br>

## About
This project is a web server built from scratch in Java without using any frameworks. It manually handles raw HTTP requests, serving both static resources and simple REST services.

The server is capable of:

- Serving static files such as HTML, CSS, JavaScript, and images.
- Responding to RESTful GET and POST requests for specific services.

</br>

## Installation & usage

### Prerequisites

To run this server correctly, you need the following applications installed:
- Java
- Bash
- Git

### Installation

- Clone the repository and navigate into the project directory where the pom.xml is located:

```sh
git clone https://github.com/Andr3xDev/manual-web-server
cd  manual-web-server
```

- Build the project & run it:

```sh
mvn clean verify
java -jar target/webserver-1.0.0.jar
```


The console should display the message of connection:
```
INFO: Server started on port: 35000
```

</br>
</br>

## Test Report

### Acceptance Tests


Manual acceptance tests were performed by requesting different resources to confirm they are served correctly, including:

- index.html

![rest](docs/rest.png)

- script.js

![js](docs/js.png)

- styles.css

![css](docs/test.png)

- image1.png

![image](docs/image.png)

- Not existing resources

![error](docs/not.png)

### Unit Tests

Each unit test serves a specific purpose:

![tests](docs/test.png)
