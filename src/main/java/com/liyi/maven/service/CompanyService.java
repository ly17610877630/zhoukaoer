package com.liyi.maven.service;


import com.github.pagehelper.PageInfo;
import com.liyi.maven.pojo.Company;
import com.liyi.maven.vo.CompanyVO;

public interface CompanyService {//service
	PageInfo<Company> selectCompany(CompanyVO companyVO , Integer page , Integer pageSize);
	
	Company selectCompanyById(Integer id);
	
	boolean updateCompany(Company company);
}
