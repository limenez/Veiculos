import java.util.Scanner;

public class ModeloTiggo {

	public static void main(String[] args) {
		
		float valor_carro, valor_entrada, valor_a_parcelar, valor_parcela72, valor_parcela48, valor_parcela24; 
		valor_carro = 180000;
		
		System.out.println("Digite o valor da entrada: ");
		Scanner teclado = new Scanner(System.in);
		valor_entrada = teclado.nextFloat();
		
		valor_a_parcelar = valor_carro - valor_entrada;
		valor_parcela72 = valor_a_parcelar/72;
		valor_parcela48 = valor_a_parcelar/48;
		valor_parcela24 = valor_a_parcelar/24;
		
		System.out.println("========================");
		System.out.println("1 - Parcelamento em 72x");
		System.out.println("2 - Parcelamento em 48x");
		System.out.println("3 - Parcelamento em 24x");
		System.out.println("========================");	
		System.out.println("Escolha a opção desejada:");
		
		String opcao;
		opcao = teclado.next();
		switch(opcao) {
		case "1":
			System.out.println("Valor do carro à vista: "+ valor_carro);
			System.out.println("Valor da Entrada: " + valor_entrada);
            System.out.println("Valor da diferença: " + valor_a_parcelar);
            System.out.print("Parcelamento em 72x: ");
            System.out.printf("%.2f", valor_parcela72);
			break;
		case "2":
			System.out.println("Valor do carro à vista: "+ valor_carro);
			System.out.println("Valor da Entrada: " + valor_entrada);
            System.out.println("Valor da diferença: " + valor_a_parcelar);
            System.out.print("Parcelamento em 48x: ");
            System.out.printf("%.2f", valor_parcela48);
			break;
		case "3":
			System.out.println("Valor do carro à vista: "+ valor_carro);
			System.out.println("Valor da Entrada: " + valor_entrada);
            System.out.println("Valor da diferença: " + valor_a_parcelar);
            System.out.print("Parcelamento em 24x: ");
            System.out.printf("%.2f", valor_parcela24);
			break;
		default :
			System.out.println("Escolhe a opção errada");
	
		}
	
	}
}
