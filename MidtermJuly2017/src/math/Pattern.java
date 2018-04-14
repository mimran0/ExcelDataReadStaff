package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		
          int n=100;
          for(n=100;n>=90;n--){
          	System.out.println(n);
		  }
		  for(int k=88;k>=70;k=k-2){
          	System.out.println(k);
		  }
		  for(int m=67;m>=40;m=m-3){
		  	System.out.println(m);
		  }
		  for(int a=36;a>=0;a=a-4){
		  	System.out.println(a);
		  }
		
		

	}
}
