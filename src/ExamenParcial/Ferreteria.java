package ExamenParcial;

import java.util.ArrayList;
import java.util.List;

public class Ferreteria {
    List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void anhiadirProducto(Producto p1){
        int nroEmp= productos.size();
        for(int i=0; i<nroEmp;i++){
            if(productos.get(i).equals(p1)){
                p1.precio = productos.get(i).precio;
                productos.set(i, p1);
            }else{
                productos.add(p1);
                break;
            }
        }
    }
    public void eliminar(String pal){
        int nroEmp= productos.size();
        for(int i=0; i<nroEmp;i++){
            if(productos.get(i).descripcion.equals(pal)){
                productos.remove(i);
            }else{
                System.out.println("No existe ningun producto igual");
            }
        }
    }
    public List<Producto> selecionar(int n1, int n2){
        List<Producto> nuevosproductos = new ArrayList<>();
        for(Producto p: productos){
            if(n1<= p.cantidad){
                if(p.cantidad <= n2){
                    nuevosproductos.add(p);
                }
            }

        }
        return nuevosproductos;
    }
    public double calcSuma(int n1, int n2){
        int suma = 0;
        for(Producto p: productos){
            if(n1<= p.cantidad){
                if(p.cantidad <= n2){
                    suma += p.cantidad;
                }
            }

        }
        return suma;
    }
    protected int buscar(Producto p1){
    }
    @Override
    public String toString() {
        String texto = null;
        for (Producto k: productos){
            texto += "(" + k.getDescripcion() + ";" + k.getCantidad() + ";" + k.getPrecio() + ")";
        }
        return "[" + texto + "]";
    }
    public Ferreteria() {
    }
}
