package practice1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import practice.Array;

public class Test2 {
	
	public static void main(String[] args) {
		Set s1= new HashSet();
		s1.add(1);
		s1.add(2);
		
		Set s2= new HashSet();
		s2.add(3);
		s2.add(4);
		
		List l1= new ArrayList();
		l1.add(s1);
		l1.add(s2);
		
		Set set= new HashSet();
		set.add(l1);
		
		Iterator itr= set.iterator();
		while(itr.hasNext())
		{
			List ll=(List) itr.next();
			Iterator itr1=ll.iterator();
			while(itr1.hasNext())
			{
				Set ss=(Set)itr1.next();
				Iterator itr2=ss.iterator();
				while(itr2.hasNext())
				{
					int aa=(int)itr2.next();
					System.out.println(aa);
				}
			}
		}
		
	}

}
