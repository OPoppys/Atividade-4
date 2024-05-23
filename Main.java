import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            int numvet = 0, soma = 0, vetmaior, vetmenor;
            float media;
            Scanner sc = new Scanner(System.in);

            // Esse while serve pra não sair nenhum vetor negativo ou zerado
            while (numvet <= 0) {
                System.out.println("Digite o número correspondente ao tamanho do vetor: ");
                numvet = sc.nextInt();
                if (numvet <= 0){ //Esse if serve pra dar feedback pro user, nesse caso negativo
                    System.out.println("Tamanho inválido");
                }
            }
            System.out.println("O vetor tem " + numvet + " espaços de memória"); //E nesse caso feedback positivo

            int []vetor = new int[numvet];// Criação do vetor

            for(int i = 0; i < numvet; i++){// Esse for preenche os valores dentro do vetor
                System.out.println("Digite números inteiros para preencher os espaços do vetor");
                vetor[i] = sc.nextInt();
            }
            for(int i = 0; i < numvet; i++){// Esse for mostra os valores do vetor para o usuario
                System.out.println("O espaço do vetor numero " + i +" tem o valor de " + vetor[i]);
            }
            for (int i = 0; i < numvet; i++){ // Esse for soma o valor de dentro do vetor e o sout mostra para o user
                soma += vetor[i];
            }
            System.out.println("A soma do vetor é " + soma);
            media = (float) soma /numvet;
            System.out.println("A media dos valores do vetor é " + media); // Aqui é tirada a média dos valores do vetor

            vetmaior = vetor[0];
            vetmenor = vetor[0];

            for(int i = 0; i < numvet; i++){//Nesse for tiramos o maior valor do vetor
                if(vetmaior < vetor[i]) {
                    vetmaior = vetor[i];
                }
            }
            System.out.println("O maior valor do vetor é " + vetmaior);//Aqui informamos ao user o maior valor do vetor

            for(int i = 0; i < numvet; i++) {//Nesse for tiramos o menor valor do vetor
                if (vetmenor > vetor[i]) {
                    vetmenor = vetor[i];
                }
            }
            System.out.println("O menor valor do vetor é " + vetmenor);//Aqui informamos ao user o menor valor do vetor

            for(int i = 0; i < 2; i++){//Aqui substitui-se os dois primeiros valores do vetor
                System.out.println("Substitua dois valores do vetor: ");
                vetor[i] = sc.nextInt();
            }
            for(int i = 0; i < numvet; i++) {// Esse for mostra os valores do vetor para o usuario
                System.out.println("O espaço do vetor numero " + i + " tem o valor de " + vetor[i]);
            }
            soma = 0;
            for (int i = 0; i < numvet; i++){ // Esse for soma o valor de dentro do vetor e depois mostra para o user novamente
                soma += vetor[i];
            }
            System.out.println("A soma do vetor é " + soma);
            media = (float) soma /numvet;
            System.out.println("A media dos valores do vetor é " + media); // Aqui é tirada a média dos valores do vetor novamente
        }

}//Codado por Carlos Henrique Pilla ;)