/**
 * 
 */
package com.brainwave.anger.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brainwave.anger.manager.bean.ActivateResponseBean;
import com.brainwave.anger.manager.bean.LoginResponseBean;
import com.brainwave.anger.manager.bean.Registration;
import com.brainwave.anger.manager.bean.RegistrationResponseBean;
import com.brainwave.anger.manager.service.dao.UserDAOService;
import com.brainwave.anger.manager.service.helper.RegistrationHelper;

/**
 * @author kutesneh
 *
 */
@Service
public class RegistrationService {
	
	@Autowired
	RegistrationHelper registrationHelper;
	
	@Autowired
	Long uniqueId;
	
	@Autowired
	UserDAOService userDAOService;
	
	@Autowired
	MailSenderService mailSenderService;

	
	public RegistrationResponseBean register(Registration registration) {
		//Set Activation code in DB
		registration.setActivationCode(userDAOService.populateActivationCode());
		
		//Register in DB
		userDAOService.register(registration);
		
		//mailSenderService.sendActivationMail(uniqueId, registration.getEmail());
		return (RegistrationResponseBean) registrationHelper.buildRegistrationSuccessResponse(uniqueId);
	}
	
	public ActivateResponseBean activateProfile(Long activationCode) {
		
		if(userDAOService.verifyActivation(activationCode)) {
		return (ActivateResponseBean) registrationHelper.buildActivationSuccessResponse(uniqueId);
		} else {
			return (ActivateResponseBean) registrationHelper.buildActivationErrorResponse(uniqueId);	
		}
	}
	
	public LoginResponseBean login(Registration login) {
		if(userDAOService.verifyCredentials(login)) {
			return (LoginResponseBean) registrationHelper.buildLoginSuccessResponse(uniqueId);
		} else {
			return (LoginResponseBean) registrationHelper.buildLoginErrorResponse(uniqueId);
		}
	}
   
}
