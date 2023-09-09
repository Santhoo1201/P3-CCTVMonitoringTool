package com.project.dvr.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="dvr1")
public class Dvr1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dvr1_id")
	private long id;
	
	@Column(name="Camera_name")
	@NotEmpty
	private String cameraName;
	
	@Column(name="Location")
	@NotEmpty
	private String location;
	
	@Column(name="Floor_Name")
	private int floorNumber;
	
	
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="id")
	@JsonIgnore
	private Admin admin;
	
	public Dvr1() {
		
	}
	

	public Dvr1(long id, @NotEmpty String cameraName, @NotEmpty String location, int floorNumber, Admin admin) {
		super();
		this.id = id;
		this.cameraName = cameraName;
		this.location = location;
		this.floorNumber = floorNumber;
		this.admin = admin;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCameraName() {
		return cameraName;
	}

	public void setCameraName(String cameraName) {
		this.cameraName = cameraName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
	

}
