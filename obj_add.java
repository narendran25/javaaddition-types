import java.util.Scanner;


public class obj_add {

	/**
	 * @param args
	 */
	int a,b,c;
	void addition()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your A value=");
	a=s.nextInt();
	System.out.println("Enter your B value=");
	b=s.nextInt();
	c=a+b;
	System.out.println("The Sum of addition is="+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   obj_add d=new obj_add();
	   d.addition();
			
		}
		}

	


