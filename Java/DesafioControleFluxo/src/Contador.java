import java.util.Scanner;
import java.util.InputMismatchException;

/*O programa deve receber dois parametros de entrada, via terminal, que receberão dois números inteiros.
 * n1++ pra incrementar até que n1 seja igual a n2. 
 * 
 */
public class Contador {
    public static void main(String[] args) throws Exception {
        int parametro1, parametro2;
        
        System.out.println("< < < Você deve indicar dois números inteiros para esta aplicação. Lembre-se que o primeiro número deve ser menor que o segundo. > > >");
        Scanner read = new Scanner(System.in);
        
        try {
            System.out.println("Digite o primeiro parâmetro: ");
            parametro1 = read.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            parametro2 = read.nextInt();

            contar(parametro1,parametro2);
//         catch (InputMismatchException e) {
//                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
//            }
        } catch (InputMismatchException e) {
            System.out.println("Valor inserido inválido. O valor deve ser um número inteiro.");
        }
                


                 } static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm < parametroDois) {
            	int contagem = parametroDois - parametroUm;
		        //realizar o for para imprimir os números com base na variável contagem
                for (int contador = parametroUm; contador < parametroDois; contador++) {
                    System.out.println("contador em: Número " + contador);
                }         
        } else {
            throw new RuntimeException("O segundo parâmetro deve ser maior que o primeiro.");
        }

	}   
}
