# Playwright_Java_Cucumber_POM

## Setup Instructions

### Prerequisites
- Java (JDK 8 or higher)
- Maven
- Node.js

### Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd <project-directory>
   ```
3. Install dependencies:
   ```bash
   mvn install
   ```

### Running Tests
1. Execute all tests:
   ```bash
   mvn test
   ```
2. Run specific feature files:
   ```bash
   mvn test -Dcucumber.options="src/test/resources/features/<feature-file>.feature"
   ```

### Reports
- After execution, the Extent Report is generated in the `target/ExtentReport.html` file.

### Notes
- Update configurations in `src/test/resources/config.properties`.
- Screenshots and logs are captured automatically for each step.

