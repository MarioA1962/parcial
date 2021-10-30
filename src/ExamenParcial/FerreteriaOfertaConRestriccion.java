package ExamenParcial;

import java.util.ArrayList;
import java.util.List;

public class FerreteriaOfertaConRestriccion extends Ferreteria implements TipoRestricción{
    List<String> descHerramientasOfert = new ArrayList<>();

    public FerreteriaOfertaConRestriccion(List<String> descHerramientasOfert) {
        this.descHerramientasOfert = descHerramientasOfert;
    }

    @Override
    public boolean valida(Producto p) {
        return false;
    }
}
