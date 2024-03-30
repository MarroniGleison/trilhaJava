import java.util.Scanner;
public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
            	//chamando o método contendo a lógica de contagem
            	contar(parametroUm, parametroDois);
            
            }catch (Exception ParametrosInvalidosException){
            	System.out.println("O segundo parâmetro deve ser maior que o primeiro"); 
            }
        }
		
	}
	static void contar(int parametroUm, int parametroDois) throws Exception {
		if (parametroUm >= parametroDois){
            throw ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
	}
}
    private static Exception ParametrosInvalidosException(String string) {
        throw new UnsupportedOperationException("Unimplemented method 'ParametrosInvalidosException'");
    }
}