package model;
import java.util.Scanner;

public class Produto {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarInfo() {
        System.out.println("Produto: " + nome + " - R$ " + preco);
    }

    public void exibirMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;
            
            do {
                System.out.println("\n--- MENU PRODUTO ---");
                System.out.println("1 - Mostrar informações do produto");
                System.out.println("2 - Sair");
                System.out.print("Escolha: ");
                opcao = scanner.nextInt();
                
                if (opcao == 1) {
                    mostrarInfo();
                } else if (opcao == 2) {
                    System.out.println("Encerrando...");
                } else {
                    System.out.println("Opção inválida!");
                }
            } while (opcao != 2);
        }
    }

    // Para testar o menu (opcional)
    public static void main(String[] args) {
        Produto p = new Produto("Café Expresso", 12.50);
        p.exibirMenu();
    }

    public int getPreco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
