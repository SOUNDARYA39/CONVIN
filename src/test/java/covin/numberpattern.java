package covin;

public class numberpattern {

	public static void main(String[] args) {
	
  int n=5;
  for(int a=1;a<=5;a++)
  {
	  for(int b=4;b>=a;b--)
	  {
		System.out.print(" ");  
	  }
	  for(int c=1;c<=a;c++)
	  {
		 System.out.print(c); 
	  }
	  System.out.println();
  }
	}

}
