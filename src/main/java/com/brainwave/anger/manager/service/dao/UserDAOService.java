/**
 * 
 */
package com.brainwave.anger.manager.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Transactional
	public void register(Registration registration) {
		registrationRepository.save(registration);
	}
	
	public boolean verifyActivation(Long activationCode) {
		Registration resp = registrationRepository.findByActivationCode(activationCode);
		if(null != resp && !resp.isAccountActive() && resp.getActivationCode().equals(activationCode)) {
			resp.setAccountActive(true);
			registrationRepository.save(resp);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifyCredentials(Registration login) {
		Registration resp = registrationRepository.findByEmailAndPasswordAndIsAccountActive(login.getEmail(), login.getPassword(), true);
		if(null != resp) {
			return true;
		} else {
			return false;
		}
	}
	
	@Transactional
	public Long populateActivationCode () {
		Long activationCode = registrationRepository.getNextSeriesId();
		System.out.println(activationCode);
		return activationCode;
	}

}
