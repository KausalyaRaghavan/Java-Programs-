package homeassignments;

import java.util.Arrays;

public class Findthematch {
	public static void main(String[] args) {
		int num1[] = {3,8,11,4,9,7};
		int num2[]={1,2,8,4,9,7};
		for (int i=0;i<num1.length;i++) {
			for (int j=0;j<num2.length;j++)
			
			{
				if(num1[i]==num2[j]){
					System.out.println(num1[j]);

				}}
				
		}
		
	}}




