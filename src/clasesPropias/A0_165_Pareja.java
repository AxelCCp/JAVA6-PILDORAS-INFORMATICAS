package clasesPropias;

//CONVERTIMOS UNA CLASE NORMAL EN UNA CLASE GENERICA 
//T=PAR�METRO ARGUMENTO DE TIPO, SE USAN MAY�SCULAS Y SE USAN LAS LETRAS T-U-K.

public class A0_165_Pareja <T> {
	
	//ESTE CONSTRUCTO, SOLO LE D� UN ESTADO INICIAL AL CAMPO DE CLASE "PRIMERO" QUE ES IGUAL NULL.
	public A0_165_Pareja() {
		primero=null;
	}
	
	
	
	//CREAMOS UN SETTER QUE SEA CAPAS DE CAMBIAR EL VALOR DEL CAMPO DE CLASE "PRIMERO".
	//ESTE M�TODO HACE QUE EL CAMPO DE CLASE "PRIMERO" DEBE SER IGUAL AL ARHUMENTO QUE LE PASAMOS POR.. 
	//..PAR�METRO.
	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
		
	}
	
	
	//M�TODO GETTER, SE ENCARGA DE DEVOLVERNOS EL OBJETOS QUE ESTEMOS MANEJANDO EN CADA OCASI�N.
	//PONEMOS QUE NOS VA A DEVOLVER UN OBJ DE TIPO GENERICO "T" y QUE TODAV�A NO SABEMOS CUAL ES.
	public T getPrimero() {
		return primero;
	}
	
	
	//CAMPO DE CLASE
	private T primero;
}
