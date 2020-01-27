package com.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
	/*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    	List<Integer> gradeList = new ArrayList<Integer>();

    	for (Integer grade: grades) {
    		double diff= (Math.ceil(grade/5.0) * 5) - grade;
    		
    		if (grade < 38 || ((int) diff) >= 3) {
    			gradeList.add(grade);
    		} else {
    			gradeList.add(grade + (int) diff);
    		}
    	}

    	return gradeList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = GradingStudents.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
//            bufferedWriter.write(String.valueOf(result.get(i)));
        		System.out.println(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
//                bufferedWriter.write("\n");
            	System.out.println("\n");
            }
        }

//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
