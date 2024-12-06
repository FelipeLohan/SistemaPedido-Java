import entities.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("------Sistema de pedido------");
            System.out.println("1- Cadastrar cliente");
            System.out.println("2- Cadastrar produto");
            System.out.println("3- Adicionar produto ao carrinho");
            System.out.println("4- Remover produto do carrinho");
            System.out.println("5- Sair");

            opcao = teclado.nextInt();
                teclado.nextLine();

            switch (opcao) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }    
        } while (opcao != 5);
    }
}
