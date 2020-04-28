package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;
import com.org.lab1.employee.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(01, "Ntin",30000.0));
		empList.add(new Employee(02,"Ankit",66000.0));
		empList.add(new Employee(03,"Abhishek", 36000.0));
		empList.add(new Employee(04,"Ankur",37000.0));
		
		return empList;
	}
}
