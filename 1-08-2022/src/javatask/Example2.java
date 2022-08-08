package javatask;
// write a program to  find simple interest .....
public class Example2 {

	public static void main(String[] args)
	{
		int p=60000 ;
		
		double  month=18 ,monthInYr=12, n=month/monthInYr;
		double r=2.5,result;
			result=(p*n*  r)/100;
		
		System.out.println("Simple interest : = " + result);
		

	}

}
