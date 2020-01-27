package com.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;

class Student3 {
	int id;
	String name;
	double cgpa;
	
	public Student3(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}
}

class CGPAComparator implements Comparator<Student3> {
	
	@Override
	public int compare(Student3 a, Student3 b) {
		
		int res = -1;
		
		if (a.cgpa < b.cgpa) {
			res = 1;
		} else if ((a.cgpa == b.cgpa) && a.name.compareTo(b.name) > 0) {
			res = 1;
		} else if ((a.cgpa == b.cgpa) && a.name.compareTo(b.name) == 0
				&& a.id < b.id) {
			res= 1;
		}
		
		return res;
	}
	
}

class Priorities {
	
	public List<Student3> getStudents(List<String> events) {
		List<Student3> studentsList = new ArrayList<Student3>();
		PriorityQueue<Student3> studentQueue = new PriorityQueue<Student3>(events.size(), new CGPAComparator());
		
		for (String event: events) {
			
			String[] splits = event.split(" ");
			if ("ENTER".equalsIgnoreCase(splits[0])) {
				studentQueue.add(new Student3(Integer.parseInt(splits[3]), splits[1], Double.parseDouble(splits[2])));
			} else if ("SERVED".equalsIgnoreCase(splits[0])) {
				studentQueue.poll();
			}
		}
		
		int size = studentQueue.size();
		for (int i =0; i< size; i++) {
			studentsList.add(studentQueue.poll());
		}
		
		return studentsList;
	}
	
}

public class HighestCumulativeGrade {

	 private final static Scanner scan = new Scanner(System.in);
	    private final static Priorities priorities = new Priorities();
	    
	    public static void main(String[] args) {
	        int totalEvents = Integer.parseInt(scan.nextLine());    
	        List<String> events = new ArrayList<>();
	        
	        while (totalEvents-- != 0) {
	            String event = scan.nextLine();
	            events.add(event);
	        }
	        
	        List<Student3> students = priorities.getStudents(events);
	        
	        if (students.isEmpty()) {
	            System.out.println("EMPTY");
	        } else {
	            for (Student3 st: students) {
	                System.out.println(st.getName());
	            }
	        }
	    }
	    
}
