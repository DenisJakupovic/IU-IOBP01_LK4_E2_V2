import java.util.Scanner;
public class DoWhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int zahl;
		int summe = 0;
		do
		{
			System.out.print("Bitte eine Zahl oder -1 eingeben: ");
			zahl = scan.nextInt();
			scan.nextLine();
			summe = summe + zahl;
			
		}while(zahl!=-1);
		
		System.out.println("Die Summe der eingegebenen Werte ist: " + (summe+1));
		
		scan.close();

	}

}
