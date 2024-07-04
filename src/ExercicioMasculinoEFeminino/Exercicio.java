package ExercicioMasculinoEFeminino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***** EXERCICIO MÓDULO 11 *****");
		System.out.println("***** CADASTRO DE PESSOAS: *****");
		String resp = "";
		List<Masculino> listaMasculina = new ArrayList<>();
		List<Feminino> listaFeminina = new ArrayList<>();
		
		while(!resp.equalsIgnoreCase("N")) {
			System.out.println("Digite o nome => ");
			String nome = sc.nextLine();
			System.out.println("Digite a idade => ");
			Integer idade = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o gênero => [M/F]");
			String genero = sc.nextLine();
			if (genero.equalsIgnoreCase("M")) {
				Masculino masculino = new Masculino(nome, idade);
				listaMasculina.add(masculino);
			}
			else if (genero.equalsIgnoreCase("F")) {
				Feminino feminino = new Feminino(nome, idade);
				listaFeminina.add(feminino);
			}
			else {
				System.out.println("Porfavor, digite um valor válido.");
			}
			System.out.println("Deseja continuar ? [S/N]");
			resp = sc.nextLine();
			
		}
		
		for(Masculino masculino: listaMasculina) {
			System.out.println(listaMasculina);
		}
		
		for (Feminino feminino: listaFeminina) {
			System.out.println(listaFeminina);
		}
	}

}
