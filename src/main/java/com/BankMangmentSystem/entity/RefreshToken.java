package com.BankMangmentSystem.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="refresh_tokens")
public class RefreshToken {

	   @Id
	    @GeneratedValue (strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(length = 1000)
	    private String token;

	    private LocalDateTime expiryDate;

	    private boolean revoked;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private UserAdmin user;

	    public RefreshToken(Long id, String token, LocalDateTime expiryDate, boolean revoked, UserAdmin user) {
			super();
			this.id = id;
			this.token = token;
			this.expiryDate = expiryDate;
			this.revoked = revoked;
			this.user = user;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public LocalDateTime getExpiryDate() {
			return expiryDate;
		}

		public void setExpiryDate(LocalDateTime expiryDate) {
			this.expiryDate = expiryDate;
		}

		public boolean isRevoked() {
			return revoked;
		}

		public void setRevoked(boolean revoked) {
			this.revoked = revoked;
		}

		public UserAdmin getUser() {
			return user;
		}

		public void setUser(UserAdmin user) {
			this.user = user;
		}

		public RefreshToken() {
	    }
	
	
}
