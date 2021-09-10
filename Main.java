class Main{
	public static void main (String args[]){
		String opc;//variable de control para condicional if
		boolean seguir = true;//variable de control para el ciclo while
		
		System.out.println("\n");
		
		while(seguir){
			opc = CapturaEntrada.capturaString("Desea capturar informacion: \nS / N\n");
			if(opc.equals("s") || opc.equals("S")){
				//declaración, creación de instancias e inicialización de 3 objetos tipo Persona
				System.out.println("UTILICE MAYUSCULAS EN TODO MOMENTO.");
				System.out.println("DATOS PARA PERSONA 1:");
				Persona humano1 = new Persona(CapturaEntrada.capturaString("Ingrese nombre(s): "), 
											  CapturaEntrada.capturaString("Ingrese apellido paterno: "), 
											  CapturaEntrada.capturaString("Ingrese apellido materno: "), 
											  CapturaEntrada.capturaString("Ingrese los ultimos dos digitos de anio de nacimiento (AA): "), 
											  CapturaEntrada.capturaString("Ingrese mes de nacimiento(MM): "), 
											  CapturaEntrada.capturaString("Ingrese dia de nacimiento(DD): "), 
											  CapturaEntrada.capturaChar("Indique con H para hombre y M para mujer: "),
											  CapturaEntrada.capturaString("Siglas de entidad federatiba de nacimiento (P. ej BC para Baja California): "));
				
				System.out.println("\nDATOS PARA PERSONA 2:");
				Persona humano2 = new Persona(CapturaEntrada.capturaString("Ingrese nombre(s): "), 
											  CapturaEntrada.capturaString("Ingrese apellido paterno: "), 
											  CapturaEntrada.capturaString("Ingrese apellido materno: "), 
											  CapturaEntrada.capturaString("Ingrese los ultimos dos digitos de anio de nacimiento (AA): "), 
											  CapturaEntrada.capturaString("Ingrese mes de nacimiento(MM): "), 
											  CapturaEntrada.capturaString("Ingrese dia de nacimiento(DD): "), 
											  CapturaEntrada.capturaChar("Indique con H para hombre y M para mujer: "),
											  CapturaEntrada.capturaString("Siglas de entidad federatiba de nacimiento (P. ej BC para Baja California): "));
				
				System.out.println("\nDATOS PARA PERSONA 3:");
				Persona humano3 = new Persona(CapturaEntrada.capturaString("Ingrese nombre(s): "), 
											  CapturaEntrada.capturaString("Ingrese apellido paterno: "), 
											  CapturaEntrada.capturaString("Ingrese apellido materno: "), 
											  CapturaEntrada.capturaString("Ingrese los ultimos dos digitos de anio de nacimiento (AA): "), 
											  CapturaEntrada.capturaString("Ingrese mes de nacimiento(MM): "), 
											  CapturaEntrada.capturaString("Ingrese dia de nacimiento(DD): "), 
											  CapturaEntrada.capturaChar("Indique con H para hombre y M para mujer: "),
											  CapturaEntrada.capturaString("Siglas de entidad federatiba de nacimiento (P. ej BC para Baja California): "));
			
				//invocación de los métodos CURP y RFC de la clase persona que hacen los calculos
				System.out.println("\n");
				humano1.CURP();
				humano2.RFC();
				humano3.CURP();
				humano3.RFC();
			}else{
				seguir = false;
			}
		}
	}
}
