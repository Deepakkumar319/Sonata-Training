package com.sonata.Main;
import com.sonata.impl.EmpImpl;

import com.sonata.model1.Employee;

public class EmpExecut {
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		
		e1.setEmpId(123);
		e1.setEmpName("Deepak");
		e1.setEmpSal(100);
		EmpImpl e2=new EmpImpl();
		System.out.println((e2.yearlySal(e1)));
		System.out.println((e2.appSal(e1)));
		
	}

}
