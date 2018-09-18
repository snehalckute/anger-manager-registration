/**
 * 
 */
package com.brainwave.anger.manager.service.dao.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.brainwave.anger.manager.bean.Registration;

/**
 * @author kutesneh
 *
 */
@Service
public interface RegistrationRepository extends CrudRepository<Registration, Long> {

	// custom query example and return a stream
	/*
	 * @Query("select c from Customer c where c.email = :email") Stream<Customer>
	 * findByEmailReturnStream(@Param("email") String email);
	 */
	
	@Query(value = "SELECT activation_code_seq.nextval FROM dual", nativeQuery = true)
	public Long getNextSeriesId();
	
	public Registration findByActivationCode(Long activationCode);
	
	public Registration findByEmailAndPasswordAndIsAccountActive(String email, String password, boolean isActive);
}
