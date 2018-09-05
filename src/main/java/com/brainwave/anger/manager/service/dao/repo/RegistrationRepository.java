/**
 * 
 */
package com.brainwave.anger.manager.service.dao.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.brainwave.anger.manager.bean.Registration;

/**
 * @author kutesneh
 *
 */
@Service
public interface RegistrationRepository extends CrudRepository<Registration, Long> {

	/*
	 * List<Customer> findByEmail(String email);
	 * 
	 * List<Customer> findByDate(Date date);
	 */

	// custom query example and return a stream
	/*
	 * @Query("select c from Customer c where c.email = :email") Stream<Customer>
	 * findByEmailReturnStream(@Param("email") String email);
	 */

}
