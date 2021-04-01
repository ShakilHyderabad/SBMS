package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.PersonRegstrationService;

@RestController
public class SsnValidateRestController {
          @Autowired
	      PersonRegstrationService ser;
	
	  @GetMapping("/val/{ssn}")
	   public  ResponseEntity<String> validateSsn(@PathVariable("ssn") int ssn ){
	     String res;
	    System.out.println("ssncontroller="+ssn);
	     //System.out.println("serv"+ser);
	     res=ser.validateSsn(ssn);
	  return new ResponseEntity<String>(res,HttpStatus.OK);
}
}