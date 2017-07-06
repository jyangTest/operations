package com.iot.http.entity;

import org.apache.ibatis.type.Alias;


/**
 * Created by XiaoJiang01 on 2017/4/13.
 */
//@Alias("PointFiledEntity")
public class PointFieldEntity {
    private int id;
    private int termId;
    private int number;
    private int roleId;
    private String name;
    private String describes;
    private String unit;
    private Double min;
    private Double max;
    private int multiple;
    
    
	public PointFieldEntity(int id, int termId, int number, int roleId, String name, String describes, String unit,
			Double min, Double max, int multiple) {
		this.id = id;
		this.termId = termId;
		this.number = number;
		this.roleId = roleId;
		this.name = name;
		this.describes = describes;
		this.unit = unit;
		this.min = min;
		this.max = max;
		this.multiple = multiple;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTermId() {
		return termId;
	}
	public void setTermId(int termId) {
		this.termId = termId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribes() {
		return describes;
	}
	public void setDescribes(String describes) {
		this.describes = describes;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getMin() {
		return min;
	}
	public void setMin(Double min) {
		this.min = min;
	}
	public Double getMax() {
		return max;
	}
	public void setMax(Double max) {
		this.max = max;
	}
	public int getMultiple() {
		return multiple;
	}
	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}
    
}
