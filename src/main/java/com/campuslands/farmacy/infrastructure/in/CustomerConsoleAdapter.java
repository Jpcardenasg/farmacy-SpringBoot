// package com.campuslands.farmacy.infrastructure.in;

// import java.util.List;
// import java.util.Scanner;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;

// import com.campuslands.farmacy.application.service.CityService;
// import com.campuslands.farmacy.application.service.CustomerService;
// import com.campuslands.farmacy.domain.models.City;
// import com.campuslands.farmacy.domain.models.Customer;

// @Controller
// public class CustomerConsoleAdapter {

// @Autowired
// private CustomerService customerService;
// @Autowired
// private CityService cityService;

// public void start() {

// Scanner scanner = new Scanner(System.in);
// List<Customer> customers;

// while (true) {
// customers = customerService.fetchCustomersList();
// System.out.println("\n");
// System.out.println("1. Register Customer.");
// System.out.println("2. Update Customer.");
// System.out.println("3. Delete Customer.");
// System.out.println("4. Find Customer by ID.");
// System.out.println("5. List all Customers.");
// System.out.println("0. Exit.");

// int choice = scanner.nextInt();
// scanner.nextLine();

// switch (choice) {
// case 1:
// createCustomer(scanner);
// break;
// case 2:
// updateCustomer(scanner, customers);
// break;
// case 3:
// deleteCustomer(scanner, customers);
// break;
// case 4:
// findCustomer(scanner);
// break;
// case 5:
// listCustomers(customers);
// break;
// case 0:
// System.out.println("Exiting...");
// return;
// default:
// System.out.println("Invalid choice. Please try again.");
// break;
// }
// }
// }

// private void createCustomer(Scanner scanner) {
// List<City> cities = cityService.fetchCitiesList();
// System.out.println("Type the Identification Number:");
// String id = scanner.nextLine();
// System.out.println("Type the Customer name:");
// String name = scanner.nextLine();
// System.out.println("Type the Customer last name:");
// String lastName = scanner.nextLine();
// System.out.println("Type the Customer email:");
// String email = scanner.nextLine();
// System.out.println("Type the longitude:");
// Double longitude = scanner.nextDouble();
// System.out.println("Type the Customer latitude:");
// Double latitude = scanner.nextDouble();
// scanner.nextLine();

// for (City city : cities) {
// System.out.printf("ID: %d Name: %s\n", city.getId(), city.getNamecity());
// }
// System.out.println("Choose the City ID:");
// Long cityChoice = scanner.nextLong();
// scanner.nextLine();

// City chosenCity = cities.stream()
// .filter(city -> city.getId().equals(cityChoice))
// .findFirst()
// .orElse(null);

// if (chosenCity == null) {
// System.out.println("Invalid document type ID.");
// return;
// }

// Customer newCustomer = new Customer();
// newCustomer.setId(id);
// newCustomer.setNamecustomer(name);
// newCustomer.setLastnamecustomer(lastName);
// newCustomer.setEmailcustomer(email);
// newCustomer.setLongcustomer(longitude);
// newCustomer.setLatcustomer(latitude);
// newCustomer.setCodecitycustomer(chosenCity);

// customerService.saveCustomer(newCustomer);

// System.out.println("Customer created successfully!");
// }

// private void updateCustomer(Scanner scanner, List<Customer> customers) {
// if (customers.isEmpty()) {
// System.out.println("No customers registered.");
// return;
// }

// Customer chosenCustomer = choosecustomer(customers, scanner);
// if (chosenCustomer == null) {
// System.out.println("Invalid Customer ID.");
// return;
// }

// System.out.println("Type the new name:");
// String newCustomerName = scanner.nextLine();
// System.out.println("Type the new last name:");
// String newCustomerLastName = scanner.nextLine();
// System.out.println("Type the new email:");
// String newCustomerEmail = scanner.nextLine();
// System.out.println("Type the new longitude:");
// Double newLongitude = scanner.nextDouble();
// System.out.println("Type the new latitude:");
// Double newLatitude = scanner.nextDouble();
// scanner.nextLine();

// List<City> cities = cityService.fetchCitiesList();
// for (City city : cities) {
// System.out.printf("ID: %d Name: %s\n", city.getId(), city.getNamecity());
// }
// System.out.println("Choose the new City ID:");
// Long cityChoice = scanner.nextLong();
// scanner.nextLine();

// City chosenCity = cities.stream()
// .filter(city -> city.getId().equals(cityChoice))
// .findFirst()
// .orElse(null);

// if (chosenCity == null) {
// System.out.println("Invalid City ID.");
// return;
// }

// chosenCustomer.setNamecustomer(newCustomerName);
// chosenCustomer.setLastnamecustomer(newCustomerLastName);
// chosenCustomer.setEmailcustomer(newCustomerEmail);
// chosenCustomer.setLongcustomer(newLongitude);
// chosenCustomer.setLatcustomer(newLatitude);
// chosenCustomer.setCodecitycustomer(chosenCity);

// customerService.updateCustomer(chosenCustomer.getId(), chosenCustomer);

// System.out.println("Customer updated successfully!");
// }

// private void deleteCustomer(Scanner scanner, List<Customer> customers) {
// if (customers.isEmpty()) {
// System.out.println("No customers registered.");
// return;
// }

// System.out.println("Customers:");
// listCustomers(customers);
// System.out.println("Type the Customer ID you want to delete:");
// String deleteCustomerId = scanner.nextLine();

// Customer customer = customerService.getCustomerById(deleteCustomerId);
// if (customer != null) {
// customerService.deleteCustomer(deleteCustomerId);
// System.out.println("Customer deleted successfully!");
// } else {
// System.out.println("Customer not found.");
// }

// customerService.deleteCustomer(deleteCustomerId);
// System.out.println("Customer deleted successfully!");
// }

// private void findCustomer(Scanner scanner) {
// System.out.println("Type the Customer ID:");
// String customerId = scanner.nextLine();

// Customer customer = customerService.getCustomerById(customerId);

// if (customer != null) {
// System.out.printf("ID: %s Name: %s %s, Email: %s, City: %s\n",
// customer.getId(), customer.getNamecustomer(), customer.getLastnamecustomer(),
// customer.getEmailcustomer(), customer.getCodecitycustomer().getNamecity());
// } else {
// System.out.println("Customer not found");
// }
// }

// private void listCustomers(List<Customer> customers) {
// if (customers.isEmpty()) {
// System.out.println("No customers registered.");
// return;
// }

// for (Customer customer : customers) {
// System.out.printf("ID: %s Name: %s %s, Email: %s, City: %s\n",
// customer.getId(), customer.getNamecustomer(), customer.getLastnamecustomer(),
// customer.getEmailcustomer(), customer.getCodecitycustomer().getNamecity());
// }
// }

// // Input Helpers
// private String getInput(String prompt, Scanner scanner) {
// System.out.println(prompt);
// return scanner.nextLine();
// }

// private Customer choosecustomer(List<Customer> customers, Scanner scanner) {
// System.out.println("Customers:");
// for (Customer customer : customers) {
// System.out.printf("ID: %s Name: %s \n", customer.getId(),
// customer.getNamecustomer());
// }
// String customerId = getInput("Choose the ID of the customer:", scanner);
// return customerService.getCustomerById(customerId);
// }
// }