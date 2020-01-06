package com.liyi.maven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liyi.maven.dao.CompanyDao;
import com.liyi.maven.pojo.Company;
import com.liyi.maven.vo.CompanyVO;

@Service
public class CompanyServiceImpl implements CompanyService {//serviceImpl

	@Autowired
	private CompanyDao companyDao;

	@Override
	public PageInfo<Company> selectCompany(CompanyVO companyVO, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Company> list = companyDao.selectCompany(companyVO);
		return new PageInfo<Company>(list);
	}

	@Override
	public Company selectCompanyById(Integer id) {
		return companyDao.selectCompanyById(id);
	}

	@Override
	public boolean updateCompany(Company company) {
		try {
			companyDao.updateCompany(company);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
	
	

}
