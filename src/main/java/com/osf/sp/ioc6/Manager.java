package com.osf.sp.ioc6;

import org.springframework.stereotype.Component;

@Component
public class Manager extends Worker {
	public Manager() {
		super("매니저","IT팀");
	}
	
	public void doWork() {
		System.out.println("감독");

	}

	public void goToOffice() {
		System.out.println("감독회사");
	}

}
