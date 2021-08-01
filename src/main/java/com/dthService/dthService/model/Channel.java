package com.dthService.dthService.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Channel {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private double price;

	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Channel(long id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Channel [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
}
