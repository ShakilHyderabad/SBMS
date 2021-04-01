package com.nt.testrestcontroller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.controller.PersonRegistationController;
import com.nt.request.PersonRegistationInfo;
import com.nt.service.PersonRegstrationService;

import oracle.security.crypto.core.SREntropySource;

@RunWith(SpringRunner.class)
@WebMvcTest(value=PersonRegistationController.class)
public class PersonRegistarationControllerTest {
	//to send http request  to rest
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private PersonRegstrationService service;
	
	
	@Test
	public void enrollPersonForSsnTest()throws Exception {
	
		when(service.insertPersonInformation(Mockito.any(PersonRegistationInfo.class))).thenReturn("Valide");
		
		//prepair body
		PersonRegistationInfo info=new PersonRegistationInfo();
		info.setFirstName("srk");
		info.setLastName("khan");
		info.setGender("male");
		info.setDOB("20/1/1980");
		info.setState("maharashtra");
		//convert to json
		ObjectMapper mapper=new ObjectMapper();
		String jsonData=mapper.writeValueAsString(info);
		//prepair http post reques
		MockHttpServletRequestBuilder postReq = MockMvcRequestBuilders.post("/reg").contentType(MediaType.APPLICATION_JSON)
		                                                                             .content(jsonData);
		
		 MvcResult result = mockMvc.perform(postReq).andReturn();
		 
		  MockHttpServletResponse response = result.getResponse();
		 
		  System.out.println("rest Result="+response.getContentAsString()); 
		  
		  int status=response.getStatus();
		 
		  assertEquals(201, status);
		 
		  
		  
		//send http request
		         
	}
	

}
