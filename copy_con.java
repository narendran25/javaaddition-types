
public class copy_con {

	/**
	 * @param args
	 */
	int a,b;
	copy_con(int a)
	{
		System.out.println("The Sum of two numbers using COPY CONSTRUCTOR");
		this.a=a;
		
	}
	copy_con(copy_con c)
	{
		a=c.a;
		System.out.println("The sum is "+(a+a));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				copy_con d=new copy_con(12);
				copy_con i=new copy_con(d);
				
			}



		}

	


