package com.example.domain;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address implements Serializable{

	String city;
	String street_name;
	String street_address;
	String zip_code;
	String state;
	String country;
	Coordinates coordinates;
    
}
