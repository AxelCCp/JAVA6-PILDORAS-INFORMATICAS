package clasesPropias;

public class A1_165_UsoPareja {
	public static void main(String[]args) {
		
		//INSTANCIAMOS LA CLASE PAREJA
		A0_165_Pareja <String> una = new A0_165_Pareja <String>();
		una.setPrimero("Juan Profesor");
		System.out.println(una.getPrimero());
		
		//HACEMOS LO MISMO, PERO CON UN OBJ DE TIPO PERSONA, PARA VER COMO SE ADAPTA EL MÉTODO SET Y GET
		Persona pers1 = new Persona("Ana");
		A0_165_Pareja <Persona> otra  = new A0_165_Pareja <Persona> ();
		otra.setPrimero(pers1);
		System.out.println(otra.getPrimero());
	}
}



class Persona {
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	//SOBREESCRIBIMOS PARA ADAPTAR EL OBJETO DE TIPO PERSONA A STRING, 
	//PARA QUE SE PUEDA LEER EL OBJ "ANA" EN LA CONSOLA.
	public String toString() {
		return nombre;
	}
	
	private String nombre;
}
