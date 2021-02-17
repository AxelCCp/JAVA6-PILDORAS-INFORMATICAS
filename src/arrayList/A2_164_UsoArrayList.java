package arrayList;

import java.io.File;

public class A2_164_UsoArrayList {
	public static void main(String[]args) {
		
		
		//INATANCIAMOS LA CLASE ARRAYLIST LAMAMOS AL CONSTRUCTOR Y LE PASAMOS UN PARAMETRO INT.
		A1_164_Arraylist archivos = new A1_164_Arraylist(4);
		archivos.add("xxx");
		archivos.add("yyy");
		archivos.add("aaa");
		archivos.add("eee");
		archivos.add("ccc");
		archivos.add(new File("gestion_pedidos.dsasdasda"));
		
		
		//CONSULTAMOS EL CONTENIDO EN EL ARRAY (2)
		String nombrePersona = (String) archivos.get(4); 
		System.out.println(nombrePersona);
			
		//archivos.add(new File("gestion_pedidos.dsasdasda"));
		//File nombre = (File)archivos.get(0);
		//System.out.println(nombre);
		
	}
}
