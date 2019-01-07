package com.society.mangement.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "RegisterSocietyUserDetails")
@EntityListeners(AuditingEntityListener.class)
public class RegisterSocietyUser implements Serializable {

	/**
	 * This is system generated serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "userName")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "mobileNo")
	private String mobileNo;

	@Column(name = "emailId")
	private String emailId;

	@Column(name = "societyName")
	private String societyName;

	@Column(name = "flatNo")
	private String flatNo;

	@Column(name = "wingName")
	private String wingName;

	@Column(name = "owner")
	private String owner;

	public RegisterSocietyUser() {

	}

	public RegisterSocietyUser(Long id, String username, String password, String mobileNo, String emailId,
			String societyName, String flatNo, String wingName, String owner) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.societyName = societyName;
		this.flatNo = flatNo;
		this.wingName = wingName;
		this.owner = owner;

	}

	public RegisterSocietyUser(String username, String password, String mobileNo, String emailId, String societyName,
			String flatNo, String wingName, String owner) {
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.societyName = societyName;
		this.flatNo = flatNo;
		this.wingName = wingName;
		this.owner = owner;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
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
