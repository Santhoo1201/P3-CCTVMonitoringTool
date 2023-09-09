package com.project.dvr.Entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;


@Entity
@Table(name="Dvr3_Details")
public class Dvr3Details {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Camera_No")
	@NotEmpty
	private String cameras;
	
	@Column(name="room_Name")
	@NotEmpty
	private String roomName;
	
	@Column(name="floor_No")
	private int floorNo;
	
	@Column(name="Date")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate date;
	
	@Column(name="live_Status")
	@NotEmpty
	private String liveStatus;
	
	@Column(name="playBack_Status")
	@NotEmpty
	private String playBackStatus;
	
	public Dvr3Details() {
		
	}
	
	public Dvr3Details(long id, String cameras, String roomName, int floorNo, LocalDate date, String liveStatus,
			String playBackStatus) {
		super();
		this.id = id;
		this.cameras = cameras;
		this.roomName = roomName;
		this.floorNo = floorNo;
		this.date = date;
		this.liveStatus = liveStatus;
		this.playBackStatus = playBackStatus;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getCameras() {
		return cameras;
	}



	public void setCameras(String cameras) {
		this.cameras = cameras;
	}



	public String getRoomName() {
		return roomName;
	}



	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}



	public int getFloorNo() {
		return floorNo;
	}



	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
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
	
	

}
