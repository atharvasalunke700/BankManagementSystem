package com.BankMangmentSystem.entity;

import org.joda.time.LocalDateTime;

import jakarta.persistence.Entity;
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

	    private String loanType;

	    private double amount;

	    private double interestRate;

	    private int tenure;

	    private double monthlyEmi;

	    private String status;

	    private LocalDateTime createdAt;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private UserAdmin user;

	    public Loan() {
	    }

		public Loan(Long loanId, String loanType, double amount, double interestRate, int tenure, double monthlyEmi,
				String status, LocalDateTime createdAt, UserAdmin user) {
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

		@Override
		public String toString() {
			return "Loan [loanId=" + loanId + ", loanType=" + loanType + ", amount=" + amount + ", interestRate="
					+ interestRate + ", tenure=" + tenure + ", monthlyEmi=" + monthlyEmi + ", status=" + status
					+ ", createdAt=" + createdAt + ", user=" + user + "]";
		}

}
