package com.feujiCompany.service;

import com.feujiCompany.DTO.Application;

public interface FeujiService {

	public void save(Application application);
	public Application get(int applicationId) ;
}
