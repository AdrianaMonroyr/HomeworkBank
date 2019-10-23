package src;

public class Cuenta {
//variables
private String ownername ="Sally Brown";
public static double amount = 0;
	
//Constructor
public Cuenta() {
	}	

//Set method to save the Owner name variable
		public void setname(String name) {
			this.ownername = name;
		}
//get method to give the Owner name to main
		public String getname() {
			return ownername;
		}


//Retrieve Method
public static void retrievecash() {
//Instance to main class to call the variable that user typed
	Main cash = new Main();
//compare the amount that the user have available with the amount that the user want to retrieve 
	if (amount >= cash.getcash()) {
//subtraction the amount that the user retrieve 
		amount = amount - cash.getcash();
//Show the current amount that the user have when she/he retrieve 
		System.out.println(amount+ "   This is your new amount");
//When the amount that have the user in the account is less than the amount that the user wants to retrieve
	}else {
//Show an advertisement message indicating that the user cannot retrieve
	System.out.println("Isn´t posible retrieve");
	}
		
}

//Add Method
public static void addcash() {
//Instance to main class to call the variable that user typed
	Main cash = new Main();
//add the amount that the user entered with the amount of the account
	amount = amount + cash.getcash();
//Show the current amount that the user have when she/he add
	System.out.println(amount+ "    This is your new amount");
	}

}
