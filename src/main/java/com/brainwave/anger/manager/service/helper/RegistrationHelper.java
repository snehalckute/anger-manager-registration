/**
 * 
 */
package com.brainwave.anger.manager.service.helper;

import org.springframework.stereotype.Service;

import com.brainwave.anger.manager.bean.ActivateResponseBean;
import com.brainwave.anger.manager.bean.GenericResponseBean;
import com.brainwave.anger.manager.bean.RegistrationResponseBean;
import com.brainwave.anger.manager.constants.AngerManagerConstants;

/**
 * @author kutesneh
 *
 */
@Service
public class RegistrationHelper {
	
	
	
	private GenericResponseBean buildSuccessResponse(Long uniqueId, GenericResponseBean response) {
		response.setCode(0);
		response.setStatus(AngerManagerConstants.STATUS.SUCCESS);
		response.setEvent(AngerManagerConstants.EVENT.LOGIN);
		response.setUniqueId(uniqueId);
		return response;
	}
	
	public GenericResponseBean buildActivationSuccessResponse(Long uniqueId) {
		GenericResponseBean response = new ActivateResponseBean();
		return buildSuccessResponse(uniqueId, response);
	}
	
	public GenericResponseBean buildRegistrationSuccessResponse(Long uniqueId) {
		GenericResponseBean response = new RegistrationResponseBean();
		return buildSuccessResponse(uniqueId, response);
	}

}
