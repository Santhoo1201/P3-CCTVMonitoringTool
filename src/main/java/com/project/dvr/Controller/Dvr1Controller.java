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

import com.project.dvr.Entity.Dvr1Details;
import com.project.dvr.Service.Dvr1Service;

import jakarta.validation.Valid;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/dvr1")
public class Dvr1Controller {
	
	@Autowired
	private Dvr1Service dvr1Service;
	
	
	public Dvr1Controller(Dvr1Service dvr1Service) {
		super();
		this.dvr1Service = dvr1Service;
	}


	@PostMapping("/save")
	public ResponseEntity<Dvr1Details> saveDvr1(@Valid @RequestBody Dvr1Details dvr1Details){
		
		return new ResponseEntity<Dvr1Details> (dvr1Service.saveDvr1(dvr1Details),HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Dvr1Details>  getDvr1DetailsById(@PathVariable("id")long id,@RequestBody Dvr1Details dvr1Details){
		
		return new ResponseEntity<Dvr1Details> (dvr1Service.getDvr1DetailsById(id,dvr1Details),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Dvr1Details> updateDvr1DetailsById(@PathVariable("id") long id,@RequestBody Dvr1Details dvr1Details){
		
		return new ResponseEntity<Dvr1Details> (dvr1Service.updateDvr1DetailsById(id,dvr1Details),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteDvr1DetailsById(@PathVariable("id") long id,@RequestBody Dvr1Details dvr1Details){
		
		dvr1Service.deleteDvr1DetailsById(id,dvr1Details);
		String msg="Deleted Successfully a DVR1_Details By Id ";
		return new  ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	
	@GetMapping("{startDate}/{endDate}")
	public List<Dvr1Details> getAllDvr1DetailsByDate(@PathVariable("startDate") LocalDate startDate,@PathVariable("endDate") LocalDate endDate){
		
		return dvr1Service.getAllDvr1DetailsByDate(startDate,endDate);
	}
	
	@GetMapping()
	public List<Dvr1Details> getAllDvr1Details(){
		
		return dvr1Service.getAllDvr1Details();
	}
	
	@PostMapping("/saveall")
	public List<Dvr1Details> saveAllDvr1Details(@RequestBody List<Dvr1Details> dvr1Details){
		
		return dvr1Service.saveAllDvr1Details(dvr1Details);
		
	}
	@GetMapping("getdvr1/{selectDate}")
	public List<Dvr1Details> getAllDvr1DetailsBySelectDate(@PathVariable("selectDate")LocalDate selectDate){
		
		return dvr1Service.getAllDvr1DetailsBySelectDate(selectDate);
	}

}
