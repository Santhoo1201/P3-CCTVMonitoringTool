package com.project.dvr.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.dvr.Entity.Dvr3Details;

public interface Dvr3Repository extends JpaRepository<Dvr3Details,Long>{
	
	
	Dvr3Details findById(long id);
	List<Dvr3Details> findByDateBetween(LocalDate startDate,LocalDate endDate);

}
