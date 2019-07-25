package com.marlabs.ERS;

public class DepartmentVo {
	
	private Integer id;

	private Integer depatmentId;

	private String departmentManagerId;

	private String departmentManager;

	private String departmentCode;

	
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentManagerId() {
		return departmentManagerId;
	}

	public void setDepartmentManagerId(String departmentManagerId) {
		this.departmentManagerId = departmentManagerId;
	}

	public String getDepartmentManager() {
		return departmentManager;
	}

	public void setDepartmentManager(String departmentManager) {
		this.departmentManager = departmentManager;
	}

	public Integer getDepatmentId() {
		return depatmentId;
	}

	public void setDepatmentId(Integer depatmentId) {
		this.depatmentId = depatmentId;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}


}
