import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//objeto teclado da nova classe Scanner;
		
		String candidato[] = new String[5];; 
		int voto[] = new int [5];;
		int votacao, totalVotos, maiorVotacao;
		
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Canditado "+ (i + 1));
			candidato[i] = teclado.nextLine();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Canditado "+ (i + 1) + ":" + candidato[i] + " ");
		}
		
		totalVotos = 0;
		
		do {
			System.out.print("\nQual o seu cadidato");
			votacao = teclado.nextInt();
			
			switch(votacao) {
			case 1: 
				voto[0]++;
				totalVotos++;
				break;
			case 2: 
				voto[1]++;
				totalVotos++;
				break;
			case 3: 
				voto[2]++;
				totalVotos++;
				break;
			case 4: 
				voto[3]++;
				totalVotos++;
				break;
			case 5: 
				voto[4]++;
				totalVotos++;
				break;
			}
			
		}while( votacao != 0);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("O cadidato " + candidato[i] + " teve " + voto[i] +" votos\n");
		}
		System.out.printf("Total de votos: %d\n", totalVotos);
		
		maiorVotacao = voto[0];
		for(int i = 0; i < 5; i++) {
			if(voto[i] > maiorVotacao) {
				maiorVotacao = voto[i];
			}
		}
		
		System.out.println("Candidato vencedor");
		for(int i = 0; i < 5; i++) {
			if(voto[i] == maiorVotacao) {
				System.out.println(candidato[i]);
			}
		}
		teclado.close();
	}
}
