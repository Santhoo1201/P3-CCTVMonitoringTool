package com.project.dvr.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.dvr.Entity.Dvr2Details;

public interface Dvr2Repository extends JpaRepository<Dvr2Details,Long> {
	
	Dvr2Details findById(long id);
	List<Dvr2Details> findByDateBetween(LocalDate startDate,LocalDate endDate);

}
