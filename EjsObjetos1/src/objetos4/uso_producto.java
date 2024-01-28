package objetos4;

import javax.swing.JOptionPane;

public class uso_producto {

	public static void main(String[] args) {
			
			 //declarar array
	        producto[] listaProductos = new producto[3];
	
	        //bucle for para introducir los datos e imprimir el resumen del inventario
	        String mensaje = "Resumen del inventario:\n\n";
	        for (int i = 0; i < listaProductos.length; i++) {
	            producto producto = new producto();
	
	            //introducir el nombre del producto, la cantidad y el precio
	            producto.setNombre(JOptionPane.showInputDialog("Introduce el nombre del producto " + (i + 1) + ":"));
	            producto.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad del producto " + (i + 1) + ":")));
	            producto.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto " + (i + 1) + ":")));
	
	            //guardar los productos en el array
	            listaProductos[i] = producto;
	
	            //añadir resumen del producto al inventario
	            mensaje += "Producto " + (i + 1) + ":\n" + producto.Resumen() + "\n\n";
	        }
	
	        //mostrar resumen del inventario con JOptionPane
	        JOptionPane.showMessageDialog(null, mensaje);
	    }
	}


