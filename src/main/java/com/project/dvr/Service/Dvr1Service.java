package com.project.dvr.Service;

import java.time.LocalDate;
import java.util.List;

import com.project.dvr.Entity.Dvr1Details;

public interface Dvr1Service {
	
	Dvr1Details saveDvr1(Dvr1Details dvr1Details);
	Dvr1Details getDvr1DetailsById(long id,Dvr1Details dvr1Details);
	Dvr1Details updateDvr1DetailsById(long id,Dvr1Details dvr1Details);
	void deleteDvr1DetailsById(long id,Dvr1Details dvr1Details);
	List<Dvr1Details> getAllDvr1DetailsByDate(LocalDate startDate,LocalDate endDate);
	List<Dvr1Details> getAllDvr1Details();
//	List<Dvr1Details> saveAllDvr1Details(Dvr1Details dvr1Details);
	List<Dvr1Details> saveAllDvr1Details(List<Dvr1Details> dvr1Details);
	List<Dvr1Details> getAllDvr1DetailsBySelectDate(LocalDate selectDate);

}
