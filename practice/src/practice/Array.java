package practice;

public class Array {
	public static void main(String[] args) {
		
	

	String s[]= {"abc" , "pqr", "xyz"};
	char c []= {'a','A','b', 'f', 'm', 'q'};
	
	 c[0]='a';
	 c[1]='A';
	 c[2]='b';
	 c[3]='f';	 
	 c[4]='m';
	 c[5]='q';
	 
	for(int i=0;i<=c.length; i++)
	{
		System.out.println(c[i]);
	}
}
}