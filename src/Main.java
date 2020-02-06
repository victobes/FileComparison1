import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
	    try{
	    	
	    	File first = new File("src/first");
			File second = new File("src/second");
			Scanner f =new Scanner(first);
			Scanner s = new Scanner(second);
			
			while(f.hasNext() && s.hasNext()){
		        String str1=f.next();
		        String str2=s.next();
		        //s.hasNextByte();
		        for (int i = 0; i < str1.length(); i++) {
		 	        	if (str1.charAt(i) != str2.charAt(i)) {
		 	        		System.out.println(str1.charAt(i) + " " + str2.charAt(i));
		 	        		
		 	        	}
		        }
		    }
			
			
		    f.close();
		    s.close();
		 
	    }catch(Exception ex){
	        System.out.println("Что - то пошло не так");
	    }
   }
}
