
public class ChocolateDecorator extends CafeDecorator {

    public ChocolateDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com chocolate";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + 3.00;
    }

}
