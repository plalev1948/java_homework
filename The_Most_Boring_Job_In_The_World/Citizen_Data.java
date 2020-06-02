
public class Citizen_Data {
	
	public static void main(String[] args) {

		
		CitizenInformation citizen_characterictics = new CitizenInformation();	//creates object of class Citizen_Information
		
		citizen_characterictics.firstName = 1;
		citizen_characterictics.lastName = 2;
		citizen_characterictics.typeOfGender1 = 'M';
		citizen_characterictics.age = 38;
		citizen_characterictics.phoneNumber = 359898747;

		
		System.out.println("citizen_characterictics : " + citizen_characterictics.firstName + '/' + citizen_characterictics.lastName + '/' + 
				citizen_characterictics.age + '/'  + citizen_characterictics.typeOfGender1 + '/'+ citizen_characterictics.phoneNumber);
		


		
	}
	

}

class CitizenInformation{
	int firstName;				//first name of the citizen
	int lastName;				//last name of the citizen
	int age;					//age
	int phoneNumber;			//phoneNumber
	char typeOfGender1 = 'M';	
	char typeOfGender2 = 'F';
	
class TypeOfCitizens{
	char pensioner ='R';
	char workingClass ='W';
	char mothers ='M';
	double pension = 300;
	double salary = 400;
	double helpForMothers = 250;
	
}
class children{
	String firstName = " ";
	String lastName = " ";
	int age;
	char typeOfCitizenship;
	int numberOfKids;
	
}
class SpecialCharacteristics{
	String myText1 = "Pensioners have pensions"; 
	String myText2 = "Working class people have salaries"; 
	String myText3 = "Mothers have children"; 
	
}
	}
