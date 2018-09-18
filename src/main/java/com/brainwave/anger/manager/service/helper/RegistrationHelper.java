/**
 * 
 */
package com.brainwave.anger.manager.service.helper;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brainwave.anger.manager.bean.ActivateResponseBean;
import com.brainwave.anger.manager.bean.GenericResponseBean;
import com.brainwave.anger.manager.bean.LoginResponseBean;
import com.brainwave.anger.manager.bean.RegistrationResponseBean;
import com.brainwave.anger.manager.constants.AngerManagerConstants;

/**
 * @author kutesneh
 *
 */
@Service
public class RegistrationHelper {
	
	
	private GenericResponseBean buildSuccessResponse(AngerManagerConstants.EVENT event, Long uniqueId, GenericResponseBean response) {
		setGenericResponseValues(event, uniqueId, response);
		response.setCode(0);
		response.setStatus(AngerManagerConstants.STATUS.SUCCESS);
		return response;
	}
	
	private GenericResponseBean buildErrorResponse(AngerManagerConstants.EVENT event, Integer errorCode, String displayErrorMessage, List<String> technicalErrorMessages, Long uniqueId, GenericResponseBean response) {
		setGenericResponseValues(event, uniqueId, response);
		response.setCode(errorCode);
		response.setDisplayMessages(displayErrorMessage);
		response.setTechnicalMessages(technicalErrorMessages);
		response.setStatus(AngerManagerConstants.STATUS.FAILED);
		return response;
	}
	
	private void setGenericResponseValues(AngerManagerConstants.EVENT event, Long uniqueId, GenericResponseBean response) {
		response.setEvent(event);
		response.setUniqueId(uniqueId);
	}
	
	public GenericResponseBean buildActivationSuccessResponse(Long uniqueId) {
		GenericResponseBean response = new ActivateResponseBean();
		return buildSuccessResponse(AngerManagerConstants.EVENT.LOGIN,uniqueId, response);
	}
	
	public GenericResponseBean buildLoginSuccessResponse(Long uniqueId) {
		GenericResponseBean response = new LoginResponseBean();
		return buildSuccessResponse(AngerManagerConstants.EVENT.HOME, uniqueId, response);
	}
	
	public GenericResponseBean buildActivationErrorResponse(Long uniqueId) {
		GenericResponseBean response = new ActivateResponseBean();
		return buildErrorResponse(AngerManagerConstants.EVENT.ERROR, 1, "Account Activation Failed", null, uniqueId, response);
	}
	
	public GenericResponseBean buildLoginErrorResponse(Long uniqueId) {
		GenericResponseBean response = new LoginResponseBean();
		return buildErrorResponse(AngerManagerConstants.EVENT.LOGIN, 2, "Incorrect Username or Password", null, uniqueId, response);
	}
	
	public GenericResponseBean buildRegistrationSuccessResponse(Long uniqueId) {
		GenericResponseBean response = new RegistrationResponseBean();
		return buildSuccessResponse(AngerManagerConstants.EVENT.ACTIVATE_PROFILE, uniqueId, response);
	}

}
