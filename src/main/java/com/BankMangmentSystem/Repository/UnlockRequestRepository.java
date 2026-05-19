package com.BankMangmentSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BankMangmentSystem.entity.UnlockRequest;

@Repository
public interface UnlockRequestRepository extends JpaRepository<UnlockRequest, Long> {

	
}
