package com.Final.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Final.models.Resident;
import com.Final.repository.ResidentRepository;

@Service
public class ResidentService {
	@Autowired
	ResidentRepository resRepo;
	List<Resident> residentList = new ArrayList<Resident>();
	
	//Create Resident
	public Resident createResident(Resident res) {
		residentList.add(res);
		return resRepo.save(res);
	}
	
	//Get all Residents
	public ArrayList<Resident> getResident(){
		return (ArrayList<Resident>) resRepo.findAll();
	}
	
	
	
}
