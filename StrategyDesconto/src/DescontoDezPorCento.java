
public class DescontoDezPorCento implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.90;
    }

}
