package com.BankMangmentSystem.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.BankMangmentSystem.entity.User;

import com.BankMangmentSystem.Enum.AccountType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="accounts")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;
	
	@Column(unique=true)
	private String accountNumber;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	private  String balance;
	
	private String status;
	
	private LocalDateTime createdAt;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "account")
	private List<Transaction> transactions;
	
	@OneToMany(mappedBy = "account")
	private List<Payment> payments;
	
	public Account() {
		
	}
	
}
