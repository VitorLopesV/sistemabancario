package sistemabancario;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

// OBJETOS
    ContaCorrente conta = new ContaCorrente(2547865, "58****", 1200.0);
    Scanner scanner = new Scanner(System.in);

// VARIÁVEL USADA COMO VERIFICADOR
    int opcao = 0;

// VARIÁVEL USADA COMO UMA CONTA ABSTRATA
    double conta2;

        //INTRODUÇÃO DO SISTEMA
        System.out.println("\nRENDA MAIS\n");

        System.out.print("Digite Seu nome para acessar sua conta: ");
        conta.setNometitular(scanner.nextLine());
        System.out.print("\n");

        System.out.println("Seja bem-vindo ao Renda Mais, oque deseja fazer? \n");

        //CONDIÇÃO DE REPETIÇÃO
        while(opcao != 5) {

            System.out.println("1 - PIX");
            System.out.println("2 - Conferir saldo");
            System.out.println("3 - Meus dados");
            System.out.println("4 - Fazer despósito");
            System.out.println("5 - Encerrar");

            opcao = scanner.nextInt();
            System.out.print("\n");

        switch (opcao) {

            /**
             *
             * Case responsável pela parte de transferência(pix) do sistema
             */
            case 1:

                System.out.print("DIGITE A CHAVE PIX: ");
                    scanner.nextDouble();
                    System.out.print("VALOR A SER ENVIADO R$");
                    conta.setPix(scanner.nextDouble());
                    System.out.print("\n");

                        if(conta.getPix() <= conta.getSaldo()) {

                            conta.setSaldo(conta.getSaldo() - conta.getPix());
                            System.out.println("PIX ENVIADO COM SUCESSO!!!\n");
                        }
                        else {
                             System.out.println("NÃO POSSUI DINHEIRO SUFICIENTE\n");
                            }

                    break;
            /**
             *
             * Case resposnsável por mostrar o saldo ao usuário
             */
            case 2:

                    System.out.println("SALDO DISPONIVÉL: " + conta.getSaldo());
                    System.out.print("\n");

                    break;
            /**
             *
             * Case responsável por imprimir os dados da conta
             */
            case 3:

                    System.out.println("MEUS DADOS\n");
                    System.out.println("NOME DO TITULAR: " + conta.getNometitular());
                    System.out.println("NÚMERO DA CONTA: " + conta.getNumeroconta());
                    System.out.println("SENHA: " + conta.getSenha() + "\n");

                    break;
            /**
             *
             * Case responsável pela parte de deposito
             */
            case 4:
                    System.out.print("QUANTO DESEJA DEPOSITAR: R$");
                    conta.setDeposito(scanner.nextDouble());
                    conta.setSaldo(conta.getSaldo() + conta.getDeposito());

                    System.out.println("SEU DEPOSITO DE " + conta.getDeposito() + " FOI FEITO COM SUCESSO!!!\n");

                    break;
            /**
             *
             * Case responsável pelo encerramento do sistema
             */
            case 5:
                    break;

            default: {
                    System.out.println("Valor não disponivél\n");
                }
            }
        }
    }
}


