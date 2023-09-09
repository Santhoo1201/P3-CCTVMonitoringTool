package com.project.dvr.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dvr.Entity.Admin;
import com.project.dvr.Service.AdminService;

import jakarta.validation.Valid;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}

	@PostMapping("/login")
	public ResponseEntity<Admin> loginAdmin(@RequestBody Admin admin){
		
		return new ResponseEntity<Admin>(adminService.loginAdmin(admin),HttpStatus.OK);
	}
	
	@PostMapping("/signup")
	public ResponseEntity<Admin> saveAdmin(@Valid@RequestBody Admin admin){
		
		return new ResponseEntity<Admin>(adminService.saveAdmin(admin),HttpStatus.OK);
	}
	@GetMapping("{id}")
	public ResponseEntity<Admin> getAdminById(@PathVariable("id")long id){
		
		return new ResponseEntity<Admin>(adminService.getAdminById(id),HttpStatus.OK);
	}
	

}
