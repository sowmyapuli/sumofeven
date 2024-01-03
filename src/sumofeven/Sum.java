package sumofeven;
public class Sum{
			public static void main(String[] args) 
			{
				int num=20,sum=0;
				
				for( int i = 2; i <= num; i = i + 2)
				{
					sum =sum + i; 
				}
				System.out.println("\n The Sum of Even Numbers upto " + num + " = " +sum);
			}
}


