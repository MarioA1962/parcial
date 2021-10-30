package ExamenParcial;

public class RestriccionAntiguedad implements TipoRestricción{
    @Override
    public boolean valida(Producto p) {
        return false;
    }
}
