package com.example.domain;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coordinates implements Serializable{
	
	String lat;
	String lng;

}
