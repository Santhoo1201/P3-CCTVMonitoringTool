package com.project.dvr.Controller;

import java.util.List;

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

import com.project.dvr.Entity.Dvr1;
import com.project.dvr.Service.Dvr1NewService;

import jakarta.validation.Valid;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/dvr1new")
public class Dvr1NewController {
	
	@Autowired
	private Dvr1NewService dvr1NewService;

	public Dvr1NewController(Dvr1NewService dvr1NewService) {
		super();
		this.dvr1NewService = dvr1NewService;
	}
	
	@PostMapping("{id}")
	public ResponseEntity<Dvr1> saveDvr1(@PathVariable("id")long id,@Valid@RequestBody Dvr1 dvr1){
		
		return new ResponseEntity<Dvr1> (dvr1NewService.saveDvr1(id,dvr1),HttpStatus.CREATED);
	}
	
	@GetMapping()
	public List<Dvr1> getAllDvr1ById(){
		
		return dvr1NewService.getAllDvr1();
	}
	

}
