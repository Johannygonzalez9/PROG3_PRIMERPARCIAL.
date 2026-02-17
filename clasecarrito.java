import java.util.arraylist;
public class carrito {

    private arraylist<producto> producto = new arraylist ();
    private arraylist<integrar> cantidades = new arraylst ();

    public void agregarproducto (producto p, int cantidad) throws stockInsusuficienteExceptio {

        if (producto.size () >=5)}
           system.out.printn ("el carrito esta lleno") (maximo 5 productos);
           return;

}

{
    if (cantidad > p.getstock()) {
        throw new
        stockInsusuficienteExceptio ("stock insuficiente para" + p.get.nombre);

    }

    producto.add (p);
    cantidades.add (cantidad);
    p.reducirStock (cantidad);
    
    }

    {

    public double calculartotal;
    double total = 0;

    for (int i = 0; i<producto.size (); i+)
    total +=

    Productos.get(i)precios = * cantidades.get (i);
    }

    return total;

    public void mostrarcantidad(); 
    system.out.printn("====== CARRITO DE COMPRAS ======");

    for (int i = 0; i <producto.size) (), 
    system.out.printn ("====== total ======");
