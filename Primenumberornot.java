package homeassignments;

import java.util.Scanner;

public class Primenumberornot {
	public static void main(String[] args) {
		Scanner Primenumner= new Scanner(System.in);
		System.out.println("Enter the value");
		int prime = Primenumner.nextInt();
		System.out.println("The number is"+prime);
		 if(prime%2==1) {
			 System.out.println("The given number is prime");
		 }else {
			 System.out.println("The given number is not prime");
		 }
		 
}}