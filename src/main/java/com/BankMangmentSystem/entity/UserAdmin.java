package com.BankMangmentSystem.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.BankMangmentSystem.Enum.userAdminEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="users")

public class UserAdmin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String fullName;
	
	@Column(unique=true, nullable=false)
	private  String email;
	
	@Column(nullable= false)
	private String phone;
	
	

	public UserAdmin(){
		
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public userAdminEnum getRole() {
		return role;
	}

	public void setRole(userAdminEnum role) {
		this.role = role;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Column(nullable= false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private userAdminEnum role;
	
	private LocalDateTime createdAt;
	
	private boolean accountLocked;
	
	private int failedLoginAttempts;
	
	private boolean emailVerified;
	
	private LocalDate dateOfBirth;

	public UserAdmin(long id, String fullName, String email, String phone, String password, userAdminEnum role,
			LocalDateTime createdAt, boolean accountLocked, int failedLoginAttempts, boolean emailVerified,
			LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
		this.createdAt = createdAt;
		this.accountLocked = accountLocked;
		this.failedLoginAttempts = failedLoginAttempts;
		this.emailVerified = emailVerified;
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isAccountLocked() {
		return accountLocked;
	}

	public void setAccountLocked(boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	public int getFailedLoginAttempts() {
		return failedLoginAttempts;
	}

	public void setFailedLoginAttempts(int failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}

	public boolean isEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	

}
