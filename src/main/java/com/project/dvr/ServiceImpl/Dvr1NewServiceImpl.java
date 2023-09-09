package com.project.dvr.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dvr.Entity.Admin;
import com.project.dvr.Entity.Dvr1;
import com.project.dvr.Repository.Dvr1NewRepository;
import com.project.dvr.Service.AdminService;
import com.project.dvr.Service.Dvr1NewService;

@Service
public class Dvr1NewServiceImpl implements Dvr1NewService{
	
	@Autowired
	private Dvr1NewRepository dvr1NewRepository;
	
	@Autowired
	private AdminService adminService;

	public Dvr1NewServiceImpl(Dvr1NewRepository dvr1NewRepository) {
		super();
		this.dvr1NewRepository = dvr1NewRepository;
	}
	
	@Override
	public Dvr1 saveDvr1(long id,Dvr1 dvr1) {
		
		Admin ad=adminService.getAdminById(id);
		dvr1.setAdmin(ad);
		return dvr1NewRepository.save(dvr1);
	}
	
	@Override
	public List<Dvr1> getAllDvr1(){
		
		return dvr1NewRepository.findAll();
	}

}
