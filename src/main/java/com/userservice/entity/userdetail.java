package com.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_TB")
public class userdetail
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
    private String name;
    private String city;
    private int mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public userdetail(int uid, String name, String city, int mobile) {
		super();
		this.uid = uid;
		this.name = name;
		this.city = city;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "userdetail [uid=" + uid + ", name=" + name + ", city=" + city + ", mobile=" + mobile + "]";
	}
	 
	
    
}
