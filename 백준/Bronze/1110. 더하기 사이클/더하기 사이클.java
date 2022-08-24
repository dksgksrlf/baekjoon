import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
       
		int N=Integer.parseInt(sc.nextLine()); 
        sc.close();
		int initial_value=N;
		int cycle=0;
		do {
			
			N=((N%10)*10)+(((N/10)+(N%10))%10);
			cycle++;
			
		}while(N!=initial_value);
		System.out.print(cycle);
		
	}

}
