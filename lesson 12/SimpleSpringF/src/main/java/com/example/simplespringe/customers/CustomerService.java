package com.example.simplespringe.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerService implements ICustomerService {
	CustomerDAOMock customerDAO;
	IEmailSender emailSender;

	@Autowired
	public void setCustomerDao(CustomerDAOMock customerDao) {
		this.customerDAO = customerDao;
	}

	@Autowired
	public void setEmailSender(EmailSender emailSender) {
		this.emailSender = emailSender;
	}

	public void addCustomer(String name, String email, String street,
			String city, String zip) {
		Customer customer = new Customer(name, email);
		Address address = new Address(street, city, zip);
		customer.setAddress(address);
		customerDAO.save(customer);
		emailSender.sendEmail(email, "Welcome " + name + " as a new customer");
	}


}
