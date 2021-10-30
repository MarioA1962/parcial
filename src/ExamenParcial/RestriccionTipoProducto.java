package ExamenParcial;

import java.util.ArrayList;
import java.util.List;

public class RestriccionTipoProducto implements TipoRestricción{
    List<String> nombreProdRestringidos = new ArrayList<>();

    public RestriccionTipoProducto(List<String> nombreProdRestringidos) {
        this.nombreProdRestringidos = nombreProdRestringidos;
    }

    @Override
    public boolean valida(Producto p){
        boolean afirmacion = true;
        int nroEmp= nombreProdRestringidos.size();
        for(int i=0; i<nroEmp;i++){
            if(nombreProdRestringidos.get(i) == p.descripcion){
                afirmacion = true;
            }else{
                afirmacion = false;
            }
        }
        return afirmacion;
    }
}






