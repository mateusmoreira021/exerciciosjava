package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("quantos quartos serao alugados ? ");
		int n = sc.nextInt();
		
		System.out.println();
		for(int i = 1; i <= n; i++) {
			System.out.println("ALUGUEL #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("quartos ocupados");
		
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " +vect[i]);
			}
		}
		
		sc.close();

	}

}
