package com.BankMangmentSystem.entity;

import org.joda.time.LocalDateTime;

import com.BankMangmentSystem.Enum.LoanStatus;
import com.BankMangmentSystem.Enum.LoanType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "loans")
public class Loan {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long loanId;

	    @Enumerated(EnumType.STRING)
	    private LoanType loanType;

	    private double amount;

	    private double interestRate;

	    private int tenure;

	    private double monthlyEmi;

	    @Enumerated(EnumType.STRING)
	    private LoanStatus  status;

	    private LocalDateTime createdAt;
	    
	    

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private UserAdmin user;

	    public Loan() {
	    }

		public Long getLoanId() {
			return loanId;
		}

		public void setLoanId(Long loanId) {
			this.loanId = loanId;
		}

		public LoanType getLoanType() {
			return loanType;
		}

		public void setLoanType(LoanType loanType) {
			this.loanType = loanType;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}

		public int getTenure() {
			return tenure;
		}

		public void setTenure(int tenure) {
			this.tenure = tenure;
		}

		public double getMonthlyEmi() {
			return monthlyEmi;
		}

		public void setMonthlyEmi(double monthlyEmi) {
			this.monthlyEmi = monthlyEmi;
		}

		public LoanStatus getStatus() {
			return status;
		}

		public void setStatus(LoanStatus status) {
			this.status = status;
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

		public Loan(Long loanId, LoanType loanType, double amount, double interestRate, int tenure, double monthlyEmi,
				LoanStatus status, LocalDateTime createdAt, UserAdmin user) {
			super();
			this.loanId = loanId;
			this.loanType = loanType;
			this.amount = amount;
			this.interestRate = interestRate;
			this.tenure = tenure;
			this.monthlyEmi = monthlyEmi;
			this.status = status;
			this.createdAt = createdAt;
			this.user = user;
		}

		

}
