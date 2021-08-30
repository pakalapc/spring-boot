package com.example.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subscription implements Serializable {
	String plan;
	String status;
	String payment_method;
	String term;

}
