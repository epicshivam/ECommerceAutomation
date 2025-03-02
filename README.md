# E-Commerce Automation Testing Project

## 📌 Overview
This project is an automated test suite for an e-commerce website using **Selenium WebDriver** with **TestNG**. It includes various test cases to validate the functionality of core e-commerce features such as login, product search, adding items to the cart, and checkout.

## 🚀 Technologies Used
- **Java** - Programming language for writing test scripts
- **Selenium WebDriver** - Automating browser interactions
- **TestNG** - Test framework for structuring and executing tests
- **Maven** - Dependency management and build automation
- **Page Object Model (POM)** - Improves test maintainability

## 📂 Project Structure
```
ECommerceAutomation/
│── src/
│   ├── main/java/org/example/pages/        # Page classes
│   │   ├── LoginPage.java
│   │   ├── SearchPage.java
│   │   ├── ProductPage.java
│   │   ├── CheckoutPage.java
│   ├── test/java/tests/                    # Test classes
│   │   ├── BaseTest.java
│   │   ├── LoginTest.java
│   │   ├── SearchTest.java
│   │   ├── ProductTest.java
│   │   ├── CheckoutTest.java
│   ├── test/resources/                     # Configuration files
│       ├── config.properties
│── .gitignore
│── pom.xml                                  # Maven dependencies
│── testing.xml                              # TestNG configuration file
```

## ⚙️ Features
- **Cross-Browser Testing**: Supports Chrome, Firefox, and Edge (configurable via `config.properties`)
- **Data-Driven Testing**: Uses external configuration files
- **Automated Test Execution**: Uses TestNG for structured test execution
- **Page Object Model (POM)**: Enhances test script readability and maintainability

## 🔧 Setup Instructions
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/epicshivam/ECommerceAutomation.git
cd ECommerceAutomation
```
### 2️⃣ Install Dependencies
Ensure Maven and Java (JDK 8+) are installed, then run:
```sh
mvn clean install
```
### 3️⃣ Configure Browser & URL
Edit `src/test/resources/config.properties`:
```properties
browser=chrome   # Change to firefox or edge if needed
baseURL=https://www.amazon.in/
```
### 4️⃣ Run Tests
Execute tests using TestNG:
```sh
mvn test
```

## 📝 Author
Developed by **Shivam** 🚀

## 📜 License
This project is open-source under the **MIT License**.

