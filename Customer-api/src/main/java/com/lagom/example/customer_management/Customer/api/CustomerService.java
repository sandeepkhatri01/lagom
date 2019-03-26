package com.lagom.example.customer_management.Customer.api;

import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import akka.NotUsed;

/**
 * Customer service contains operations to work with Customer Resource
 */
public interface CustomerService extends Service {

	ServiceCall<NotUsed, String> getCustomer(String id);

	@Override
	default Descriptor descriptor() {
		return Service.named("customer")
				.withCalls(Service.pathCall("/customer/:id", this::getCustomer))
				.withAutoAcl(true);
	}
}
