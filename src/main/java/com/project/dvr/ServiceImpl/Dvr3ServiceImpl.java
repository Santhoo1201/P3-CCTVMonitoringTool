package com.project.dvr.ServiceImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.dvr.Entity.Admin;
import com.project.dvr.Entity.Dvr3;
import com.project.dvr.Entity.Dvr3Details;
import com.project.dvr.Repository.Dvr3NewRepository;
import com.project.dvr.Repository.Dvr3Repository;
import com.project.dvr.Service.AdminService;
import com.project.dvr.Service.Dvr3Service;

@Service
public class Dvr3ServiceImpl implements Dvr3Service {
	
	@Autowired
    private Dvr3Repository dvr3Repository;
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private Dvr3NewRepository dvr3NewRepository;
   
	

	public Dvr3ServiceImpl(Dvr3Repository dvr3Repository, AdminService adminService,
			Dvr3NewRepository dvr3NewRepository) {
		super();
		this.dvr3Repository = dvr3Repository;
		this.adminService = adminService;
		this.dvr3NewRepository = dvr3NewRepository;
	}

	@Override
	public Dvr3Details saveDvr3(Dvr3Details Dvr3Details) {
		
		return dvr3Repository.save(Dvr3Details);
	}
	
	@Override
	public Dvr3Details getDvr3DetailsById(long id,Dvr3Details Dvr3Details) {
		
		return dvr3Repository.findById(id);
	}
	
	@Override
	public Dvr3Details updateDvr3DetailsById(long id,Dvr3Details Dvr3Details) {
		
		Dvr3Details existingDetails= dvr3Repository.findById(id);
		existingDetails.setCameras(Dvr3Details.getCameras());
		existingDetails.setRoomName(Dvr3Details.getRoomName());
		existingDetails.setFloorNo(Dvr3Details.getFloorNo());
		existingDetails.setDate(Dvr3Details.getDate());
		existingDetails.setLiveStatus(Dvr3Details.getLiveStatus());
		existingDetails.setPlayBackStatus(Dvr3Details.getPlayBackStatus());
		return dvr3Repository.save(existingDetails);
		
	}
	
	@Override
	public void deleteDvr3DetailsById(long id,Dvr3Details Dvr3Details) {
		
		dvr3Repository.findById(id);
		dvr3Repository.deleteById(id);
		
	}
	
	@Override
	public List<Dvr3Details> getAllDvr3DetailsByDate(LocalDate startDate,LocalDate endDate){
		
		return dvr3Repository.findByDateBetween(startDate,endDate);
	}
	
	@Override
	public Dvr3 saveDvr3new(long id,Dvr3 dvr3) {
		
		Admin adm=adminService.getAdminById(id);
		dvr3.setAdmin(adm);
		return dvr3NewRepository.save(dvr3);
		
	}
	
	@Override
	public List<Dvr3> getAllDvr3(){
		
		return dvr3NewRepository.findAll();
	}
	
	
	
	

}
