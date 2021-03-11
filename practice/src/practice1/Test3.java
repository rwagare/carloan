package practice1;

import java.util.*;

public class Test3 {
	
	public static void main(String[] args) {
		List l1= new ArrayList();
		l1.add(111);
		l1.add(222);
		l1.add(333);
		
		Set s1= new HashSet();
		s1.add(l1);
		
		Map m= new HashMap();
		m.put(1, s1);
		
		Set ss=m.keySet();
		Iterator itr=ss.iterator();
		while(itr.hasNext())
		{
			int x=(int)itr.next();
			Set s3=(Set) m.get(x);
			Iterator itr1=s3.iterator();
			while(itr1.hasNext())
			{
				List ll=(List)itr1.next();
				Iterator itr2=ll.iterator();
				while(itr2.hasNext())
				{
					int xx=(int)itr2.next();
					System.out.println(xx);
				}
			}
		}
		
	}

}
