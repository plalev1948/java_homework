import java.util.Scanner;
public class CountryAdministration {
	public static void main(String[] args) {
		
			int f;
			int g;
//Parts 6 and 7:Code for the biggest and smallest numbers:
			int smallest = 0;
		    int large = 0;
		    int num;
		    
		    
		    System.out.println("Enter the number");   //how many number you want to enter
		    Scanner input = new Scanner(System.in);
		    int n = input.nextInt();
		    num = input.nextInt();
		    smallest = num; 	//assume first entered number as small one
		    // i starts from 2 because we already took one num value
		    for (int i = 2; i < n; i++) {
		        num = input.nextInt();
		        //comparing each time entered number with large one
		        if (num > large) {
		            large = num;
		        }
		        //comparing each time entered number with smallest one
		        if (num < smallest) {
		            smallest = num;
		        }
		    }
		    System.out.println("the largest is:" + large);
		    System.out.println("Smallest no is : " + smallest);
			   
				int a, b, c, swap;
			    Scanner in = new Scanner(System.in);
			 
			    System.out.println("Input number of integers to sort");
			    a = in.nextInt();
			 
			    int array[] = new int[a];
			 
			    System.out.println("Enter " + a + " integers");
			    
			   
		        // Display the menu
		        System.out.println("1\t Sort the input numbers in in ascending order");
		        System.out.println("2\t Sort the input numbers in descending order");
		        System.out.println("3\t Search for a position of a specific number");
		        System.out.println("4\t Shuffle the numbers");
		        System.out.println("5\t Calculate the sum of all numbers");
		        System.out.println("6\t Finding the largest number");
		        System.out.println("7\t Finding the smallest number");
		        System.out.println("8\t Finding the arithmetic mean of the numbers");
		        System.out.println("9\t Check for symmetry of an array of numbers");
		        System.out.println("10\t Inverting an array of numbers");
		        System.out.println("11\t Visualize the entered numbers");
		        System.out.println("12\t Exit");

		        System.out.println("Please enter your choice:");
		        
		        //Get user's choice
		        int choice=in.nextInt();
		         
		        //Display the title of the chosen module
		        switch (choice) {
		            case 1: System.out.println("Sort the input numbers in in ascending order"); 
		            		break;
		            case 2: System.out.println("Sort the input numbers in descending order");
		                    break;
		            case 3: System.out.println("Search for a position of a specific number"); 
		                    break;
		            case 4: System.out.println("Shuffle the numbers"); 
		                     break;
		            case 5: System.out.println("Calculate the sum of all numbers"); 
		            		break;
		            case 6: System.out.println("Finding the largest number"); 
		            		break;
		            case 7: System.out.println("Finding the smallest number"); 
		            		break;
		            case 8: System.out.println("Finding the arithmetic mean of the numbers"); 
		            		break;
		            case 9: System.out.println("Check for symmetry of an array of numbers"); 
                    		break;
		            case 10: System.out.println("Inverting an array of numbers"); 
		            		break;
		            case 11: System.out.println("Visualize the entered numbers"); 
		            		break;
		            case 12: System.out.println("Exit"); 
                    		break;
		            default: System.out.println("Invalid choice");
		        }//end of switch
		    //end of the main method
		//end of class
			 
			    for (b = 0; b < a; b++)
			      array[b] = in.nextInt();
			   
			    for (b = 0; b < ( a - 1 ); b++) {
			      for (c = 0; c < a - b - 1; c++) {
			        if (array[c] > array[c+1]) // For descending order use < //
			        {
			          swap       = array[c];
			          array[c]   = array[c+1];
			          array[c+1] = swap;
			        }
			      }
			    }
			 
			    System.out.println("Sorted list of numbers:");
			 
			    for (b = 0; b < a; b++)
			      System.out.println(array[b]);

			    
		 //Part 11:Visualize the entered numbers:
		 // input from standard input - keyboard
		        Scanner reader = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = reader.nextInt();

		        
		        System.out.println("You entered: " + number);
		 //Part 12:The Exit part of the program:
			    System.out.println("End of Program"); 
			    System.out.println("exit..."); 
			  }
	}

