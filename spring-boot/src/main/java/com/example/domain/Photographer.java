package com.example.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Photographer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	int id;
	String uid;
	String password;
	String first_name;
	String last_name;
	String username;
	String email;
	String avatar;
	String gender;
	String phone_number;
	String social_insurance_number;
	String date_of_birth;
	Event_Type event_type;
	Address address;
	Credit_Card credit_card;
	Subscription subscription;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getSocial_insurance_number() {
		return social_insurance_number;
	}
	public void setSocial_insurance_number(String social_insurance_number) {
		this.social_insurance_number = social_insurance_number;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Event_Type getEvent_type() {
		return event_type;
	}
	public void setEvent_type(Event_Type event_type) {
		this.event_type = event_type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Credit_Card getCredit_card() {
		return credit_card;
	}
	public void setCredit_card(Credit_Card credit_card) {
		this.credit_card = credit_card;
	}
	public Subscription getSubscription() {
		return subscription;
	}
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	

}
