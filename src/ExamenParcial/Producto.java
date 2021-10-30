package ExamenParcial;

import java.util.Objects;

public class Producto {
    String descripcion;
    int cantidad;
    double precio;

    public Producto(String descripcion, int cantidad, double precio) throws FerreteriaException {
        if (descripcion == null || cantidad <0 || precio < 0){
            throw new FerreteriaException("Los valores no son compatibles");
        }
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws FerreteriaException {
        if (precio < 0){
            throw new FerreteriaException("El precio jamas es negativo");
        } else {
            this.precio = precio;
        }
    }
    public Producto(){
    }

    @Override
    public String toString() {
        return "(" + descripcion + ";" + cantidad + ";" + precio + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(descripcion, producto.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion);
    }
}
