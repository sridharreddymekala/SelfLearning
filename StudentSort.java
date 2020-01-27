package com.hackerrank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student1{
	private int id;
	private String fname;
	private double cgpa;
	public Student1(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class StudentComparator implements Comparator<Student1> {
	
	public int compare(Student1 a, Student1 b) {
			int res = -1;
			
			if (a.getCgpa() < b.getCgpa()) {
				res = 1;
			} else if ((a.getCgpa() == b.getCgpa()) && (a.getFname().compareTo(b.getFname()) > 0)) {
				res = 1;
			} else if ((a.getCgpa() == b.getCgpa()) && (a.getFname().compareTo(b.getFname()) == 0) 
					&& a.getId() > b.getId()) {
				res = 1;
			}
		
	        return res;
	    }
}

public class StudentSort {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student1> studentList = new ArrayList<Student1>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student1 st = new Student1(id, fname, cgpa);
			studentList.add(st);
			
			Collections.sort(studentList, new StudentComparator());
			
			testCases--;
		}
      
      	for(Student1 st: studentList){
			System.out.println(st.getFname());
		}
	}
}
