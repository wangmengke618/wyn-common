package com.wyn.common.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.junit.experimental.theories.DataPoint;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Format;

public class Tps {

	private Integer id;
	private String name;
	private Integer age;
	private int money;
	private String time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Tps [id=" + id + ", name=" + name + ", age=" + age + ", money=" + money + ", time=" + time + "]";
	}
	
	
	
}
