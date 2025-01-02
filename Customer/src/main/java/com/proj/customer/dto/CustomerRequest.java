package com.proj.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
	private String name;
	private String  email;
    private String mobileNumber;
}