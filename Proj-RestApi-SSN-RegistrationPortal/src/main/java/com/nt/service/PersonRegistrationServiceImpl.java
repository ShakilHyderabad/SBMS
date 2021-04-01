package com.nt.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.StateDto;
import com.nt.entity.PersonInfoEntity;
import com.nt.repoesitory.PersonRegistrationRepo;
import com.nt.request.PersonRegistationInfo;

@Service
public class PersonRegistrationServiceImpl  implements PersonRegstrationService{

	
	@Autowired
	private  PersonRegistrationRepo regrepo;
	/*this methode is responsible to get all state from db and showd into dropdown*/

		
			

	
	/*
	 * This methode is responsible to store user data in db and generate ssn number
	 */
	
	@Override
	public String insertPersonInformation(PersonRegistationInfo pinf0) {
	     //dto to entity
		PersonInfoEntity ent=new PersonInfoEntity();
		ent.setFistName(pinf0.getFirstName());
		ent.setLastName(pinf0.getLastName());
		ent.setGendar(pinf0.getGender());
		ent.setDob(pinf0.getDOB());
		ent.setState(pinf0.getState());
	      PersonInfoEntity save = regrepo.save(ent);
		  if(save.getSsn()!=0) {
			  return "Registration Successfully with SSN"+save.getSsn();
		  }
		  else {
			  return "Registration failed please try again";
		  }
	     
	      
	      
	}


	@Override
 	public String validateSsn(int ssn) {
		System.out.println("entering into validate"+ssn);
	 PersonInfoEntity entity;              
       entity= regrepo.getRecordBasedOnSsn(ssn);
       System.out.println("entity="+entity);
		if(entity!=null) {
			return entity.getState();
		}
		else{
			return "given ssn is invalide";
		}
	}

	
	
	
	
	

}
