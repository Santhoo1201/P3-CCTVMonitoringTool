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

@Entity
@Table(name="dvr2")
public class Dvr2 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dvr2_id")
	private long id;
	
	@Column(name="Camera_name")
	private String cameraName;
	
	@Column(name="location")
	private String location;
	
	@Column(name="Floor_No")
	private int floorNumber;
	
	@Column(name="Live_Status")
	private String liveStatus;
	
	@Column(name="PlayBack_Status")
	private String playBackStatus;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="id")
	@JsonIgnore
	private Admin admin;
	
	
	
	public Dvr2(Long id, String cameraName, String location, int floorNumber, String liveStatus, String playBackStatus,
			Admin admin) {
		super();
		this.id = id;
		this.cameraName = cameraName;
		this.location = location;
		this.floorNumber = floorNumber;
		this.liveStatus = liveStatus;
		this.playBackStatus = playBackStatus;
		this.admin = admin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getLiveStatus() {
		return liveStatus;
	}

	public void setLiveStatus(String liveStatus) {
		this.liveStatus = liveStatus;
	}

	public String getPlayBackStatus() {
		return playBackStatus;
	}

	public void setPlayBackStatus(String playBackStatus) {
		this.playBackStatus = playBackStatus;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Dvr2() {
		
	}

}
