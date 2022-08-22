package com.example.domain.user.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
public class Salary {
	private String userId;
    private String yearMonth;
	private Integer salary;
}
