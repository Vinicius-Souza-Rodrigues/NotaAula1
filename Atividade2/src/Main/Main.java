package Main;

import produto.produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        produto produto1 = new produto();

        System.out.println("Digite o nome do produto!: ");
        produto1.setNome(sc.next());
        System.out.println("Digite o codigo do produto!: ");
        produto1.setCodigo(sc.nextInt());
        System.out.println("Digite a cor do produto!: ");
        produto1.setCor(sc.next());
        System.out.println("Digite o peso do produto!: ");
        produto1.setPeso(sc.nextDouble());
        System.out.println("Digite a quantidade do produto! ");
        produto1.setQuantidade_estoque(sc.nextInt());
        System.out.println("Digite o preço do produto!: ");
        produto1.setPreco(sc.nextDouble());

        System.out.println("pix, especie, transferencia, debito ou credito");
        System.out.println(produto1.pagamento_quantia(sc.next()));
        System.out.printf("Produto comprado:" + produto1.toString());
        sc.close();
    }
}