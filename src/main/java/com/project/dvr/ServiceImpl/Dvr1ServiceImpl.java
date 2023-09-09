package com.project.dvr.ServiceImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dvr.Entity.Dvr1Details;
import com.project.dvr.Repository.Dvr1Repository;
import com.project.dvr.Service.Dvr1Service;

@Service
public class Dvr1ServiceImpl implements Dvr1Service {
	
	
	@Autowired
	private Dvr1Repository dvr1Repository;
	
	public Dvr1ServiceImpl(Dvr1Repository dvr1Repository) {
		super();
		this.dvr1Repository = dvr1Repository;
	}


	@Override
	public Dvr1Details saveDvr1(Dvr1Details dvr1Details) {
		
		return dvr1Repository.save(dvr1Details);
	}
	
	@Override
	public Dvr1Details getDvr1DetailsById(long id,Dvr1Details dvr1Details) {
		
		return dvr1Repository.findById(id);
	}
	
	@Override
	public Dvr1Details updateDvr1DetailsById(long id,Dvr1Details dvr1Details) {
		
		Dvr1Details existingDetails= dvr1Repository.findById(id);
		existingDetails.setCameras(dvr1Details.getCameras());
		existingDetails.setRoomName(dvr1Details.getRoomName());
		existingDetails.setFloorNo(dvr1Details.getFloorNo());
		existingDetails.setDate(dvr1Details.getDate());
		existingDetails.setLiveStatus(dvr1Details.getLiveStatus());
		existingDetails.setPlayBackStatus(dvr1Details.getPlayBackStatus());
		return dvr1Repository.save(existingDetails);
		
	}
	
	@Override
	public void deleteDvr1DetailsById(long id,Dvr1Details dvr1Details) {
		
		dvr1Repository.findById(id);
		dvr1Repository.deleteById(id);
		
	}
	
	@Override
	public List<Dvr1Details> getAllDvr1DetailsByDate(LocalDate startDate,LocalDate endDate){
		
		return dvr1Repository.findByDateBetween(startDate,endDate);
	}
	
	@Override
	public List<Dvr1Details> getAllDvr1Details(){
		
		return dvr1Repository.findAll();
	}
	
	@Override
	public List<Dvr1Details> saveAllDvr1Details(List<Dvr1Details> dvr1Details){
		
		
		return (List<Dvr1Details>) dvr1Repository.saveAll(dvr1Details);
	}
	@Override
	public List<Dvr1Details> getAllDvr1DetailsBySelectDate(LocalDate selectDate){
		
		return dvr1Repository.findByDate(selectDate);
	}

	

}
