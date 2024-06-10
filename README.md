
# AWS Device Farm Web App UI Automation - Mobile Devices

The web application automated testing project is designed to provide comprehensive coverage across all user flows, ensuring thorough testing of the application's functionality. With the ability to run on real mobile and tablet devices in parallel using AWS Device Farm, the project offers scalability and efficiency in test execution. The test script is compatible with any Android device available on AWS Device Farm, allowing for broad device coverage and ensuring that the application performs optimally across various device configurations. By leveraging AWS Device Farm's capabilities for parallel execution, the project enables efficient testing across multiple devices simultaneously, reducing test execution time and accelerating the overall testing process. With its focus on user flow coverage and compatibility with AWS Device Farm, the project aims to deliver reliable and robust automated testing solutions for web applications, ensuring high-quality user experiences across different devices and platforms.




## Tech Stack

**Technology:** Java

**Testing Tool:** Appium

**Design Pattern:** Page Object Model (POM)

**Test Framework:** TestNG

## Features

- Ability to run on AWS Device Farm
- Ability to run locally
- Fullscreen mode
- Android device compatible


## Prerequisites

**Run locally**

- Appium environment should be up and running
- Real device or Emulator should be up and running
- From the project root("src/main/java/core/Base.java") the Chrome driver executable directory must be specified

**AWS Device Farm**

- A project should be created on AWS Device Farm
- Compatible zip file should be generated
- Compatible zip file should be uploaded on device farm
## Run Locally

Clone the project

```bash
  git clone https://github.com/inivossl/PENCS_CP_APP_Tests.git
```

Go to the project directory with the pom.xml file. example

```bash
  cd "project path"
```

Install dependencies

```bash
  mvn install
```

Start the Appium server

```bash
  appium --allow-insecure chromedriver_autodownload
```



## AWS Device Farm Compatible zip File Creation

Go to project directory
```bash
  cd "project absolute path"
```
Update dependencies 
```bash
  mvn clean install -DskipTests
```
Create zip file
```bash
  mvn clean package -DskipTests=true
```
    
## Documentation

[AWS Device Farm Official Documentation](https://docs.aws.amazon.com/devicefarm/latest/developerguide/test-types-appium.html)


## Related

To setup the Appium environment

[Appium](https://appium.io/docs/en/latest/quickstart/)


## Author

[Mahamudul Islam](https://github.com/mahamudulIslamPeas)

**Linkedin: https://www.linkedin.com/in/mahamudul-islam-peas-38bba5183/**

