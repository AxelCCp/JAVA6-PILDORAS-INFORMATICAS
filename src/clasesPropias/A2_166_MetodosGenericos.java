package clasesPropias;

public class A2_166_MetodosGenericos {
	public static void main(String[]args) {
		
		//CREAMOS UN ARRAY, PARA PASARSELO AL MÉTODO GENÉRICO A TRAVÉS DE PARÁMETROS, 
		//PARA QUE NOS DEVUELVA LA LONGITUD. 
		String nombres[]= {"José","María","Pepe"};
		
		
		System.out.println(MisMatrices.getMenor(nombres));
		
		//CREAMOS UNA VARIABLE PARA QUE GUARDE LA LONGITUD DE ESTE ARRAY.
		//String elementos = MisMatrices.getElementos(nombres);
			
		//System.out.println(elementos);
		
		
		
		
		
		//-----------------------------------------------------------------------------------------
		
		
		
		
		
		
		//CREAMOS UN ARRAY DIFERENTE DE TIPO EMPLEADO, APROVECHANDO QUE TENEMOS ESTA CLASE EN EL PAQUETE.
		//CON ESTO SE VE QUE EL MÉTODO GENERICO TAMBN SIRVE PARA ESTE ARRAY DE OTRO TIPO.
		
		/* A3_166_Empleado[]listaEmpleados = {new A3_166_Empleado("Ana",21,2500),
											new A3_166_Empleado("zzz",54,2400),
											new A3_166_Empleado("xxx",43,2700),
											new A3_166_Empleado("ccc",34,2600)};
		 
		 System.out.println(MisMatrices.getElementos(listaEmpleados));	
		*/ 
	}
}


//MÉTODO GENERICO, NOS VA A DEVOLVER UN STRING. LA LONGITUD QUE TIENE UN ARRAY QUE LE PASEMOS POR.. 
//..PARÁMETRO. 
// MÉTODO PUBLIC -- PARA QUE SEA ACCESIBLE DESDE OTRAS CLASES.
// MÉTODO STATIC -- PARA CONVERTIRLO EN UN MÉTODO DE CLASE, PARA NO TENER QUE NECESITAR UNA 
//					INSTANCIA DE LA CLASE MISMATRICES.	
class MisMatrices{
	//MÉTODO GENERICO                                     //"a" es el array que le pasaremos a este método.
	
	//public static <T> String getElementos(T[]a) { 
		//return "El array tiene " +  a.length + " elementos."; 
		
	
	
	//METODO GENÉRICO QUE DEVUELVA EL ELEMENTO MENOR SE PONE "T" EN EL TIPO, PARA QUE DEVUELVA UN GENÉRICO.
	//EXTENDS COMPARABLE, PARA PODER USAR EL MÉTODO COMPARETO()
	public static <T extends Comparable> T getMenor(T[]a) { 
		if(a==null || a.length==0) {
			return null;
		}
		//CREAMOS VARIABLE PARA ALMACENAR EL ELEMENTO MENOR
		T elementoMenor = a[0]; //posición cero del array que le pasemos.
		//RECOREMOS EL ARRAY QUE LE HEMOS PASADO POR PARÁMETRO.
		//COMPARAMOS EL ELEMENTO[0] CON EL [1] 
		for(int i=1; i<a.length;i++) {
			if (elementoMenor.compareTo(a[i])>0) {
				elementoMenor=a[i];
			}
		}
		return elementoMenor;
		
		
		
		
		//USAMOS EL MÉTODO COMPARETO(): 
		//SI DEVUELVE (-1) -- EL OBJ QUE ESTAMOS COMPARANDO ES MENOR.
		//SI DEVUELVE (0) -- EL OBJ QUE ESTAMOS COMPARANDO ES IGUAL.
		//SI DEVUELVE (1) -- EL OBJ QUE ESTAMOS COMPARANDO ES MAYOR.
		
		
		
		
		
	}	
}

