package program_CLA;

public class Even_odd_arr {

	public static void main(String[] args) {
		
		int n = args.length;
		int EvenCount=0,OddCount=0;
		int even[] = new int[n];
		int odd[] = new int[n];
		
		for(int k=0;k<n;k++) {
			int a = Integer.parseInt(args[k]);
			if(a%2==0)
				even[EvenCount++]=a;
			else
				odd[OddCount++]=a;
		}
		
		System.out.print("Even :: ");
		for(int k=0;k<EvenCount;k++) {
			System.out.print(even[k]+" ");
		}
		System.out.println(",Count :: "+EvenCount);
		
		System.out.print("Odd :: ");
		for(int k=0;k<OddCount;k++) {
			System.out.print(odd[k]+" ");
		}
		System.out.println(",Count :: "+OddCount);
	}

}
