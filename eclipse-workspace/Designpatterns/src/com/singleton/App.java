package com.singleton;

import java.util.Scanner;

import com.another.Email;
import com.another.Employee;
import com.another.OutlookEmail;
import com.another.WebService;
import com.calculator.Calculate;
import com.calculator.CalculateFactory;
import com.enheritence.FirstClass;
import com.enheritence.SecondClass;
import com.reflection.Contact;
import com.reflection.FriendContact;
import com.reflection.WorkContact;

public class App {

	public static void main(String[] args) {

		System.out.println("singleton test:");
		
		
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		
		
		
		System.out.println(logger1.hashCode());
		System.out.println(logger2.hashCode());
		
		
		System.out.println("///////////////////");

/////////////////////////
		System.out.println("Enheritance test:");
		
		FirstClass a = new FirstClass();
		SecondClass b = new SecondClass();
		
		
		//SecondClass c = new FirstClass();
		FirstClass d = new  SecondClass();
		d.firstMethod();
		d.secondMethod(); 
		d.espesiallyFirst();
		System.out.println("////////////////////");

//////////////////////////////////////////7
		
		
		
		
		Email mail = new OutlookEmail();
		Email mail1 = new WebService();
		
		Employee emp1 = new Employee(1, "jeff", "zand");
		
		emp1.notifyEmployee(mail);
		emp1.notifyEmployee(mail1);
		
		Email.someMethod();
		
		//////////////////////////
		Contact con1 = new WorkContact();
		con1.name= "damir";
		((WorkContact)con1).email= "njjk@jnjkjkn";
		System.out.println(con1);
		
		
		
		
		Contact con2 = new FriendContact();
		con2.name= "haman";
		((FriendContact)con2).phoneNo= "6866669876896";
		System.out.println(con2);
		
		///////////////////////////7777777//////
		Scanner scan= new Scanner(System.in);
		System.out.println("enter first number");
		double num1 = scan.nextDouble();
		System.out.println("enter the second number ");
		
		double num2 = scan.nextDouble();
		System.out.println("enter the opetation ");
		
		String op = scan.next();
		
		
		CalculateFactory calculateFactory = new CalculateFactory();
		Calculate calObj = calculateFactory.getCalculate(op);
		
         System.out.println(calObj.calc(num1, num2));		
		
		
		

		

	}

}
