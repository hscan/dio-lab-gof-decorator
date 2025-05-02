package dio.padroesprojeto.gof.model;

public class CafeSimples implements Cafe {
    @Override
    public Double obterPreco() {
        return 1.0;
    }

    @Override
    public String obterIngredientes() {
        return "Café";
    }
}
