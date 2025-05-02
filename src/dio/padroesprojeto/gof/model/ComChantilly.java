package dio.padroesprojeto.gof.model;

public class ComChantilly extends CafeDecorator {
    public ComChantilly(Cafe cafeDecorator) {
        super(cafeDecorator);
    }

    @Override
    public Double obterPreco() {
        return super.obterPreco() + 1.5;
    }

    @Override
    public String obterIngredientes() {
        return super.obterIngredientes() + ", Chantilly";
    }
}
