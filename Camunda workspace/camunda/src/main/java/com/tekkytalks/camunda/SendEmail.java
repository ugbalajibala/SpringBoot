package com.tekkytalks.camunda;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;



public class SendEmail {

    public void sendEmail(String toAddress,String status,String rejectReason) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(toAddress);

       
        msg.setSubject("Reg:Status of loan application");
        if(status.equals("Approved")) {

            msg.setText("This is to inform you that your loan application got"+ status);
        }else{

            msg.setText("This is to inform you that your loan application got"+ status +"with reason"+ rejectReason);
        }

        
        EmailSender emailSender=new EmailSender();
        JavaMailSender javamailsender=emailSender.getJavaMailSender();
        javamailsender.send(msg);

    }


    
    
    
    
}
