import dio.padroesprojeto.gof.model.Cafe;
import dio.padroesprojeto.gof.model.CafeSimples;
import dio.padroesprojeto.gof.model.ComChantilly;
import dio.padroesprojeto.gof.model.ComLeite;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new CafeSimples();
        info(cafe);

        cafe = new ComLeite(cafe);
        info(cafe);

        cafe = new ComChantilly(cafe);
        info(cafe);
    }

    public static void info(Cafe cafe) {
        System.out.println("Ingerdientes: " + cafe.obterIngredientes());
        System.out.println("Valor: " + cafe.obterPreco());
    }
}