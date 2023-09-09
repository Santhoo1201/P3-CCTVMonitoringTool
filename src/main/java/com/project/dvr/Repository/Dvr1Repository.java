package com.project.dvr.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.dvr.Entity.Dvr1Details;

public interface Dvr1Repository extends JpaRepository<Dvr1Details,Long >{
	
	Dvr1Details findById(long id);
	List<Dvr1Details> findByDateBetween(LocalDate startDate,LocalDate endDate);
//	List<Dvr1Details> saveAll(List<Dvr1Details> dvr1Details);
	//List<Dvr1Details> saveAll(List<List<Dvr1Details>> of);
	List<Dvr1Details> findByDate(LocalDate selectDate);

}
