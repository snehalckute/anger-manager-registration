/**
 * 
 */
package com.brainwave.anger.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brainwave.anger.manager.bean.ActivateRequestBean;
import com.brainwave.anger.manager.bean.ActivateResponseBean;
import com.brainwave.anger.manager.bean.RegistrationRequestBean;
import com.brainwave.anger.manager.bean.RegistrationResponseBean;
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
	
	public RegistrationResponseBean register(RegistrationRequestBean registrationRequestBean) {
		return (RegistrationResponseBean) registrationHelper.buildRegistrationSuccessResponse(uniqueId);
	}
	
	public ActivateResponseBean activateProfile(ActivateRequestBean activateRequestBean) {
		return (ActivateResponseBean) registrationHelper.buildActivationSuccessResponse(uniqueId);
	}

}
