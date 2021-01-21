package com.techlearning.agentmain.service.api;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Agent {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int agentid;
	private String firstnm;
	private String lastnm;
	private int ssn;
	private int phone;
	private String email;
	
	public Agent() {
	}
	public Agent(int agentid, String firstnm, String lastnm, int ssn, int phone, String email) {
		super();
		this.agentid = agentid;
		this.firstnm = firstnm;
		this.lastnm = lastnm;
		this.ssn = ssn;
		this.phone = phone;
		this.email = email;
	}
	public int getAgentid() {
		return agentid;
	}
	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}
	public String getFirst_nm() {
		return firstnm;
	}
	public void setFirst_nm(String firstnm) {
		this.firstnm = firstnm;
	}
	public String getLast_nm() {
		return lastnm;
	}
	public void setLast_nm(String lastnm) {
		this.lastnm = lastnm;
	}
	public int getSSN() {
		return ssn;
	}
	public void setSSN(int ssn) {
		this.ssn = ssn;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
