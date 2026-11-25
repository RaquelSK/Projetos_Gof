
public class Main {

    public static void main(String[] args) {

        // Café simples
        Cafe cafe1 = new CafeSimples();

        System.out.printf("%s: R$ %.2f%n",
                cafe1.getDescricao(), cafe1.getPreco());

        // Café com leite
        Cafe cafe2 = new LeiteDecorator(new CafeSimples());

        System.out.printf("%s: R$ %.2f%n",
                cafe2.getDescricao(), cafe2.getPreco());

        // Café com leite e chocolate
        Cafe cafe3 = new ChocolateDecorator(
                new LeiteDecorator(new CafeSimples()));

        System.out.printf("%s: R$ %.2f%n",
                cafe3.getDescricao(), cafe3.getPreco());

    }
}
