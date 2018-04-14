package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		PrimeNumber pm=new PrimeNumber();
		for(int k=2;k<100;k++) {
			boolean vOutput=pm.isPrimeNumber(k);
			if(vOutput){
				System.out.println(k);
			}
		}

	}



	public boolean isPrimeNumber(int number){
		Boolean isPrimeNumber=true;

			if((number%2)==0){
				isPrimeNumber=false;
			}
			if((number%3)==0){

				isPrimeNumber=false;
			}
			if((number%4)==0){

				isPrimeNumber=false;
			}
			if((number%5)==0){

				isPrimeNumber=false;
			}
			if((number%6)==0){

				isPrimeNumber=false;
			}
			if((number%7)==0){

				isPrimeNumber=false;
			}
			if((number%8)==0){

				isPrimeNumber=false;
			}
			if((number%9)==0){

				isPrimeNumber=false;
			}
			if((number%10)==0){

				isPrimeNumber=false;
			}


		return isPrimeNumber;
	}

}
