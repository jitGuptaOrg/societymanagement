package com.society.mangement.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RegisterSocietyUserDetails")
public class RegisterSocietyUser {

	@Id
	@GeneratedValue
	@Column(name = "userName")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "mobileNo")
	private int mobileNo;

	@Column(name = "emailId")
	private String emailId;

	@Column(name = "flatNo")
	private String flatNo;

	@Column(name = "wingName")
	private String wingName;

	@Column(name = "owner")
	private String owner;

	public RegisterSocietyUser() {

	}

	public RegisterSocietyUser(String username, String password, int mobileNo, String emailId, String flatNo,
			String wingName, String owner) {
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.flatNo = flatNo;
		this.wingName = wingName;
		this.owner = owner;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getWingName() {
		return wingName;
	}

	public void setWingName(String wingName) {
		this.wingName = wingName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
