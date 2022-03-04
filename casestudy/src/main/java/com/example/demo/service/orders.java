package com.example.demo.service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class orders {

	
	@Id
	int oid;
	private String carname;
	private String carmodel;
	private String wname;
	private int washpackId;
	private String date;
	private long phoneno;
	public orders() {
		
	}
	public orders(int oid, String carname, String carmodel, String wname, int washpackId, String date, long phoneno) {
		super();
		this.oid = oid;
		this.carname = carname;
		this.carmodel = carmodel;
		this.wname = wname;
		this.washpackId = washpackId;
		this.date = date;
		this.phoneno = phoneno;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public int getWashpackId() {
		return washpackId;
	}
	public void setWashpackId(int washpackId) {
		this.washpackId = washpackId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
}
