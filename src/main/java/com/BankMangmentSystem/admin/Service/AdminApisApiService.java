package com.BankMangmentSystem.admin.Service;

import java.util.List;

import com.banksystem.admin.dto.AccountResponse;
import com.banksystem.admin.dto.ApiV1AdminAccountsAccountIdPatchRequest;
import com.banksystem.admin.dto.ApiV1AdminBeneficiariesBeneficiaryIdDelete200Response;
import com.banksystem.admin.dto.BeneficiaryResponse;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public interface AdminApisApiService {

	AccountResponse apiV1AdminAccountsAccountIdPatch(@NotNull @Min(1) Integer accountId,
			@Valid ApiV1AdminAccountsAccountIdPatchRequest apiV1AdminAccountsAccountIdPatchRequest);

	ApiV1AdminBeneficiariesBeneficiaryIdDelete200Response apiV1AdminBeneficiariesBeneficiaryIdDelete(
			@NotNull Integer beneficiaryId);

	List<BeneficiaryResponse> apiV1AdminBeneficiariesUserIdGet(@NotNull Integer userId);
	

}
