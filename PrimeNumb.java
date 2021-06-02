
public class PrimeNumb {
	public static void main(String[] args) {
		
		String primenum =" ";
		for(int i=100;i>=1;i--){
			int counter=0;
			for (int num=i;num>=1;num--) {
				if (i%num==0) {
					counter +=1;
				}
			}
			if (counter==2) {
				primenum= primenum+i+",";
			}	
		}
		System.out.println("The prime numbers between 2 and 100 are :");
		System.out.print(primenum);
	}
}
