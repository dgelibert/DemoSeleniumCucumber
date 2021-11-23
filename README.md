# Demo Selenium Cucumber

This is a POC using cucumber with selenium to test a web application

### 1. Installation instructions
#### Prerequisites : 
* Maven 3.6.+
* chocolatey (for Windows) or homebrew (for MacOS)

#### WebDrivers :
This project will use selenium and it's required to have WebDrivers installed to be able to run the cucumber tests.

1. To install the WebDrivers on Windows :

Open a Powershell prompt with administrator privileges and execute the following command :
```shell
    choco install selenium-all-drivers
```
2. To install the WebDrivers on MacOS :

Open a terminal and execute the following commands : 
```shell
    brew install --cask chromedriver
    brew install geckodriver
```

### 2. Running the project
Open a terminal or a cmd prompt at the project root and execute the following command :
```shell
    mvn clean install
```

