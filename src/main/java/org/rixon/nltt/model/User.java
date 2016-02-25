package org.rixon.nltt.model;

public class User {

	private Integer id;
	private String name;
	private String phone;
	private String email;
	
	public User() {
	}
	
	public User(Integer id, String name, String phone, String email) {
		this.id = id;
		this.name = name;
		this.setPhone(phone);
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}

}