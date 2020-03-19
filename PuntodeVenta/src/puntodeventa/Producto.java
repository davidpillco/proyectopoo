
package puntodeventa;

public class Producto {
    
    private String nombre;
    private String tipo_producto;
    private double cantidad;
    private double precio;

    public Producto(String nombre, String tipo_producto, double cantidad, double precio) {
        this.nombre = nombre;
        this.tipo_producto = tipo_producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the unidad_medida
     */
    public String getTipo_producto() {
        return tipo_producto;
    }

    /**
     * @param unidad_medida the unidad_medida to set
     */
    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
