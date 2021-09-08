package com.example.Customer.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

public abstract class Gift {
	@JsonInclude
	protected Long points;
	public abstract Long getPoints();
}
