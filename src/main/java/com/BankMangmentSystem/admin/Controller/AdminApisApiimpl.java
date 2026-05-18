package com.BankMangmentSystem.admin.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.BankMangmentSystem.admin.Service.AdminApisApiService;
import com.banksystem.admin.api.AdminApisApi;
import com.banksystem.admin.dto.AccountResponse;
import com.banksystem.admin.dto.ApiV1AdminAccountsAccountIdPatchRequest;
import com.banksystem.admin.dto.ApiV1AdminBeneficiariesBeneficiaryIdDelete200Response;
import com.banksystem.admin.dto.ApiV1AdminLoansGet200Response;
import com.banksystem.admin.dto.ApiV1AdminUsersGet200Response;
import com.banksystem.admin.dto.BeneficiaryResponse;
import com.banksystem.admin.dto.LoanResponse;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class AdminApisApiimpl implements AdminApisApi {
	
	private final AdminApisApiService service;
	
	public AdminApisApiimpl(AdminApisApiService service1) {
		this.service = service1;
	}

	@Override
	public ResponseEntity<AccountResponse> apiV1AdminAccountsAccountIdPatch(@NotNull @Min(1) Integer accountId,
			@Valid ApiV1AdminAccountsAccountIdPatchRequest apiV1AdminAccountsAccountIdPatchRequest) {
		AccountResponse accountResponse = service.apiV1AdminAccountsAccountIdPatch(accountId, apiV1AdminAccountsAccountIdPatchRequest);
		return new ResponseEntity<>(accountResponse,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ApiV1AdminBeneficiariesBeneficiaryIdDelete200Response> apiV1AdminBeneficiariesBeneficiaryIdDelete(
			@NotNull Integer beneficiaryId) {
		
		ApiV1AdminBeneficiariesBeneficiaryIdDelete200Response response = service.apiV1AdminBeneficiariesBeneficiaryIdDelete(beneficiaryId);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<BeneficiaryResponse>> apiV1AdminBeneficiariesUserIdGet(@NotNull Integer userId) {
		List<BeneficiaryResponse> response =service.apiV1AdminBeneficiariesUserIdGet(userId);
		return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<ApiV1AdminLoansGet200Response> apiV1AdminLoansGet(@Min(0) @Valid Integer page,
			@Min(1) @Max(100) @Valid Integer size) {
		// TODO Auto-generated method stub
		return AdminApisApi.super.apiV1AdminLoansGet(page, size);
	}

	@Override
	public ResponseEntity<LoanResponse> apiV1AdminLoansLoanIdApprovePut(@NotNull Integer loanId) {
		// TODO Auto-generated method stub
		return AdminApisApi.super.apiV1AdminLoansLoanIdApprovePut(loanId);
	}

	@Override
	public ResponseEntity<LoanResponse> apiV1AdminLoansLoanIdGet(@NotNull Integer loanId) {
		// TODO Auto-generated method stub
		return AdminApisApi.super.apiV1AdminLoansLoanIdGet(loanId);
	}

	@Override
	public ResponseEntity<ApiV1AdminUsersGet200Response> apiV1AdminUsersGet(@Min(0) @Valid Integer page,
			@Min(1) @Max(100) @Valid Integer size) {
		// TODO Auto-generated method stub
		return AdminApisApi.super.apiV1AdminUsersGet(page, size);
	}

	
	
}
