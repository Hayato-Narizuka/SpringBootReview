package com.example.domain.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
public class Department {
	private Integer departmentId;
	private String departmentName;
}
