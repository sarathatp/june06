package javaprograms.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basics 
{

	public static void main(String[] args) 
	{
		
		int num=5;
		
		int[] num_arr = new int[4];
		
		num_arr[0] =1;
		num_arr[1]=2;
		num_arr[2]=3;
		num_arr[3]=4;
		
		
		System.out.println(num_arr[2]);
		System.out.println("----------------------------------------\n");
		
		int[] num_arr2= {3,6,8};
		
		System.out.println(num_arr2[2]);
		
		System.out.println(num_arr2);
		
		System.out.println("----------------------------------------\n");
		
		
		for(int i=0;i<num_arr.length;i++)
		{
			System.out.println(num_arr[i]);
			 
		}

		System.out.println("----------------------------------------\n");
		
		 
		for(int i=num_arr.length-1;i>=0;i--)
		{
			System.out.println(num_arr[i]);
			 
		}
		
		System.out.println("----------------------------------------\n");
		
		String[] n=new String[3];
		n[0]="cell";
		n[1]="battery";
		n[2]="screen";
		//n[3]="mic";
		
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
		
		System.out.println("----------------------------------------\n");
		
		
		String[] names={"sarath","kumar","chandra","sekhar"};
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		

		System.out.println("----------------------------------------\n");
		
		for(String c:names)
		{
			System.out.println(c);
		}
		

		System.out.println("----------------------------------------\n");
		System.out.println("------------Multiples of 2--------------\n");
		
		int[] numbers= {2,45,62,7,9,4,342,56,78,543,76543,98765432};
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2==0)
			{
				System.out.println(numbers[i]);
			}
			else
			{
				System.out.println(numbers[i]+" is not a multiple of 2");
			}
		
		}
		
		System.out.println("----------------------------------------\n");
		System.out.println("--Break--Quit Loop If Multiple of 2 found--\n");
		
		int[] numbers2= {2,45,62,7,9,4,342,56,78,543,76543,98765432};
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers2[i]%2==0)
			{
				System.out.println(numbers[i]);
				break;
			}
			else
			{
				System.out.println(numbers[i]+" is not a multiple of 2");
			}
		
		}
		
		
		System.out.println("----------------------------------------\n");
		System.out.println("--------Array List-----------------------\n");
				
		ArrayList<String> val=new ArrayList<String>();
		val.add("qa");
		val.add("dev");
		val.add("ceo");
		val.add("cfo");
		
		System.out.println(val.get(2));
		
		for(int i=0;i<val.size();i++)
		{
			System.out.println(val.get(i));
		}
		System.out.println("--for each--");
		for(String c:val)
		{
			System.out.println(c);
		}
		
		System.out.println("--contains method--");
		System.out.println(val.contains("dev"));
		System.out.println(val);
		

		System.out.println("----------------------------------------\n");
		
		
		List<String> namesArrList=Arrays.asList(names);
		System.out.println(namesArrList.contains("kumar"));
		
		
		System.out.println("----------------------------------------\n");
		System.out.println("--------String--------------------\n");
		
		String s1="Selenium Automation Using Java";
		String s2="Selenium Automation Using Java";
		
				
		String s3 = new String("Python");
		String s4 = new String();
		s4="Python";
		
		System.out.println("s3 is "+s3);
		System.out.println("s4 is "+s4);
		

		String s5="Selenium Automation Using Java";
		String[] splitArray=s5.split("Automation");
		
		System.out.println(splitArray[0]);
		System.out.println(splitArray[1]);
		//System.out.println(splitArray[2]);
		//System.out.println(splitArray[3]);
		
		System.out.println(splitArray[1].trim());
		
		//--iterate through string--
		System.out.println("--iterate through string--");
		
		String s6="Selenium Automation Using Java";
		
		for(int i=0;i<s6.length();i++)
		{
			System.out.println(s6.charAt(i));
		}
		
		//--reverse order print--
		System.out.println("--reverse order print--");
		for(int i=s6.length()-1;i>=0;i--)
		{
			System.out.println(s6.charAt(i));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
