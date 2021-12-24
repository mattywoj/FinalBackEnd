package com.Final.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Final.models.Resident;
import com.Final.services.ResidentService;

@RestController
@CrossOrigin("*")
public class ResidentController {
	@Autowired
	ResidentService resservice = new ResidentService();
	//create
	@PostMapping("/api/v1/residents")
	public Resident addResident(@RequestBody Resident res) {
		return resservice.createResident(res);
	}
	//read
	@GetMapping("/api/v1/residents")
	public List<Resident> getResident(){
			return resservice.getResident();
		}
	}

