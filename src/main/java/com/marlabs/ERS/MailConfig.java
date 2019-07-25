package com.marlabs.ERS;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MailConfig {

	@Autowired
	private JavaMailSender javaMailSender;
	@Autowired
	private Environment env;

	public void send(String body) throws MessagingException {
		String from = env.getProperty("spring.mail.username");
		String to = env.getProperty("spring.mail.sendTo");
		String subject = "ERS Scheduler Notofication";
		MimeMessage message = javaMailSender.createMimeMessage();
		message.setFrom(new InternetAddress(from));
		MimeMessageHelper helper;
		helper = new MimeMessageHelper(message, true);
		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body, true);
		javaMailSender.send(message);
	}
}
