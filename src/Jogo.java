import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private Integer pontos = 100;



    private void ganhouOuPerdeu(int chute){
        Random random = new Random();
        int aleatorio = random.nextInt(100);

        switch(chute) {
            case (1):
                if (aleatorio % 2 == 0) {
                    System.out.println("O número aleatório é: " + aleatorio + " e ele é par.");
                    System.out.println("Você acertou, ganhe 10 pontos!");
                    System.out.println();
                    this.pontos += 10;
                    break;
                }else{
                    System.out.println("O número aleatório é : " + aleatorio + " e ele é impar.");
                    System.out.println("Você errou, perca 10 pontos!");
                    System.out.println();
                    this.pontos -= 10;
                    break;
                    }

                case (2):
                    if (!(aleatorio % 2 == 0)) {
                        System.out.println("O número aleatório é : " + aleatorio + " e ele é impar.");
                        System.out.println("Você acertou, perca 10 pontos!");
                        System.out.println();
                        this.pontos += 10;
                        break;
                    }else{
                        System.out.println("O número aleatório é: " + aleatorio + " e ele é par.");
                        System.out.println("Você errou, ganhe 10 pontos!");
                        System.out.println();
                        this.pontos -= 10;
                        break;
                    }
        }
    }



    public void Iniciar() {

            System.out.println("O jogo é o seguinte meu irmão ou irmã, eu vou pensar num número,\n" +
                    "tu vai chutar par ou impar dai eu te falo se tu acertou, sacou?\n" +
                    "Tem outra coisa tu começa com 100 pontos acertou o adivinha ganhou 10, errou perdeu 10.");
        while(pontos >0 ) {
            System.out.println("Você tem "+this.pontos+"\n" +
                    "Digite [1] Par ou [2] Ímpar: ");

            int chute = 999;
            while ((chute < 1) || (chute > 2)) {
                Scanner entrada = new Scanner(System.in);
                chute = entrada.nextInt();
            }
            ganhouOuPerdeu(chute);


        }
        System.out.println("Seus pontos estão abaixo de 0, você perdeu. \n" +
                "Dica: Não tem como ganhar.");
    }
}
