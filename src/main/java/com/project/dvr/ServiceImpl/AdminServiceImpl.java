package com.project.dvr.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dvr.Entity.Admin;
import com.project.dvr.Repository.AdminRepository;
import com.project.dvr.Service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;
	
	public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	@Override
	public Admin loginAdmin(Admin admin) {
		
		return adminRepository.findBySfmIdAndAdminPassword(admin.sfmId,admin.adminPassword);
	}
	
	@Override
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	@Override
	public Admin getAdminById(long id) {
		
		return adminRepository.findById(id);
	}

}
