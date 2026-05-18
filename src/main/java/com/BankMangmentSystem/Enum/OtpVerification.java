package com.BankMangmentSystem.Enum;

import org.joda.time.LocalDateTime;

import com.BankMangmentSystem.entity.UserAdmin;

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
@Table(name = "otp_verifications")
public class OtpVerification {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String otpCode;

	    private LocalDateTime expiryTime;

	    private boolean verified;

	    @Enumerated(EnumType.STRING)
	    private OtpPurpose purpose;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private UserAdmin user;

	    public OtpVerification(Long id, String otpCode, LocalDateTime expiryTime, boolean verified, OtpPurpose purpose,
				UserAdmin user) {
			super();
			this.id = id;
			this.otpCode = otpCode;
			this.expiryTime = expiryTime;
			this.verified = verified;
			this.purpose = purpose;
			this.user = user;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getOtpCode() {
			return otpCode;
		}

		public void setOtpCode(String otpCode) {
			this.otpCode = otpCode;
		}

		public LocalDateTime getExpiryTime() {
			return expiryTime;
		}

		public void setExpiryTime(LocalDateTime expiryTime) {
			this.expiryTime = expiryTime;
		}

		public boolean isVerified() {
			return verified;
		}

		public void setVerified(boolean verified) {
			this.verified = verified;
		}

		public OtpPurpose getPurpose() {
			return purpose;
		}

		public void setPurpose(OtpPurpose purpose) {
			this.purpose = purpose;
		}

		public UserAdmin getUser() {
			return user;
		}

		public void setUser(UserAdmin user) {
			this.user = user;
		}

		public OtpVerification() {
	    }
}
