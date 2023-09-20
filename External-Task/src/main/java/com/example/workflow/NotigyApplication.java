package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class NotigyApplication implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		String email=(String) execution.getVariable("email");
		String status=(String) execution.getVariable("status");
		String reason=(String) execution.getVariable("reason");
		
		SendEmail obj=new SendEmail();
		obj.sendemail(email,status,reason);
		
		
	}

}
