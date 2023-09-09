package com.project.dvr.Service;

import java.time.LocalDate;
import java.util.List;

import com.project.dvr.Entity.Dvr3;
import com.project.dvr.Entity.Dvr3Details;



public interface Dvr3Service {
	
	Dvr3Details saveDvr3(Dvr3Details Dvr3Details);
	Dvr3Details getDvr3DetailsById(long id,Dvr3Details Dvr3Details);
	Dvr3Details updateDvr3DetailsById(long id,Dvr3Details Dvr3Details);
	void deleteDvr3DetailsById(long id,Dvr3Details Dvr3Details);
	List<Dvr3Details> getAllDvr3DetailsByDate(LocalDate startDate,LocalDate endDate);
	Dvr3 saveDvr3new(long id,Dvr3 dvr3);
	List<Dvr3> getAllDvr3();

}
