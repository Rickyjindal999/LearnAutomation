package testcases_maven;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class JavaMail {

	public static void main(String[] args) throws EmailException
	
	{
		System.out.println("Test Started");
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("rickyjindal999@gamil.com", "Kunal@16"));
		email.setSSLOnConnect(true);
		email.setFrom("gupta.sahil161190@gmail.com");
		email.setSubject("Selenium");
		email.setMsg("This is a test mail from selenium");
		email.addTo("gupta.sahil1990@yahoo.com");
		email.send();
		
		
		System.out.println("Email sent");
	}

}
