package com.example.Project2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class Project2 {
	
	private static void Students(String name) {
		// TODO Auto-generated constructor stub
	String id[] = {"1,2,3,4"};
	String firstName[] = {"Caleb,Aida,Alex,Meba"};
	String gpa[] = {"3.6","3.1","3.4","3.2"};
	String email[] = {"jdtg0@aws,com","adattt@test.gov","Adavis@bccs.com","mtravis@yahoo.com"};
	String gender[] = {"Male","Female"};
	
	}
	@GetMapping("/id")
	public String Id() {
		return id[] ;
}
	@GetMapping("/firstName")
	public String FirstName(){
		return firstName[];
	
}
	@GetMapping("/gpa")
	public String Gpa(){
		return gpa[] ;
		
}
	@GetMapping("/email")
	public String Email(){
		return email[] ;
}
	@GetMapping("/gender")
	public String Gender(){
		return gender[] ;
		}
	}

