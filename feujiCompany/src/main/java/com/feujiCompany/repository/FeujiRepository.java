package com.feujiCompany.repository;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.feujiCompany.DTO.Application;
import com.feujiCompany.DTO.ApplicationEntity;

@Repository
@Transactional
public class FeujiRepository {

	@Autowired
	HibernateTemplate hibernateTemplate;
	public void save(ApplicationEntity entity)
	{
		Serializable save = hibernateTemplate.save(entity);
		System.out.println(save);
	}
	public ApplicationEntity get(int applicationId) {
		ApplicationEntity applicationEntity = hibernateTemplate.get(ApplicationEntity.class, applicationId);
		return applicationEntity;
	}

}
