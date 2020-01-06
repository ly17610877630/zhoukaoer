package com.liyi.maven.dao;

import java.util.List;

import com.liyi.maven.pojo.Company;
import com.liyi.maven.vo.CompanyVO;

public interface CompanyDao {//dao
	List<Company> selectCompany(CompanyVO companyVO);//查询
	
	Company selectCompanyById(Integer id);//回显
	
	int updateCompany(Company company);//修改
}
