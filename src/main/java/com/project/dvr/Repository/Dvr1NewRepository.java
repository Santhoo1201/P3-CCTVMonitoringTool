package com.project.dvr.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.dvr.Entity.Dvr1;

public interface Dvr1NewRepository extends JpaRepository<Dvr1,Long>{

	List<Dvr1> findByAdminId(long id);
	

}
