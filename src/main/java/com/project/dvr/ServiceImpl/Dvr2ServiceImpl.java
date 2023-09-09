package com.project.dvr.ServiceImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.dvr.Entity.Admin;
import com.project.dvr.Entity.Dvr2;
import com.project.dvr.Entity.Dvr2Details;
import com.project.dvr.Repository.Dvr2NewRepository;
import com.project.dvr.Repository.Dvr2Repository;
import com.project.dvr.Service.AdminService;
import com.project.dvr.Service.Dvr2Service;

@Service
public class Dvr2ServiceImpl implements Dvr2Service{
	
	@Autowired
     private Dvr2Repository dvr2Repository;
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private Dvr2NewRepository dvr2NewRepository;
     
	

	public Dvr2ServiceImpl(Dvr2Repository dvr2Repository, AdminService adminService,
			Dvr2NewRepository dvr2NewRepository) {
		super();
		this.dvr2Repository = dvr2Repository;
		this.adminService = adminService;
		this.dvr2NewRepository = dvr2NewRepository;
	}

	@Override
	public Dvr2Details saveDvr2(Dvr2Details Dvr2Details) {
		
		return dvr2Repository.save(Dvr2Details);
	}
	
	@Override
	public Dvr2Details getDvr2DetailsById(long id,Dvr2Details Dvr2Details) {
		
		return dvr2Repository.findById(id);
	}
	
	@Override
	public Dvr2Details updateDvr2DetailsById(long id,Dvr2Details Dvr2Details) {
		
		Dvr2Details existingDetails= dvr2Repository.findById(id);
		existingDetails.setCameras(Dvr2Details.getCameras());
		existingDetails.setRoomName(Dvr2Details.getRoomName());
		existingDetails.setFloorNo(Dvr2Details.getFloorNo());
		existingDetails.setDate(Dvr2Details.getDate());
		existingDetails.setLiveStatus(Dvr2Details.getLiveStatus());
		existingDetails.setPlayBackStatus(Dvr2Details.getPlayBackStatus());
		return dvr2Repository.save(existingDetails);
		
	}
	
	@Override
	public void deleteDvr2DetailsById(long id,Dvr2Details Dvr2Details) {
		
		dvr2Repository.findById(id);
		dvr2Repository.deleteById(id);
		
	}
	
	@Override
	public List<Dvr2Details> getAllDvr2DetailsByDate(LocalDate startDate,LocalDate endDate){
		
		return dvr2Repository.findByDateBetween(startDate,endDate);
	}
	
	@Override
	public Dvr2 saveDvr2New(long id,Dvr2 dvr2) {
		Admin admin=adminService.getAdminById(id);
		dvr2.setAdmin(admin);
		return dvr2NewRepository.save(dvr2);
		
	}
	
	@Override
	public List<Dvr2> getAllDvr2(){
		return dvr2NewRepository.findAll();
	}
	
	
	

}
