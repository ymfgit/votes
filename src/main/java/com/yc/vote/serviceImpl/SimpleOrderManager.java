/*package com.yc.vote.serviceImpl;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.core.annotation.Order;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;

import com.yc.vote.service.OrderManager;

public class SimpleOrderManager implements OrderManager {

	 private MailSender mailSender;
	    private SimpleMailMessage templateMessage;

	    public void setMailSender(MailSender mailSender) {
	        this.mailSender = mailSender;
	    }

	    public void setTemplateMessage(SimpleMailMessage templateMessage) {
	        this.templateMessage = templateMessage;
	    }

	    public void placeOrder(Order order) {

	        // Do the business calculations...

	        // Call the collaborators to persist the order...

	        // Create a thread safe "copy" of the template message and customize it
	        SimpleMailMessage msg = new SimpleMailMessage(this.templateMessage);
	        msg.setTo(order.getCustomer().getEmailAddress());
	        msg.setText(
	            "Dear " + order.getCustomer().getFirstName()
	                + order.getCustomer().getLastName()
	                + ", thank you for placing order. Your order number is "
	                + order.getOrderNumber());
	        try{
	            this.mailSender.send(msg);
	        }
	        catch (MailException ex) {
	            // simply log it and go on...
	            System.err.println(ex.getMessage());
	        }
	    }
}
*/