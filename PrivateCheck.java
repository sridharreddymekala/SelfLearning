package com.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Permission;

public class PrivateCheck {

	public static void main(String[] args) throws Exception {
		DoNotTerminate2.forbidExit();	

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
			
            Constructor<Inner.Private> privateConst = (Constructor<Inner.Private>) Inner.Private.class.getDeclaredConstructors()[0];
            privateConst.setAccessible(true);
            
        	Inner.Private inner = privateConst.newInstance(new Inner());
        	o = inner;
            String message = inner.powerof2(num);
			
            System.out.println(num + " is " + message);
			System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		
		}//end of try
		catch (DoNotTerminate2.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}//end of main
	static class Inner{
		private class Private{
			private String powerof2(int num){
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}//end of Inner
	
}//end of Solution

class DoNotTerminate2 { //This class prevents exit(0)
	 
    public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
