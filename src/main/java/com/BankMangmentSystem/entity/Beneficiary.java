package com.BankMangmentSystem.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "beneficiaries")
public class Beneficiary {

	@Id
	private Long beneficiaryId;
	
	private String beneficiaryName;
	
	private String beneficiaryAccount;
	
	private String ifscCode;
	
	private LocalDateTime createdAt;
	
	@ManyToOne
	@JoinColumn(name ="user_id")
	private UserAdmin user;
	
	public Beneficiary() {
		
	}

	public Beneficiary(Long beneficiaryId, String beneficiaryName, String beneficiaryAccount, String ifscCode,
			LocalDateTime createdAt, UserAdmin user) {
		super();
		this.beneficiaryId = beneficiaryId;
		this.beneficiaryName = beneficiaryName;
		this.beneficiaryAccount = beneficiaryAccount;
		this.ifscCode = ifscCode;
		this.createdAt = createdAt;
		this.user = user;
	}

	public Long getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(Long beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getBeneficiaryAccount() {
		return beneficiaryAccount;
	}

	public void setBeneficiaryAccount(String beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public UserAdmin getUser() {
		return user;
	}

	public void setUser(UserAdmin user) {
		this.user = user;
	}
	
}
