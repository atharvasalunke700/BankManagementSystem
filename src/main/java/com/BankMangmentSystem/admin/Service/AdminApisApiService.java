package com.BankMangmentSystem.admin.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

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

public interface AdminApisApiService {

	AccountResponse apiV1AdminAccountsAccountIdPatch(@NotNull @Min(1) Integer accountId,
			@Valid ApiV1AdminAccountsAccountIdPatchRequest apiV1AdminAccountsAccountIdPatchRequest);

	Object apiV1AdminBeneficiariesBeneficiaryIdDelete(
			@NotNull Integer beneficiaryId);

	List<BeneficiaryResponse> apiV1AdminBeneficiariesUserIdGet(@NotNull Integer userId);

	ApiV1AdminLoansGet200Response apiV1AdminLoansGet(@Min(0) @Valid Integer page,
			@Min(1) @Max(100) @Valid Integer size);

	LoanResponse apiV1AdminLoansLoanIdApprovePut(@NotNull Integer loanId);

	LoanResponse apiV1AdminLoansLoanIdGet(@NotNull Integer loanId);

	ApiV1AdminUsersGet200Response apiV1AdminUsersGet(@Min(0) @Valid Integer page,
			@Min(1) @Max(100) @Valid Integer size);
	

}
