package arrayList;

//JAVA SIN PROGRAMACIÓN GENERICA

public class A1_164_Arraylist {
	
	//CONSTRUCTOR QUE RECIBE ARGUMENTO DE TIPO ENTERO
	public A1_164_Arraylist(int z) {
		datosElemento = new Object[z];
	}
	
	//ESTE GET SE ENCARGA DE DEVOLVERNOS UN ELEMENTO EN CONCRETO DEL ARRAY DATOSELEMENTO[] 
	public Object get(int i) {
		return datosElemento[i];
	}
	
	//CUANDO USAMOS EL METODO ADD(), LE PASAMOS POR ARGUMENTO UN OBJETO "o" Y ESTE OBJ SE POSISCIONA EN UN LUGAR DEL ARRAY 
	public void add(Object o) {
		datosElemento[i]=o;
		i++;
	}
	
	//DEFINIMOS UN ARRAY DE TIPO OBJECT
	private Object[]datosElemento;
	//DEFINIMOS VARIABLE CONTADOR
	private int i=0;
}
