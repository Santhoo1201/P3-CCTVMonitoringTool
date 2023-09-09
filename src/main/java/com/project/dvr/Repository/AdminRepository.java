package com.project.dvr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dvr.Entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
	
	Admin findBySfmIdAndAdminPassword(String sfmId,String password);
	Admin findById(long id);

}
