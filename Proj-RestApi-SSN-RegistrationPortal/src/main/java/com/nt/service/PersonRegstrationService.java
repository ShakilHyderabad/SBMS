package com.nt.service;

import java.util.List;

import com.nt.dto.StateDto;
import com.nt.request.PersonRegistationInfo;

public interface PersonRegstrationService {
	
	
	public String insertPersonInformation(PersonRegistationInfo pinf0);
    public String validateSsn(int ssn);
}
