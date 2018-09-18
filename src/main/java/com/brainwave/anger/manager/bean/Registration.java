/**
 * 
 */
package com.brainwave.anger.manager.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

/**
 * @author kutesneh
 *
 */
@Entity
public class Registration {
	
/*	@Entity
	public class GeneralSequenceNumber {
	  @Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACTIVATION_CODE_SEQ")
	    @SequenceGenerator(sequenceName = "activation_code_seq", allocationSize = 1, name = "ACTIVATION_CODE_SEQ")
	  private Long activationCode;
	}*/
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USR_SEQ")
    @SequenceGenerator(sequenceName = "user_seq", allocationSize = 1, name = "USR_SEQ")
    private Long id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneCountryCode;
	private String phoneNumber;
	private char isTermsAndConditionsAgreed;
	
	@Column(unique = true)
	private Long activationCode;
	
	private boolean isAccountActive;
	
	
	/**
	 * @return the isAccountActive
	 */
	public boolean isAccountActive() {
		return isAccountActive;
	}
	/**
	 * @param isAccountActive the isAccountActive to set
	 */
	public void setAccountActive(boolean isAccountActive) {
		this.isAccountActive = isAccountActive;
	}
	/**
	 * @return the activationCode
	 */
	public Long getActivationCode() {
		return activationCode;
	}
	/**
	 * @param activationCode the activationCode to set
	 */
	public void setActivationCode(Long activationCode) {
		this.activationCode = activationCode;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the isTermsAndConditionsAgreed
	 */
	public char getIsTermsAndConditionsAgreed() {
		return isTermsAndConditionsAgreed;
	}
	/**
	 * @param isTermsAndConditionsAgreed the isTermsAndConditionsAgreed to set
	 */
	public void setIsTermsAndConditionsAgreed(char isTermsAndConditionsAgreed) {
		this.isTermsAndConditionsAgreed = isTermsAndConditionsAgreed;
	}
	/**
	 * @return the isTermsAndConditionsAgreed
	 *//*
	public Boolean getIsTermsAndConditionsAgreed() {
		return isTermsAndConditionsAgreed;
	}
	*//**
	 * @param isTermsAndConditionsAgreed the isTermsAndConditionsAgreed to set
	 *//*
	public void setIsTermsAndConditionsAgreed(Boolean isTermsAndConditionsAgreed) {
		this.isTermsAndConditionsAgreed = isTermsAndConditionsAgreed;
	}*/
	/**
	 * @return the phoneCountryCode
	 */
	public String getPhoneCountryCode() {
		return phoneCountryCode;
	}
	/**
	 * @param phoneCountryCode the phoneCountryCode to set
	 */
	public void setPhoneCountryCode(String phoneCountryCode) {
		this.phoneCountryCode = phoneCountryCode;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
