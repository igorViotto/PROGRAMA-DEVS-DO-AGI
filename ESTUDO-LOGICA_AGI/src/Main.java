import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

         //EXERCICIO01: APORTE FIXO

       //ENTRADA
       System.out.print("Digite o valor de aporte mensal: ");
       int depositoMensal = scanner.nextInt();

       //PROCESSAMENTO
        int saldo = 100;
        for (int mes = 1; mes <= 12; mes++){
            saldo += depositoMensal;
        }

        //SAIDA
        System.out.println("O valor ao longo dos 12 meses e: " + saldo);


          //EXERCICIO02: APORTE VARIAVEL

        System.out.print("Qual o saldo inicial? ");
        int saldoAtual = scanner.nextInt();

        int contador = 1;

        while (contador <= 12) {
            System.out.print("Qual sera o valor do deposito para o mes " + contador + ":");
            int deposito = scanner.nextInt();

            saldoAtual += deposito;
            contador++;
        }
        System.out.print("O saldo total dos 12 meses variaveis e " + saldoAtual + ":");


        //EXERCICIO03: INVESTIMENTO

        double aporteAtual = 1000;

        int contador2 = 1;
        while (contador2 <= 12) {
            System.out.print("Qual valor sera aportado no mes " + contador + " :");
            double deposito = scanner.nextDouble();
            aporteAtual += deposito;
            aporteAtual += deposito * 0.005;

            contador2++;
        }
        System.out.printf("O total dos 12 meses com a rentabilidade aplicada e:  R$ %.2f%n", aporteAtual);



    }

}