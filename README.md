# Selectorshub_Automation_test
This automation test, built using POM, was designed to ensure the functionality of a form submission process, dropdown verification, date selection and alert handling.

The test script utilizes Selenium WebDriver to interact with the web elements in a structured manner.

-Form Completion: The test begins by navigating to the form page and instantiating the corresponding page object. 
It then fills in various fields of the form, such as name, email, and address, with predefined data to simulate user input.

-Dropdown Verification: After completing the form, the script verifies the dropdown functionality by selecting an option from the dropdown menu and confirming its selection. 
This ensures that the dropdown behaves as expected and that the selected value is correctly displayed.

-Alert Handling: Next, the script tests the handling of alerts by triggering an alert popup, such as a confirmation dialog, and dismissing it. 
This step validates that the website handles alerts appropriately without disrupting the user experience.

-Date Selection: Finally, the automation test verifies the date picker functionality by selecting a specific date from the calendar widget. 
This ensures that users can easily pick dates without encountering errors or inconsistencies.

By implementing the Page Object Model, the test maintains a modular and maintainable structure, with separate page classes representing different web pages and their elements. This approach enhances code reusability, readability, and scalability, making it easier to manage and update the automation suite as the application evolves.
