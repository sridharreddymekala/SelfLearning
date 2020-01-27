package com.hackerrank;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

class Student5{
	
	int id;
	String name;
	
	public Student5(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Constructor {

	public static void main(String[] args) {
		Student5 s2 = new Student5(2, "Asha");
		Student5 s3 = new Student5(3, "Varnika");
		Student5 s1 = new Student5(1, "Sridhar");
		
		List<Student5> sList = Arrays.asList(s1,s2,s3);
		
		Stream.of(s1,s2,s3).sorted((a,b) -> a.id < b.id?1:-1).forEach(x -> System.out.println(x.name));
	
	}
}

