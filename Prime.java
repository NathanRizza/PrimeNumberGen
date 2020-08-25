//Nathan Rizza
// 8/25/2020

package PrimeNumber;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
	
		Scanner numScanner = new Scanner(System.in);
		int tempNum = 2, endNumber = 1;
	
		System.out.println("Enter the starting number");
		tempNum = numScanner.nextInt();
		System.out.println("Enter the end number");
		endNumber =numScanner.nextInt();
	
		if ((tempNum % 2) == 0) 
		{ 
			tempNum++; 
		} 
	
		while(tempNum <= endNumber) 
		{
			boolean isPrime = true;
		
			for(int i=3;i < tempNum; i=i+2) 
			{
				if(tempNum % i ==0)
				{
				isPrime = false;
				break;
				}
			}
		
			if (isPrime) 
			{
				System.out.println(tempNum + " is Prime.");
			}
		
			tempNum =tempNum +2;
		}
		numScanner.close();
		System.out.println("Program Finished");
	}
	
}
