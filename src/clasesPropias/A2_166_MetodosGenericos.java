package clasesPropias;

public class A2_166_MetodosGenericos {
	public static void main(String[]args) {
		
		//CREAMOS UN ARRAY, PARA PASARSELO AL M�TODO GEN�RICO A TRAV�S DE PAR�METROS, 
		//PARA QUE NOS DEVUELVA LA LONGITUD. 
		String nombres[]= {"Jos�","Mar�a","Pepe"};
		
		
		System.out.println(MisMatrices.getMenor(nombres));
		
		//CREAMOS UNA VARIABLE PARA QUE GUARDE LA LONGITUD DE ESTE ARRAY.
		//String elementos = MisMatrices.getElementos(nombres);
			
		//System.out.println(elementos);
		
		
		
		
		
		//-----------------------------------------------------------------------------------------
		
		
		
		
		
		
		//CREAMOS UN ARRAY DIFERENTE DE TIPO EMPLEADO, APROVECHANDO QUE TENEMOS ESTA CLASE EN EL PAQUETE.
		//CON ESTO SE VE QUE EL M�TODO GENERICO TAMBN SIRVE PARA ESTE ARRAY DE OTRO TIPO.
		
		/* A3_166_Empleado[]listaEmpleados = {new A3_166_Empleado("Ana",21,2500),
											new A3_166_Empleado("zzz",54,2400),
											new A3_166_Empleado("xxx",43,2700),
											new A3_166_Empleado("ccc",34,2600)};
		 
		 System.out.println(MisMatrices.getElementos(listaEmpleados));	
		*/ 
	}
}


//M�TODO GENERICO, NOS VA A DEVOLVER UN STRING. LA LONGITUD QUE TIENE UN ARRAY QUE LE PASEMOS POR.. 
//..PAR�METRO. 
// M�TODO PUBLIC -- PARA QUE SEA ACCESIBLE DESDE OTRAS CLASES.
// M�TODO STATIC -- PARA CONVERTIRLO EN UN M�TODO DE CLASE, PARA NO TENER QUE NECESITAR UNA 
//					INSTANCIA DE LA CLASE MISMATRICES.	
class MisMatrices{
	//M�TODO GENERICO                                     //"a" es el array que le pasaremos a este m�todo.
	
	//public static <T> String getElementos(T[]a) { 
		//return "El array tiene " +  a.length + " elementos."; 
		
	
	
	//METODO GEN�RICO QUE DEVUELVA EL ELEMENTO MENOR SE PONE "T" EN EL TIPO, PARA QUE DEVUELVA UN GEN�RICO.
	//EXTENDS COMPARABLE, PARA PODER USAR EL M�TODO COMPARETO()
	public static <T extends Comparable> T getMenor(T[]a) { 
		if(a==null || a.length==0) {
			return null;
		}
		//CREAMOS VARIABLE PARA ALMACENAR EL ELEMENTO MENOR
		T elementoMenor = a[0]; //posici�n cero del array que le pasemos.
		//RECOREMOS EL ARRAY QUE LE HEMOS PASADO POR PAR�METRO.
		//COMPARAMOS EL ELEMENTO[0] CON EL [1] 
		for(int i=1; i<a.length;i++) {
			if (elementoMenor.compareTo(a[i])>0) {
				elementoMenor=a[i];
			}
		}
		return elementoMenor;
		
		
		
		
		//USAMOS EL M�TODO COMPARETO(): 
		//SI DEVUELVE (-1) -- EL OBJ QUE ESTAMOS COMPARANDO ES MENOR.
		//SI DEVUELVE (0) -- EL OBJ QUE ESTAMOS COMPARANDO ES IGUAL.
		//SI DEVUELVE (1) -- EL OBJ QUE ESTAMOS COMPARANDO ES MAYOR.
		
		
		
		
		
	}	
}

