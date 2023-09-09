package com.project.dvr.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Admin_Details")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="SFM_Id")
	@NotEmpty
	public String sfmId;
	
	@Column(name="Admin_Name")
	@NotEmpty
	private String adminName;
	
	@Column(name="Admin_EmailId")
	@NotEmpty
	public String adminEmailId;
	
	@Column(name="Admin_Password")
	@NotEmpty
	@Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
	public String adminPassword;
	
	@Column(name="Admin_PhoneNo")
	@NotEmpty
	@Size(min=10,max=10,message="phoneNo must be contain 10 number")
	private String adminPhoneNo;
	
	@OneToMany(mappedBy="admin",cascade=CascadeType.MERGE)
	@JsonIgnore
	private List<Dvr1> dvr1;
	
	@OneToMany(mappedBy="admin",cascade=CascadeType.MERGE)
	@JsonIgnore
	private List<Dvr2> dvr2;
	
	@OneToMany(mappedBy="admin",cascade=CascadeType.MERGE)
	@JsonIgnore
	private List<Dvr3> dvr3;
	
	public Admin() {
		
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getSfmId() {
		return sfmId;
	}


	public void setSfmId(String sfmId) {
		this.sfmId = sfmId;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public String getAdminEmailId() {
		return adminEmailId;
	}


	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}


	public String getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}


	public String getAdminPhoneNo() {
		return adminPhoneNo;
	}


	public void setAdminPhoneNo(String adminPhoneNo) {
		this.adminPhoneNo = adminPhoneNo;
	}


	public List<Dvr1> getDvr1() {
		return dvr1;
	}


	public void setDvr1(List<Dvr1> dvr1) {
		this.dvr1 = dvr1;
	}


	public List<Dvr2> getDvr2() {
		return dvr2;
	}


	public void setDvr2(List<Dvr2> dvr2) {
		this.dvr2 = dvr2;
	}


	public List<Dvr3> getDvr3() {
		return dvr3;
	}


	public void setDvr3(List<Dvr3> dvr3) {
		this.dvr3 = dvr3;
	}


	public Admin(long id, @NotEmpty String sfmId, @NotEmpty String adminName, @NotEmpty String adminEmailId,
			@NotEmpty @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}") String adminPassword,
			@NotEmpty @Size(min = 10, max = 10, message = "phoneNo must be contain 10 number") String adminPhoneNo,
			List<Dvr1> dvr1, List<Dvr2> dvr2, List<Dvr3> dvr3) {
		super();
		this.id = id;
		this.sfmId = sfmId;
		this.adminName = adminName;
		this.adminEmailId = adminEmailId;
		this.adminPassword = adminPassword;
		this.adminPhoneNo = adminPhoneNo;
		this.dvr1 = dvr1;
		this.dvr2 = dvr2;
		this.dvr3 = dvr3;
	}


	
	

}
