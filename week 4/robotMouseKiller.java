	//1-�� ����� �� ��������
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
            inFrontOfTheRobot = "�����";
            System.out.println("Go Sideway!");
            break;
        case 2:
        	inFrontOfTheRobot = "����";
            System.out.println ("Jump!");
            break;
        default:
        	inFrontOfTheRobot = "����";
            System.out.println("Forward!");
            break;

		}
	
		System.out.println ("In front of the robot we have: " + inFrontOfTheRobot);
	}
		
	//2-�� ����� �� ��������
		if ( battleSystem == true) {
			System.out.println("������� � ���� ������");
			}
			else {
			System.out.println("������� �� � ���� ������");
			}
		
		if ( battleCapacity == true) {
			System.out.println("��� ��� � ���������");
			}
			else {
			System.out.println("��������� � ������");
			}
		
		if ( furnitureHit == true) {
			System.out.println("�� ������ ����� � ������");
			}
			else {
			System.out.println("���� �� ������ �����");
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

	//3-�� ����� �� ������
			int testEnergy(num) {		  
		if (num < 1) {
			return "�� ���������� ������� �� �����";
			} else if (num > 1) {
			 return "�������� �������� ���";
		}
			}
			
			
	//4-�� ����� �� ��������		
			int electicityValue(a, b) {
				  if (a == b) {
				    return "��������� ���� �����";
				  }
				  else if (a > b) {
				    return "������ ��� ���";
				  }
				  else {
				    return "������ ���� ���";
				  }
				}
		
         
	// 5-�� ����� �� �������� 
  
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