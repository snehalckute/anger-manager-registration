/**
 * 
 */
package com.brainwave.anger.manager.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brainwave.anger.manager.bean.ActivateRequestBean;
import com.brainwave.anger.manager.bean.ActivateResponseBean;
import com.brainwave.anger.manager.bean.Registration;
import com.brainwave.anger.manager.bean.RegistrationResponseBean;
import com.brainwave.anger.manager.config.SmtpAuthenticator;
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
	
	
	/*public String host = "smtp.gmail.com";
    public String port = "587";
    public String password = "SKsksk686888";
    public String username = "snehalckute@gmail.com";*/
    
    
    
    
    public String host = "smtp.mail.yahoo.com";
    public String port = "465";
    public String password = "SKsksk686888@";
    public String username = "snehalckute@yahoo.co.in";
    
    
    
    
	
	public RegistrationResponseBean register(Registration registration) {
		userDAOService.register(registration);
		//sendActivationMail(uniqueId, registration.getEmail());
		//sendMail();
		return (RegistrationResponseBean) registrationHelper.buildRegistrationSuccessResponse(uniqueId);
	}
	
	public ActivateResponseBean activateProfile(ActivateRequestBean activateRequestBean) {
		return (ActivateResponseBean) registrationHelper.buildActivationSuccessResponse(uniqueId);
	}
	
	private void sendMail() {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.ssl.enable","true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port);
		props.put("mail.smtp.socketFactory.fallback", "true");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("snehalchandrakant.kute@gi-de.com"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler,"
				+ "\n\n No spam to my email, please!");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
	
    
    
    
	private void sendActivationMail(Long uniqueId, String receiverMail) {
		
		//String host, port, username, password;
		Properties props = System.getProperties();
		Session l_session = null;

	        emailSettings(host, port, props, username);
	        createSession(l_session, username, password, props);
	        sendMessage(username, /*receiverMail*/ "snehalchandrakant.kute@gi-de.com","Activation: Anger Manager","Activation link - http://localhost:3333/anger/management/activate/"+uniqueId, l_session, props);
	   
	}
	
    public void emailSettings(String host, String port, Properties props, String username) {
        props.put("mail.smtp.host", host);
        props.put("mail.stmp.user" , username);
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "false");
        props.put("mail.smtp.port", port);
        
        //To use TLS
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.password", password);
//        props.put("mail.smtp.socketFactory.port", port);
//        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.socketFactory.fallback", "false");

    }
    
    public void createSession(Session l_session, String username, String password, Properties props) {

        l_session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        l_session.setDebug(true); // Enable the debug mode

    }
    
    public boolean sendMessage(String emailFromUser, String toEmail, String subject, String msg, Session l_session,  Properties props) {
        //System.out.println("Inside sendMessage 2 :: >> ");
        try {
            //System.out.println("Sending Message *********************************** ");
          //  MimeMessage message = new MimeMessage(l_session);
            
            MimeMessage message = new MimeMessage(Session
            .getDefaultInstance(props, new SmtpAuthenticator()));
            
            //emailid = emailFromUser;
            //System.out.println("mail id in property ============= >>>>>>>>>>>>>> " + emailid);
            //message.setFrom(new InternetAddress(emailid));
            message.setFrom(new InternetAddress(emailFromUser));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.addRecipient(Message.RecipientType.BCC, new InternetAddress(emailFromUser));
            message.setSubject(subject);
            message.setContent(msg, "text/html");

            //message.setText(msg);
            Transport.send(message);
            System.out.println("Message Sent");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }//end catch block
        return true;
    }

}
