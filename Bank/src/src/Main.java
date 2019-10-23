package src;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static double cash = 0;
	
	

	public static void main(String[] args) throws IOException {
		//call run method that contain the menu options 
		run();
			
		//variable to save the option that the user type
		char option = (char)System.in.read();
		
			switch (option) {
			//Option 1 when the user need retrieve
			case '1':
			//call the Option1 method
				option1();
			//Instance the  Cuenta class
				Cuenta myCuenta = new Cuenta();
			//call method to retrieve
				myCuenta.retrievecash();
			break;
			//Option 2 when the user need add
			case '2':
			//call the Option2 method
				option2();
			//Instance the Cuenta class
				Cuenta myCuenta2 = new Cuenta();
			//call method to add
				myCuenta2.addcash();;
			break;
			//Exit Option
			case '3':
			System.exit(0);
			break;
			default:
			//When the user type an inexistent option
			System.out.println("The option doesn´t exist");
			}option = (char) System.in.read();
			} 
	
			
	
	
	//MENU OPTIONS	
		public static void run() {
			//Instance the  Cuenta class
			Cuenta myCuenta3 = new Cuenta();
			System.out.println("Hi Dear:");
			//call method get to show the client name
			System.out.println(myCuenta3.getname());
			System.out.println("WELCOME TO OUR MENÚ:");
			System.out.println("1 If You want Retrieve");
			System.out.println("2 If You want Add");
			System.out.println("3 If You want Exit");
		}
		
		//Set method to save the cash variable
		public void setcash(double cash) {
			this.cash = cash ;
		}
		//get method to give the variable to the Cuenta Class
		public double getcash() {
			return cash;
		}
		
		//Method to show the information referent to retrieve to the user 
		public static void option1() {
		//Ask to the user
			System.out.println("How many cash do you want to retrieve?");
		//scan that the user type
			Scanner teclado = new Scanner(System.in);
			cash = teclado.nextDouble();
			
		}

		//Method to show the information referent to add to the user 
		public static void option2() {
		//Ask to the user
			System.out.println("How many cash do you want to add?");
		//scan that the user type
			Scanner teclado = new Scanner(System.in);
			cash = teclado.nextDouble();
			
		}
		
		
		

		
}