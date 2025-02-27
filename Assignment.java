import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) throws FileNotFoundException {
	
		
		        File file = new File("/workspaces/javaprojects/input-3.txt"); 
		        Scanner scanner = new Scanner(System.in); 

		     
		        String oldestStudent = "", youngestStudent = "";
		        double oldestAge = Double.MIN_VALUE, youngestAge = Double.MAX_VALUE;
		        double totalAge = 0;
		        int count = 0;

		        // Print header
		        System.out.println("**********************");
		        System.out.println("*  Photography Club  *");
		        System.out.println("**********************");
		        System.out.println("Name    Age");
		        System.out.println("====    ===");

		        
		        Scanner fileScanner = new Scanner(file);
		        while (fileScanner.hasNext()) {
		            String name = fileScanner.next(); 
		            double age = fileScanner.nextDouble(); 

		           
		            System.out.printf("%-7s %.1f%n", name, age);

		            
		            if (age > oldestAge) {
		                oldestAge = age;
		                oldestStudent = name;
		            }

		            
		            if (age < youngestAge) {
		                youngestAge = age;
		                youngestStudent = name;
		            }

		            
		            totalAge += age;
		            count++;
		        }
		       

		        
		        double averageAge = totalAge / count;

		       
		        System.out.printf("The oldest student is %s. The student is %.1f years old.%n", oldestStudent, oldestAge);
		        System.out.printf("The youngest student is %s. The student is %.1f years old.%n", youngestStudent, youngestAge);
		        System.out.printf("The average age is %.1f%n", averageAge);
		    }
		}

	