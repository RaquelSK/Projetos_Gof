
public class LeiteDecorator extends CafeDecorator {

    public LeiteDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com leite";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + 2.00;
    }

}
