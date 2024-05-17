# 🎬 YouTube Video Interaction Project

Welcome to the **YouTube Video Interaction Project**! This project leverages Java, Selenium, and Cucumber to automate interactions with YouTube, such as searching for videos, playing, pausing, and skipping through them. The project is structured using the Page Object Model (POM) for maintainability and scalability. Below, you'll find detailed information on how to set up, run, and contribute to the project.

## 📋 Table of Contents
1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Setup Instructions](#setup-instructions)
4. [Running the Tests](#running-the-tests)
5. [Project Structure](#project-structure)
6. [Contributing](#contributing)
7. [License](#license)

## 🎉 Introduction
This project demonstrates how to automate YouTube video interactions using Selenium WebDriver and Cucumber. It includes features like:
- Searching for a video
- Clicking on the first video result
- Pausing and playing the video
- Skipping forward in the video

## 🛠️ Prerequisites
Before you begin, ensure you have the following installed:
- Java Development Kit (JDK) 8 or higher
- Maven
- A modern web browser (Chrome, Edge, etc.)
- ChromeDriver or EdgeDriver, depending on your chosen browser

## ⚙️ Setup Instructions
1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/youtube-video-interaction.git
   ```
2. **Navigate to the project directory:**
   ```sh
   cd youtube-video-interaction
   ```
3. **Install dependencies:**
   ```sh
   mvn clean install
   ```

## ▶️ Running the Tests
To run the tests, use the following Maven command:
```sh
mvn test
```
This will execute all Cucumber feature files defined in the project.

## 📁 Project Structure
- **src/main/java/Pages/**: Contains the Page Object Model classes.
- **src/test/java/StepDefinitions/**: Step definitions for Cucumber.
- **src/test/resources/features/**: Cucumber feature files.
- **src/test/java/Runners/**: Test runner classes to execute the Cucumber tests.

## 🤝 Contributing
We welcome contributions! If you have suggestions for improvements or new features, please fork the repository and create a pull request.

## 📜 License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

Thank you for checking out the **YouTube Video Interaction Project**! 🎉 We hope this project helps you get started with Selenium and Cucumber for your automation needs. Happy testing! 🚀
