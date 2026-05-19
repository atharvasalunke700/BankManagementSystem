package com.BankMangmentSystem.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.BankMangmentSystem.Enum.userAdminEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="users")

public class UserAdmin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable= false)
	private String fullName;
	
	@Column(unique=true, nullable=false)
	private  String email;
	
	@Column(unique= true,nullable= false)
	private String phone;
	
	
	public UserAdmin(long id, String fullName, String email, String phone, String password, userAdminEnum role,
			LocalDateTime createdAt, boolean accountLocked, int failedLoginAttempts, boolean emailVerified,
			LocalDate dateOfBirth, List<Account> accounts, List<Beneficiary> beneficiaries, List<Loan> loans) {
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
		this.accounts = accounts;
		this.beneficiaries = beneficiaries;
		this.loans = loans;
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

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public List<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public List<Loan> getLoans() {
		return loans;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

	public UserAdmin(){
		
	}
	
	@Column(nullable= false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private userAdminEnum role;
	
	private LocalDateTime createdAt =LocalDateTime.now();
	
	private boolean accountLocked;
	
	private int failedLoginAttempts;
	
	private boolean emailVerified;
	
	private LocalDate dateOfBirth;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Account> accounts;
	
	@OneToMany(mappedBy = "user",cascade=CascadeType.ALL)
	private List<Beneficiary> beneficiaries;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Loan> loans;
	
	
	
}
