package clases;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.IOException;

public class Carrito implements java.io.Serializable {
 
  private ArrayList<ElementoDeCarrito> elementos = new ArrayList<ElementoDeCarrito>();

  public Carrito() {
  }

  
  public Carrito(String contiene){
    if(contiene.length()>0){
        String[] deserializado = contiene.split("/");
        
        for (int i = 0; i < deserializado.length; i += 5) {
                int cantidad = Integer.parseInt(deserializado[i]);
                int codigo = Integer.parseInt(deserializado[i + 1]);
                String nombre = deserializado[i + 2];
                double precio = Double.parseDouble(deserializado[i + 3]);
                String imagen = deserializado[i + 4];

                Producto producto = new Producto(codigo, nombre, precio, imagen);
                ElementoDeCarrito elementoCarrito = new ElementoDeCarrito(producto, cantidad);

                elementos.add(elementoCarrito);
        
    }
    
}
  } 
          
          
  public Carrito(ArrayList<ElementoDeCarrito> elementos) {
    this.elementos = elementos;
  }

  public ArrayList<ElementoDeCarrito> getElementos() {
    return elementos;
  }

  public boolean existeElementoConCodigo(int codigo) {
    return this.posicionElementoConCodigo(codigo) != -1;
  }

  public void meteProductoConCodigo(int codigo) {
    if (this.existeElementoConCodigo(codigo)) {
      elementos.get(posicionElementoConCodigo(codigo)).incrementaCantidad(1);
    } else {
      Catalogo catalogo = new Catalogo();
      catalogo.cargaDatos();
      elementos.add(new ElementoDeCarrito(catalogo.productoConCodigo(codigo), 1));
    }
  }

  public void eliminaProductoConCodigo(int codigo) {
    if (existeElementoConCodigo(codigo)) {
      int i = 0;
      int posicion = 0;
      for (ElementoDeCarrito elemento : elementos) {
        if (elemento.getProducto().getCodigo() == codigo) {
          posicion = i;
        }
        i++;
      }
      elementos.remove(posicion);
    }
  }

  private int posicionElementoConCodigo(int codigo) {
    int i = 0;
    for (ElementoDeCarrito elemento : elementos) {
      if (elemento.getProducto().getCodigo() == codigo) {
        return i;
      }
      i++;
    }
    return -1;
  }

  
 @Override
  public String toString(){
      String catalogo="";
      for(ElementoDeCarrito recorrido: elementos){
          catalogo += recorrido.getCantidad()+
                  "/" + recorrido.getProducto().getCodigo()+ 
                  "/" + recorrido.getProducto().getNombre() + 
                  "/" + recorrido.getProducto().getPrecio() +
                  "/" + recorrido.getProducto().getImagen() +
                  "/";
          
          
          
      }
return catalogo;      
      
      
  }
            
          
}
        
  

