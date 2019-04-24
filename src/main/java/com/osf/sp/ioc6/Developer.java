package com.osf.sp.ioc6;

import org.springframework.stereotype.Component;

@Component
public class Developer extends Worker {
	
	public Developer() {
		super("개발자","IT팀");
	}

	@Override
	public void doWork() {
		System.out.println("개발");
	}

	@Override
	public void goToOffice() {
		System.out.println("개발회사");
	}

}
