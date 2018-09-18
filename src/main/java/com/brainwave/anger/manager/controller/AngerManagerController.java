/**
 * 
 */
package com.brainwave.anger.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brainwave.anger.manager.bean.ActivateRequestBean;
import com.brainwave.anger.manager.bean.ActivateResponseBean;
import com.brainwave.anger.manager.bean.LoginResponseBean;
import com.brainwave.anger.manager.bean.Registration;
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
	
	
	@GetMapping("test")
	public @ResponseBody String test(){
		return "test";
	}
	
	@PostMapping("register")
	public @ResponseBody RegistrationResponseBean register(@RequestBody Registration registration) {
		return registrationService.register(registration);
	}
	
	@GetMapping("activate/{activationCode}")
	public @ResponseBody ActivateResponseBean activateProfile(@PathVariable Long activationCode) {
		return registrationService.activateProfile(activationCode);
	}
	
	@PostMapping("login")
	public @ResponseBody LoginResponseBean login(@RequestBody Registration login) {
		return registrationService.login(login);
	}
}
	