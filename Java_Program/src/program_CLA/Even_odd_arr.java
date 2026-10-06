// unknown - Write a Java program to separate command-line arguments (CLA) into even and odd numbers.
// Parse each argument as an integer and store even and odd values into separate arrays while maintaining their respective counts.
// Print the even numbers followed by their count, and the odd numbers followed by their count.
// input  - Command Line Arguments: 12 7 19 24 5 8
// output - Even :: 12 24 8 ,Count :: 3
//          Odd :: 7 19 5 ,Count :: 3

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
