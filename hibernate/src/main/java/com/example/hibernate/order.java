package com.example.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="data")
public class order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String ordername;
	private String orderemail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getOrderemail() {
		return orderemail;
	}
	public void setOrderemail(String orderemail) {
		this.orderemail = orderemail;
	}
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public order(int id, String ordername, String orderemail) {
		super();
		this.id = id;
		this.ordername = ordername;
		this.orderemail = orderemail;
	}
}