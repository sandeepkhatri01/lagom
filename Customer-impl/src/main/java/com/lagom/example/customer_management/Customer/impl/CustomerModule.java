package com.lagom.example.customer_management.Customer.impl;

import com.google.inject.AbstractModule;
import com.lagom.example.customer_management.Customer.api.CustomerService;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

/**
 * The module that binds the CustomerService so that it can be served.
 */
public class CustomerModule extends AbstractModule implements ServiceGuiceSupport {

	@Override
	protected void configure() {
		bindService(CustomerService.class, CustomerServiceImpl.class);

	}

}
