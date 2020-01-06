package com.liyi.maven.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.liyi.maven.common.utils.StringUtil;
import com.liyi.maven.pojo.Company;
import com.liyi.maven.service.CompanyService;
import com.liyi.maven.vo.CompanyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class CompanyTest {
	
	@Autowired
	private CompanyService companyService;
	
	
	@Test
	public void selectCompany() {
		PageInfo<Company> info = companyService.selectCompany(new CompanyVO(), 1, 3);
		for (Company company : info.getList()) {
			Integer id = company.getId();
			System.out.println("id的值是不是数字："+StringUtil.isNumber(id.toString()));
			System.out.println("关键字有没有值："+StringUtil.hasText(company.getNickName()));
			System.out.println("描述有没有值："+StringUtil.hasText(company.getMiaoshu()));
			System.out.println("公司名称有没有值："+StringUtil.hasText(company.getName()));
			System.out.println("主营产品有没有值："+StringUtil.hasText(company.getGoods()));
			System.out.println("地址产品有没有值："+StringUtil.hasText(company.getAddress()));
			System.out.println("注册资本是不是数字："+StringUtil.isNumber(company.getMoney()));
			System.out.println("********************");
		}
	}
}
