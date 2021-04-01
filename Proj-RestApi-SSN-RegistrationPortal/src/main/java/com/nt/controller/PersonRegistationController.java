package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.StateDto;
import com.nt.request.PersonRegistationInfo;
import com.nt.service.PersonRegstrationService;

@RestController
public class PersonRegistationController {
 @Autowired
	private  PersonRegstrationService service;
	
  @PostMapping(value="/reg",
		                              consumes = {"application/json","application/xml"})
   public ResponseEntity<String>  enrollPersonForSsn(@RequestBody PersonRegistationInfo info) {
    String res;
   res=service.insertPersonInformation(info);
    return new  ResponseEntity<String>(res,HttpStatus.CREATED);
  }
  
  
  
}
	
	
	