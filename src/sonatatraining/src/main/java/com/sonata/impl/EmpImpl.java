package com.sonata.impl;
import com.sonata.intf.EmpIntf;
import com.sonata.model1.Employee;

public class EmpImpl implements EmpIntf{

	@Override
	public double yearlySal(Employee e1) {
		double ysal;
		ysal=e1.getEmpSal()*12;
		
		return ysal;
	}

	@Override
	public double appSal(Employee e1) {
		double asal;
		if(e1.getEmpSal()<10000){
			asal=5000;
		}else {
			asal=1000;
		}
		
		return asal;
	}

}
