package dio.padroesprojeto.gof.model;

public class ComLeite extends CafeDecorator {

    public ComLeite(Cafe cafe) {
        super(cafe);
    }
    @Override
    public Double obterPreco() {
        return super.obterPreco() + 0.5;
    }

    @Override
    public String obterIngredientes() {
        return super.obterIngredientes() + ", Leite";
    }
}
