package com.liyi.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.liyi.maven.pojo.Company;
import com.liyi.maven.service.CompanyService;
import com.liyi.maven.vo.CompanyVO;

@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("/selectCompany")//查询列表
	public String selectCompany(Model model , CompanyVO companyVO , @RequestParam(defaultValue = "1")Integer page , @RequestParam(defaultValue = "3")Integer pageSize) {
		PageInfo<Company> info = companyService.selectCompany(companyVO, page, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("companyVO", companyVO);
		return "selectCompany";
	}
	
	@GetMapping("/updateCompany")//去修改页面
	public String updateCompany(Model model , Integer id) {
		Company company = companyService.selectCompanyById(id);
		model.addAttribute("company", company);
		return "updateCompany";
	}
	
	@ResponseBody
	@PostMapping("/updateCompany")//修改
	public boolean updateCompany(Company company) {
		return companyService.updateCompany(company);
	}
	
}
