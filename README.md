# AccuWeather Test Automation

## Overview

This project is an automation framework for testing the [AccuWeather](https://www.accuweather.com/) platform, utilizing Feature Runner hooks, step definitions, Page Object Model (POM), and the Aquality Framework. It covers various scenarios related to local, national, and global daily weather forecasts.

## Features

- **Current City Weather**: Verifies that search results and current location labels are displayed correctly.
- **Recent City Weather**: Tests functionality related to selecting and verifying cities from recent locations.
- **Search City Weather**: Ensures that search functionality and result displays are working as expected.

## Scenarios

### 1. Current City Weather on AccuWeather
- **Background**: Navigates to the [AccuWeather](https://www.accuweather.com/) main page.
- **Scenario**: Verifies that the search results list and "Use your current location" label are displayed after clicking the search field.

### 2. Recent City Weather on AccuWeather
- **Background**: Navigates to the [AccuWeather](https://www.accuweather.com/) main page.
- **Scenario**: Tests the process of selecting a city from recent locations, ensuring that the main page and recent city name are displayed correctly.

### 3. Search City Weather on AccuWeather
- **Background**: Navigates to the [AccuWeather](https://www.accuweather.com/) main page.
- **Scenario**: Searches for a city weather, verifies search results, and ensures that the city name is correctly displayed on the search results page.

## Setup and Installation

1. **Clone the Repository**:
   ```bash
   git clone <remote-url>


2. **Navigate to Project Directory**:
   ```bash
   cd path/to/your/repository

## Opening the Project in IntelliJ IDEA

1. **Launch IntelliJ IDEA**.
2. **Open the project** by selecting `File > Open` and navigating to your project directory.

## Installing Dependencies

Follow the instructions in your specific project documentation for installing dependencies. This may involve setting up your test environment and installing required libraries.

## Running Tests

1. **Set Up Your Environment**:
   Ensure you have all necessary tools and frameworks installed as per the project requirements.

2. **Execute Tests**:
   Use IntelliJ IDEA to run your tests. You can typically do this by right-clicking on the test files or classes and selecting `Run`, or by using the command line if specified in your project documentation.

## Technologies Used

- **Feature Runner**: For managing test scenarios and hooks.
- **Step Definitions**: To map Gherkin steps to code.
- **Page Object Model (POM)**: For organizing page elements and interactions.
- **Aquality Framework**: For advanced test automation capabilities.
- **IntelliJ IDEA**: For project development and management.


## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or fixes.

## License

This project is licensed under the [MIT License](LICENSE).


   
