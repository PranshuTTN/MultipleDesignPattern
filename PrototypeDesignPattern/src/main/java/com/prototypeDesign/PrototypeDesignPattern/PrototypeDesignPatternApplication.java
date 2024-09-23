package com.prototypeDesign.PrototypeDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrototypeDesignPatternApplication {

	public static void main(String[] args) throws CloneNotSupportedException{
		Employees emps = new Employees();
		emps.loadData();

		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("Udayan");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pranshu");

		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

}
