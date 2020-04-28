	//1-ва точка от задачата
import java.util.Scanner;

public class robotMouseKiller {
	public static void main(String[] args)  {
        
		String inFrontOfTheRobot;
        int movement = 1;
        
        boolean battleSystem = true;
        boolean batteryCapacity = true;
        boolean furnitureHit = true;
        
        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int testEnergy = 0;
        
        int electicityValue = 1;
        
		switch (movement) {
        case 1:
            inFrontOfTheRobot = "Стена";
            System.out.println("Go Sideway!");
            break;
        case 2:
        	inFrontOfTheRobot = "Стол";
            System.out.println ("Jump!");
            break;
        default:
        	inFrontOfTheRobot = "Нищо";
            System.out.println("Forward!");
            break;

		}
	
		System.out.println ("In front of the robot we have: " + inFrontOfTheRobot);
	}
		
	//2-ра точка от задачата
		if ( battleSystem == true) {
			System.out.println("Мишката е пред робота");
			}
			else {
			System.out.println("Мишката не е пред робота");
			}
		
		if ( battleCapacity == true) {
			System.out.println("Има ток в батерията");
			}
			else {
			System.out.println("Батерията е празна");
			}
		
		if ( furnitureHit == true) {
			System.out.println("Ще ударим мебел в къщата");
			}
			else {
			System.out.println("Няма да ударим мебел");
			}
		
			
			shuffleArray(arrayOfNumbers);
			for (int i = 0; i < arrayOfNumbers.length; i++)
		    {
		    System.out.print(arrayOfNumbers[i] + " ");
		    }
			System.out.println(numbers.subList(0, 1));
		    if (val == 5) {
		    	arrayOfNumbers = "Break the furniture!";
			} else {
				arrayOfNumbers  = "Doesn't break the furniture";
			}
			
			System.out.println ("In front of the robot we have: " + inFrontOfTheRobot);
}

	//3-та точка от зачата
			int testEnergy(num) {		  
		if (num < 1) {
			return "Не достатъчно енергия за битка";
			} else if (num > 1) {
			 return "Маркирай следваща цел";
		}
			}
			
			
	//4-та точка от задачата		
			int electicityValue(a, b) {
				  if (a == b) {
				    return "Генерирай нови числа";
				  }
				  else if (a > b) {
				    return "Робота има ток";
				  }
				  else {
				    return "Робота няма ток";
				  }
				}
		
         
	// 5-та точка от задачата 
  
		 robotCommunication (val) {
		  var answer = "";
		  switch (val) {
		    case 2:
		    case 4:
		    case 6:
		    case 8:
		    case 10:
		      return "I am robot";
		      break;
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 9:
		      return " ";
		      break;
		  }
		  return answer;
		sequentialSizes(1);
}