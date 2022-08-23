package com.sonata.test;
import com.sonata.model1.*;
import com.sonata.intf.*;
import com.example.demo.Addinterface;
import com.example.demo.DefaultAddition;
import com.sonata.impl.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class EmpTest {
	@Test
	void addTest1() {
		EmpImpl c1=new EmpImpl();
		Employee e1=new Employee();
		e1.setEmpSal(100);
		assertEquals(1200.0,c1.yearlySal(e1));
		
		
	}
	

}
