package practice1;

import java.util.*;

public class Test4 {
	
	public static void main(String[] args) {
		//map of map of list of integer
		
		List l= new ArrayList();
		l.add(11);
		l.add(22);
		l.add(33);
		
		Map m1= new HashMap();
		m1.put(1, l);
		
		Map m2= new HashMap();
		m2.put(2, m1);
		
		Set key1=m2.keySet();
		Iterator itr= key1.iterator();
		while(itr.hasNext())
		{
			int x=(int)itr.next();
			Map m3=(Map)m2.get(x);
			 Set key2=m3.keySet();
			 Iterator itr1=key2.iterator();
				while(itr1.hasNext())
				{
					int x1=(int)itr1.next();
					List ll=(List)m3.get(x1);
					Iterator itr3=ll.iterator();
					while(itr3.hasNext())
					{
						int xx=(int)itr3.next();
						System.out.println(xx);
					}
				}
				 
			 }
		}
		
	}


