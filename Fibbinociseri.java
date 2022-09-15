package homeassignments;

import java.util.Scanner;

public class Fibbinociseri {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the Number");
	int Fibno=input.nextInt();
	System.out.println("The Number is");
	int i=0,j=1;
    int k=0;
	for(i=2;i<=Fibno;i++) {
		i=j;
		j=k;
		k=i+j;
		System.out.println(k);
		}  
}}   