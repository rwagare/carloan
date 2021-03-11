package practice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	 public static void main(String[] args) {
		List<Integer> l1= new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		List<Integer> l2= new ArrayList<Integer>();
		l2.add(40);
		l2.add(50);
		l2.add(60);
		
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		list.add(l1);
		list.add(l2);
		
		
		System.out.println("\n--------------using for each----------------\n");
		for(List<Integer> ll :list)
		{
			for(int i: ll)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("\n--------------using iterator----------------\n");
		
		Iterator<List<Integer> > itr=list.iterator();
		while(itr.hasNext())
		{
			List<Integer> l3= itr.next();
			Iterator<Integer> itr1= l3.iterator();
			while(itr1.hasNext())
			{
				int a=itr1.next();
				System.out.println(a);
			}
			
		}
	 }
}
