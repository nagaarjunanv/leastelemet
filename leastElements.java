

import java.io.*;
import java.util.*;

public class leastElements {

	public static void main(String[] args) {
		/*Scanner x=new Scanner(System.in);
		System.out.println("enter the value");
		int number =x.nextInt();
		System.out.println("enter the total elements to delete");
		int i=0,cnt=0,data=0,num=number;
		int cnt_del =x.nextInt();
		
		
		while(number!=0)
		{
			number/=10;
			cnt++;
		}
		int array_Data[] = new int [cnt];
		for(i=0;i<cnt;i++)
		{
			data=num%10;
			num/=10;
		array_Data[i]=data;
		}
		
		Arrays.sort(array_Data);
		
		for(i=0;i<cnt-cnt_del;i++)
        System.out.print(" "+array_Data[i]);*/
		
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value");
		int number =x.nextInt();
		System.out.println("enter the total elements to delete");
		int i=0,cnt=0,data=0,num=number;
		int cnt_del =x.nextInt();
		
		TreeSet list=new TreeSet();
		
		while(number!=0)
		{
			data=number%10;
			number/=10;
			list.add(data);
			cnt++;
		}
		//for(i=cnt;i>=cnt-cnt_del;i--)
			//list.remove(i);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			System.out.print(" "+obj);
		}
	}

}
