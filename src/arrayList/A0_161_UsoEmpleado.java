package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A0_161_UsoEmpleado {
	public static void main(String[]args) {
		
		//Empleado listaEmpleados[] = new Empleado[3];
		//listaEmpleados[0] = new Empleado("Ana",45,2500);
		//listaEmpleados[1] = new Empleado("Antonio",55,2000);
		//listaEmpleados[2] = new Empleado("Maria",25,2600);
		
		ArrayList<Empleado>listaEmpleados = new ArrayList<Empleado>(); 
		
		//CREAMOS UN ARRAYLIST DE 11 ELEMENTOS PARA METERLOS EN SU INTERIOR
		//CON ESTO EVITAMOS  EL CONSUMO DE RECURSOS QUE OCURRE CUANDO SE REALIZA UNA COPIA DEL ARRAYLIST
		//( ES TRASBASE DE UN ARRAYLIST A OTRO, Y LA ELIMINACIÓN DEL ANTERIOR)
		
		listaEmpleados.ensureCapacity(11);
		
		listaEmpleados.add(new Empleado("Ana",45,2500));
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		listaEmpleados.add(new Empleado("Maria",25,2600));
		
		listaEmpleados.add(new Empleado("Ana",45,2500));
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		listaEmpleados.add(new Empleado("Maria",25,2600));
		
		listaEmpleados.add(new Empleado("Ana",45,2500));
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		listaEmpleados.add(new Empleado("Maria",25,2600));
		
		listaEmpleados.add(new Empleado("Ana",45,2500));
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		listaEmpleados.add(new Empleado("Maria",25,2600));
		
		//RECORTAMOS EL ESPACIO DE MEMORIA VACÍA DEL ARRAYLIST.
		//listaEmpleados.trimToSize();
		
		//AGREGAMOS UN EMPLEADO Y LO PONEMOS EN LA POSICION INDICADA
		listaEmpleados.set(1,new Empleado("Olga",22,2200));
		
		//IMPRIMIMOS LOS DATOS DEL EMPLEADO QUE ESTÁ EN UNA POSiCIÓN DETERMINADA, CON GET()
		System.out.println(listaEmpleados.get(4).dameDatos() + "********");
		
		
		System.out.println("TAMAÑO DEL ARRAYLIST::::::::::::::::::::::::::::::::::::::::::::::::");
		//TAMAÑO DEL ARRAYLIST
		System.out.println(listaEmpleados.size());
		
		
		System.out.println("LISTAEMPLEADOS CON FOR EACH:::::::::::::::::::::::::::::::::::::::::");
		//RECORRE ARRAYLIST LISTAEMPLEADOS CON FOR EACH
		for(Empleado e : listaEmpleados) {
			System.out.println(e.dameDatos());
		}
		
		
		System.out.println("LISTAEMPLEADOS CON BUCLE FOR::::::::::::::::::::::::::::::::::::::::");
		//RECORRE ARRAYLIST LISTAEMPLEADOS CON BUCLE FOR
		for(int i=0;i<listaEmpleados.size();i++) {
			Empleado x= listaEmpleados.get(i);
			System.out.println(x.dameDatos());
		}
		
		System.out.println("TRASPASAR LA INFORMACIÓN DE ARRAYLIST A ARRAY CONVENSIONAL::::::::::");
		//TRASPASAR LA INFORMACIÓN DEL ARRAYLIST A UN ARRAY CONVENSIONAL
		Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];  
		//COPIAMOS INFORMACIÓN
		listaEmpleados.toArray(arrayEmpleados);
		for(int i=0; i<arrayEmpleados.length;i++) {
			System.out.println(arrayEmpleados[i].dameDatos());
		}
		
		
		System.out.println("ITERATOR::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		//ITERATOR
		Iterator <Empleado> miIterador = listaEmpleados.iterator();
		
		while(miIterador.hasNext()){
			System.out.println(miIterador.next().dameDatos());
		}
		
		
	}
}



class Empleado{
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	public String dameDatos() {
		return "El empleado se llama " + nombre + ". Tiene " + edad + " años. Y un salario de " + salario;   
	}
	
	private String nombre;
	private int edad;
	private double salario;
}



