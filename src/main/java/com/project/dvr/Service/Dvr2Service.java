package com.project.dvr.Service;

import java.time.LocalDate;
import java.util.List;

import com.project.dvr.Entity.Dvr2;
import com.project.dvr.Entity.Dvr2Details;

public interface Dvr2Service {
	
	Dvr2Details saveDvr2(Dvr2Details Dvr2Details);
	Dvr2Details getDvr2DetailsById(long id,Dvr2Details Dvr2Details);
	Dvr2Details updateDvr2DetailsById(long id,Dvr2Details Dvr2Details);
	void deleteDvr2DetailsById(long id,Dvr2Details Dvr2Details);
	List<Dvr2Details> getAllDvr2DetailsByDate(LocalDate startDate,LocalDate endDate);
	Dvr2 saveDvr2New(long id,Dvr2 dvr2);
	List<Dvr2> getAllDvr2();

}
