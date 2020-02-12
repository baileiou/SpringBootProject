package com.offcn.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 实体类映射数据库表
 * 使用spring data jpa开发的时候，会将实体类中的成员变量与表中的字段一一对应，
 * 当我们在实体类中加上一个不与数据库表一一对应的成员变量的时候，只要在
 * 这个成员变量上加上注解@Transient -->表示该属性并非一个到数据库表的字段的映射
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class User {
	@Id
	@GeneratedValue	
	private Long id;
	
	@Column(name = "name", nullable = true, length = 200)
	private String name;
	
	@Column(name = "age", nullable = true, length = 4)
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}