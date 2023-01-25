import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int um,dois,tres;
		um= teclado.nextInt();
		dois= teclado.nextInt();
		tres= teclado.nextInt();
		int media= (um+dois+tres)/3;
		System.out.println("media " +media);
		
		
	}

}
