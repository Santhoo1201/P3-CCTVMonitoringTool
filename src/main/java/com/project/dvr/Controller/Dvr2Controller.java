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

import com.project.dvr.Entity.Dvr2;
import com.project.dvr.Entity.Dvr2Details;

import com.project.dvr.Service.Dvr2Service;

import jakarta.validation.Valid;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/dvr2")
public class Dvr2Controller {
	
	@Autowired
	private Dvr2Service dvr2Service;

	public Dvr2Controller(Dvr2Service dvr2Service) {
		super();
		this.dvr2Service = dvr2Service;
	}

	@PostMapping("/save")
	public ResponseEntity<Dvr2Details> saveDvr1(@Valid @RequestBody Dvr2Details Dvr2Details){
		
		return new ResponseEntity<Dvr2Details> (dvr2Service.saveDvr2(Dvr2Details),HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Dvr2Details>  getDvr2DetailsById(@PathVariable("id")long id,@RequestBody Dvr2Details Dvr2Details){
		
		return new ResponseEntity<Dvr2Details> (dvr2Service.getDvr2DetailsById(id,Dvr2Details),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Dvr2Details> updateDvr2DetailsById(@PathVariable("id") long id,@RequestBody Dvr2Details Dvr2Details){
		
		return new ResponseEntity<Dvr2Details> (dvr2Service.updateDvr2DetailsById(id,Dvr2Details),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteDvr2DetailsById(@PathVariable("id") long id,@RequestBody Dvr2Details Dvr2Details){
		
		dvr2Service.deleteDvr2DetailsById(id,Dvr2Details);
		String msg="Deleted Successfully a DVR2_Details By Id ";
		return new  ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	
	@GetMapping("{startDate}/{endDate}")
	public List<Dvr2Details> getAllDvr2DetailsByDate(@PathVariable("startDate") LocalDate startDate,@PathVariable("endDate") LocalDate endDate){
		
		return dvr2Service.getAllDvr2DetailsByDate(startDate,endDate);
	}
	
	@PostMapping("/new/{id}")
	public ResponseEntity<Dvr2> saveDvr2(@PathVariable("id")long id,@RequestBody Dvr2 dvr2){
		
		return new ResponseEntity<Dvr2>(dvr2Service.saveDvr2New(id,dvr2),HttpStatus.CREATED);
	}
	@GetMapping("/dvr2newlist")
	public List<Dvr2> getAllDvr2(){
		
		return dvr2Service.getAllDvr2();
	}
	
	

}
