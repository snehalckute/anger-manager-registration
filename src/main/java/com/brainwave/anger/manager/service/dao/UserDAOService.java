/**
 * 
 */
package com.brainwave.anger.manager.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brainwave.anger.manager.bean.Registration;
import com.brainwave.anger.manager.service.dao.repo.RegistrationRepository;

/**
 * @author kutesneh
 *
 */
@Service
public class UserDAOService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	public void register(Registration registration) {
		registrationRepository.save(registration);
	}

}
