package com.liyi.maven.vo;

import java.util.Date;

import com.liyi.maven.pojo.Company;

public class CompanyVO extends Company {//实体类拓展
	private String startMoney;
	private String endMoney;
	private String startBirthday;
	private String endBirthday;
	private String startCheckDate;
	private String endCheckDate;
	public String getStartMoney() {
		return startMoney;
	}
	public void setStartMoney(String startMoney) {
		this.startMoney = startMoney;
	}
	public String getEndMoney() {
		return endMoney;
	}
	public void setEndMoney(String endMoney) {
		this.endMoney = endMoney;
	}
	public String getStartBirthday() {
		return startBirthday;
	}
	public void setStartBirthday(String startBirthday) {
		this.startBirthday = startBirthday;
	}
	public String getEndBirthday() {
		return endBirthday;
	}
	public void setEndBirthday(String endBirthday) {
		this.endBirthday = endBirthday;
	}
	public String getStartCheckDate() {
		return startCheckDate;
	}
	public void setStartCheckDate(String startCheckDate) {
		this.startCheckDate = startCheckDate;
	}
	public String getEndCheckDate() {
		return endCheckDate;
	}
	public void setEndCheckDate(String endCheckDate) {
		this.endCheckDate = endCheckDate;
	}
	@Override
	public String toString() {
		return "CompanyVO [startMoney=" + startMoney + ", endMoney=" + endMoney + ", startBirthday=" + startBirthday
				+ ", endBirthday=" + endBirthday + ", startCheckDate=" + startCheckDate + ", endCheckDate="
				+ endCheckDate + "]";
	}
	public CompanyVO(Integer id, String nickName, String desc, String name, String goods, String address, String money,
			Date birthday, Date checkDate, Integer status, String beizhu, String startMoney, String endMoney,
			String startBirthday, String endBirthday, String startCheckDate, String endCheckDate) {
		super(id, nickName, desc, name, goods, address, money, birthday, checkDate, status, beizhu);
		this.startMoney = startMoney;
		this.endMoney = endMoney;
		this.startBirthday = startBirthday;
		this.endBirthday = endBirthday;
		this.startCheckDate = startCheckDate;
		this.endCheckDate = endCheckDate;
	}
	public CompanyVO() {
		super();
	}
	public CompanyVO(Integer id, String nickName, String desc, String name, String goods, String address, String money,
			Date birthday, Date checkDate, Integer status, String beizhu) {
		super(id, nickName, desc, name, goods, address, money, birthday, checkDate, status, beizhu);
	}
}
