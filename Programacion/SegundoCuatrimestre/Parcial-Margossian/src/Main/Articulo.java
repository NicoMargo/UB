package Main;

public class Articulo implements ArticuloVendible{
    private String codigo;
    private int cantidad;
    private double precioUnidad;


    @Override
    public boolean vendeArticulo(int num) { //MODIFICACION DEL EJ!! USO UN BOOLEANO PARA SABER SI SE CONCRETO LA VENTA. ORIGINALMENTE ES VOID SEGUN EL EJ
        boolean ventaConcretada = false;
        if(num <= cantidad){ //si hay la cantidad suficiente para vender se resta. sino, no se modifica
            cantidad -= num;
            ventaConcretada = true;
        }
        return  ventaConcretada;
    }

    public Articulo(String codigo, int cantidad, double precioUnidad) { //constructor
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public void mostrarArticulo(){ //armo mi propio metodo de mostrar articulo, podria hacer @override del ToString pero queria armar el mio
        System.out.println("Codigo: " + codigo + " Cantidad: " + cantidad + " precio por unidad: " + precioUnidad);
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }
    public double getPrecioUnidad() { //Nunca se usa este metodo pero el ej lo pide
        return precioUnidad;
    }


}
