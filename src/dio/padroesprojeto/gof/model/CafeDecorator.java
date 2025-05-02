package dio.padroesprojeto.gof.model;

public abstract class CafeDecorator implements Cafe {
    private final Cafe cafeDecorator;

    protected CafeDecorator(Cafe cafeDecorator) {
        this.cafeDecorator = cafeDecorator;
    }
    @Override
    public Double obterPreco() {
        return cafeDecorator.obterPreco();
    }

    @Override
    public String obterIngredientes() {
        return cafeDecorator.obterIngredientes();
    }

    public Cafe getCafe() {
        return cafeDecorator;
    }
}
