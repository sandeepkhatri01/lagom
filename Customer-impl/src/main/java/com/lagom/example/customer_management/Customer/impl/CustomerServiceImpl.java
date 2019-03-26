package com.lagom.example.customer_management.Customer.impl;

import java.util.concurrent.CompletableFuture;

import com.lagom.example.customer_management.Customer.api.CustomerService;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import akka.NotUsed;

/**
 * Default implementation of {@code CustomerService}
 *
 */
public class CustomerServiceImpl implements CustomerService {

	@Override
	public ServiceCall<NotUsed, String> getCustomer(String id) {
		return request -> CompletableFuture.completedFuture("Sandeep Khatri");
	}

}
