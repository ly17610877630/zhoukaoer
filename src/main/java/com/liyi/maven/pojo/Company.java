package com.liyi.maven.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Company {//实体类
	private Integer id;
	private String nickName;
	private String miaoshu;
	private String name;
	private String goods;
	private String address;
	private String money;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date checkDate;
	private Integer status;
	private String beizhu;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getMiaoshu() {
		return miaoshu;
	}
	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", nickName=" + nickName + ", miaoshu=" + miaoshu + ", name=" + name + ", goods="
				+ goods + ", address=" + address + ", money=" + money + ", birthday=" + birthday + ", checkDate="
				+ checkDate + ", status=" + status + ", beizhu=" + beizhu + "]";
	}
	public Company(Integer id, String nickName, String miaoshu, String name, String goods, String address, String money,
			Date birthday, Date checkDate, Integer status, String beizhu) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.miaoshu = miaoshu;
		this.name = name;
		this.goods = goods;
		this.address = address;
		this.money = money;
		this.birthday = birthday;
		this.checkDate = checkDate;
		this.status = status;
		this.beizhu = beizhu;
	}
	public Company() {
		super();
	}
}
