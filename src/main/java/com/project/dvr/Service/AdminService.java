package com.project.dvr.Service;

import com.project.dvr.Entity.Admin;

public interface AdminService {
	
	Admin loginAdmin(Admin admin);
	Admin saveAdmin(Admin admin);
	Admin getAdminById(long id);

}
