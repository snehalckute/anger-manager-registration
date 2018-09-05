/**
 * 
 */
package com.brainwave.anger.manager.config;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * @author kutesneh
 *
 */
public class SmtpAuthenticator extends Authenticator {
public SmtpAuthenticator() {

    super();
}

@Override
public PasswordAuthentication getPasswordAuthentication() {
 String username = "user";
 String password = "password";
 username = "snehalckute@yahoo.co.in";
 password = "SKsksk686";
    if ((username != null) && (username.length() > 0) && (password != null) 
      && (password.length   () > 0)) {

        return new PasswordAuthentication(username, password);
    }

    return null;
}
}
