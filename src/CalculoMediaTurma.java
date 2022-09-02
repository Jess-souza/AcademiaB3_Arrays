import java.util.Scanner;

public class CalculoMediaTurma {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int quantidade;
            double[] notas;
            double media = 0;

            System.out.println("Digite a quantidade de alunos: ");
            quantidade = input.nextInt();

            notas = new double[quantidade];

            for (int i = 0; i < quantidade; i++) {
                System.out.println("Digite a nota do aluno " + i);
                notas[i] = input.nextDouble();
            }

            for (double nota : notas) {
                media += nota;
            }
            media /= quantidade;

            System.out.printf("A media da nota dos %d alunos é %f", quantidade, media);
            input.close();
        }
    }

