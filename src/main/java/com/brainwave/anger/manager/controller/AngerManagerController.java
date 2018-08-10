/**
 * 
 */
package com.brainwave.anger.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brainwave.anger.manager.bean.ActivateRequestBean;
import com.brainwave.anger.manager.bean.ActivateResponseBean;
import com.brainwave.anger.manager.bean.RegistrationRequestBean;
import com.brainwave.anger.manager.bean.RegistrationResponseBean;
import com.brainwave.anger.manager.service.RegistrationService;

/**
 * @author kutesneh
 *
 */
@RestController
@RequestMapping("/anger/management/")
public class AngerManagerController {
	
	@Autowired
	RegistrationService registrationService;
	
	@GetMapping("home")
	public @ResponseBody String populateHome() {
		return "Home";
		
	}
	
	@PostMapping("register")
	public @ResponseBody RegistrationResponseBean register(@RequestBody RegistrationRequestBean registrationRequestBean) {
		return registrationService.register(registrationRequestBean);
	}
	
	@PostMapping("register/activate")
	public @ResponseBody ActivateResponseBean activateProfile(@RequestBody ActivateRequestBean activateRequestBean) {
		return registrationService.activateProfile(activateRequestBean);
	}
}
	