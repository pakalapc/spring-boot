package com.example.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Event_Type implements Serializable{
	
	List<String> type;

}
