package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		System.out.println("Numero de Pessoas para pagar:");
		int n = scan.nextInt();

		for(int i=1;i<=n;i++) {
			System.out.println("Fisica ou Juridica:(1 ou 0)");
			int j = scan.nextInt();
			if(j == 1) {
				System.out.println("Nome:");
				String name = scan.next();
				System.out.println("Renda Anual:");
				double renda = scan.nextDouble();
				System.out.println("Gastos de saude");
				double saude = scan.nextDouble();
				pessoas.add(new PessoaFisica(name,renda,saude));
			}else if(j == 0){
				System.out.println("Nome:");
				String name = scan.next();
				System.out.println("Renda Anual:");
				double renda = scan.nextDouble();
				System.out.println("numero de Funcionarios:");
				int funcionarios = scan.nextInt();
				pessoas.add(new PessoaJuridica(name,renda,funcionarios));
			}else{
				System.out.println("Digite um numero valido");
				i--;
			}
		}
		
		for(int i=0;i < pessoas.size();i++) {
			Pessoa p = pessoas.get(i);
			System.out.println("nome: " + p.getName() + " Imposto:" + p.imposto());
		}
	}

}
