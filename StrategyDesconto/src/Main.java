
public class Main {

    public static void main(String[] args) {

        double valorCompra = 200.00;

        CalculadoraDesconto calculadora;

        // Sem desconto
        calculadora = new CalculadoraDesconto(new SemDesconto());
        System.out.printf("Sem desconto: R$ %.2f%n",
                calculadora.calcular(valorCompra));

        // Desconto de 10%
        calculadora = new CalculadoraDesconto(new DescontoDezPorCento());
        System.out.printf("Desconto de 10%%: R$ %.2f%n",
                calculadora.calcular(valorCompra));

        // Desconto de 20%
        calculadora = new CalculadoraDesconto(new DescontoVintePorCento());
        System.out.printf("Desconto de 20%%: R$ %.2f%n",
                calculadora.calcular(valorCompra));

    }
}
