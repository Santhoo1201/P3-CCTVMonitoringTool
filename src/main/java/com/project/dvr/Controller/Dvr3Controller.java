package com.project.dvr.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dvr.Entity.Dvr3;
import com.project.dvr.Entity.Dvr3Details;
import com.project.dvr.Service.Dvr3Service;

import jakarta.validation.Valid;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/dvr3")
public class Dvr3Controller {
	
	
	@Autowired
	private Dvr3Service dvr3Service;
	
	public Dvr3Controller(Dvr3Service dvr3Service) {
		super();
		this.dvr3Service = dvr3Service;
	}

	@PostMapping("/save")
	public ResponseEntity<Dvr3Details> saveDvr1(@Valid @RequestBody Dvr3Details Dvr3Details){
		
		return new ResponseEntity<Dvr3Details> (dvr3Service.saveDvr3(Dvr3Details),HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Dvr3Details>  getDvr3DetailsById(@PathVariable("id")long id,@RequestBody Dvr3Details Dvr3Details){
		
		return new ResponseEntity<Dvr3Details> (dvr3Service.getDvr3DetailsById(id,Dvr3Details),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Dvr3Details> updateDvr3DetailsById(@PathVariable("id") long id,@RequestBody Dvr3Details Dvr3Details){
		
		return new ResponseEntity<Dvr3Details> (dvr3Service.updateDvr3DetailsById(id,Dvr3Details),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteDvr3DetailsById(@PathVariable("id") long id,@RequestBody Dvr3Details Dvr3Details){
		
		dvr3Service.deleteDvr3DetailsById(id,Dvr3Details);
		String msg="Deleted Successfully a DVR3_Details By Id ";
		return new  ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	
	@GetMapping("{startDate}/{endDate}")
	public List<Dvr3Details> getAllDvr3DetailsByDate(@PathVariable("startDate") LocalDate startDate,@PathVariable("endDate") LocalDate endDate){
		
		return dvr3Service.getAllDvr3DetailsByDate(startDate,endDate);
	}
	
	@PostMapping("/new/{id}")
	public ResponseEntity<Dvr3> saveDvr3new(@PathVariable("id")long id,@RequestBody Dvr3 dvr3){
		return new ResponseEntity<Dvr3>(dvr3Service.saveDvr3new(id,dvr3),HttpStatus.CREATED);
	}
	
	@GetMapping("/dvr3newlist")
	public List<Dvr3> getAllDvr3(){
		
		return dvr3Service.getAllDvr3();
	}
	
	


}
