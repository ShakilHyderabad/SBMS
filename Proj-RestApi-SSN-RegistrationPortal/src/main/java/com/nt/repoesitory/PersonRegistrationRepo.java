package com.nt.repoesitory;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nt.entity.PersonInfoEntity;

public interface PersonRegistrationRepo extends JpaRepository<PersonInfoEntity, Serializable> {

  /*
   * chek the givn ssn corrosponing record is avalilable or not	
   */
	@Query("FROM PersonInfoEntity WHERE ssn=:ssn")
	public PersonInfoEntity getRecordBasedOnSsn(int ssn);
	
	
	
}
