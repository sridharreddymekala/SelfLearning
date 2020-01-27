package com.hackerrank;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class MD5Generator {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String s1 = sc.next();
			sc.close();
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(s1.getBytes());
			byte[] digest = md.digest();
			String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();
			System.out.println(myHash);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} 

	}
}
