package com.BankMangmentSystem.entity;

import java.time.LocalDateTime;

import com.BankMangmentSystem.Enum.UnlockStatus;

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
@Table(name = "unlock_requests")
public class UnlockRequest {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reason;

    @Enumerated(EnumType.STRING)
    private UnlockStatus status;

    private LocalDateTime requestedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserAdmin user;

    public UnlockRequest(Long id, String reason, UnlockStatus status, LocalDateTime requestedAt, UserAdmin user) {
		super();
		this.id = id;
		this.reason = reason;
		this.status = status;
		this.requestedAt = requestedAt;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public UnlockStatus getStatus() {
		return status;
	}

	public void setStatus(UnlockStatus status) {
		this.status = status;
	}

	public LocalDateTime getRequestedAt() {
		return requestedAt;
	}

	public void setRequestedAt(LocalDateTime requestedAt) {
		this.requestedAt = requestedAt;
	}

	public UserAdmin getUser() {
		return user;
	}

	public void setUser(UserAdmin user) {
		this.user = user;
	}

	public UnlockRequest() {
    }

}
