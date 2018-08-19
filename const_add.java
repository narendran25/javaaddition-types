import java.util.Scanner;
public class const_add {

	/**
	 * @param args
	 */
	double c, a,b;
	
	Scanner s=new Scanner(System.in);
	const_add()
	{
		System.out.println("Addition Of Two Numbers using constructor overloading");
		
	}
	const_add(double a,double b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println("The Sum of addition is="+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
				const_add d=new const_add();
				const_add i=new const_add(12,6);
				const_add r=new const_add(12.8,6.2);
			
			}
			

		}

	


