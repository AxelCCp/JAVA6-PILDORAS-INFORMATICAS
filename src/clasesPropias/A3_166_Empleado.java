package clasesPropias;

public class A3_166_Empleado {
	
		public  A3_166_Empleado(String nombre, int edad, double salario) {
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



