import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encryption encryption = new Encryption();
		
		String password = "";
		Scanner sc = new Scanner(System.in);
	   
		for (int i = 0; i < 2; i++) {
			System.out.print("Digite uma senha:");
		    password = sc.next();
		    String passwordEncryption =  encryption.criptografar(password);
				
			System.out.println("\nSenha criptografada: " + passwordEncryption + "\n");
		}
		System.out.println("--------------------------");
		System.out.println("Aplicação encerrada!");


	}

}
