import java.util.Random;

class Persona{
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	String anioNacimiento;//AA
	String mesNacimiento;//MM
	String diaNacimiento;//DD
	char sexo;//H, M
	String entidadFederativaNacimiento;//dos siglas
	
	//Constructor
	public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String anioNacimiento, String mesNacimiento, String diaNacimiento, char sexo, String entidadFederativaNacimiento){
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.anioNacimiento = anioNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.diaNacimiento = diaNacimiento;
		this.sexo = sexo;
		this.entidadFederativaNacimiento = entidadFederativaNacimiento;
	}
	
	public int diferenciadorNumerico (){
		int numero = (int)(Math. random()*10);
		return numero;
	}
	
	public char diferenciadorLetra(){
		Random random = new Random();
		char randomizedCharacter = (char) (random.nextInt(26) + 'A');
		return randomizedCharacter;
	}

	public char segundaConsonante(String nomAp){
		char segundaConsonante = nomAp.charAt(1);
		char terceraConsonante = nomAp.charAt(2);
		char cuartaConsonante = nomAp.charAt(3);
		
		if (segundaConsonante == 'A' || segundaConsonante == 'E' || segundaConsonante == 'I' || segundaConsonante == 'O' || segundaConsonante == 'U'){
			if (terceraConsonante == 'A' || terceraConsonante == 'E' || terceraConsonante == 'I' || terceraConsonante == 'O' || terceraConsonante == 'U'){
				if (cuartaConsonante != 'A' || cuartaConsonante != 'E' || cuartaConsonante != 'I' || cuartaConsonante != 'O' || cuartaConsonante != 'U'){
					return cuartaConsonante;
				}
			}
			else{
				return terceraConsonante;
			}
		}
		return segundaConsonante;
		
	}
	
	//CONCATENA LOS CARACTERES QUE CONFORMAN LOS 
	//PRIMEROS CUATRO DIGITOS DE LA CURP Y DEL RFC
	public String Curp(){
		String curp;
		char x1 = apellidoPaterno.charAt(0);
		char x2 = apellidoPaterno.charAt(1);
		char x3 = apellidoMaterno.charAt(0);
		char x4 = nombre.charAt(0);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(x1);
		sb.append(x2);
		sb.append(x3);
		sb.append(x4);
				
		curp = sb.toString();
		
		return curp;
	}
	
	public void CURP (){
		System.out.println("CURP de " + nombre + apellidoPaterno + apellidoMaterno);
		System.out.println(Curp() + anioNacimiento + mesNacimiento + diaNacimiento +
						   sexo + entidadFederativaNacimiento + segundaConsonante(apellidoPaterno) +
						   segundaConsonante(apellidoMaterno) + segundaConsonante(nombre) +
						   diferenciadorNumerico() + /*anioNacimiento < 2000 ? diferenciadorNumerico() : diferenciadorLetra()*/
						   diferenciadorNumerico());
		System.out.println("\n");
	}
	
	public void RFC(){
		System.out.println("RFC de " + nombre + apellidoPaterno + apellidoMaterno);
		System.out.println(Curp() + anioNacimiento + mesNacimiento + diaNacimiento + diferenciadorLetra() + diferenciadorLetra() + diferenciadorLetra());
		System.out.println("\n");
	}
	
	//getters
	public String getNombre(){
		return nombre;
	}
	
	public String getApellidoPaterno(){
		return apellidoPaterno;
	}
	
	public String getApellidoMaterno(){
		return apellidoMaterno;
	}
	
	public String getAnioNacimiento(){
		return anioNacimiento;
	}
	
	public String getMesNAcimiento(){
		return mesNacimiento;
	}
	
	public String getDiaNacimiento(){
		return diaNacimiento;
	}
	
	public char getSexo(){
		return sexo;
	}
	
	public String getEntidadFederativaNacimiento(){
		return entidadFederativaNacimiento;
	}
}

/*
AGUASCALIENTES AS
BAJA CALIFORNIA BC
BAJA CALIFORNIA SUR BS
CAMPECHE CC
COAHUILA CL
COLIMA CM
CHIAPAS CS
CHIHUAHUA CH
DISTRITO FEDERAL DF
DURANGO DG

GUANAJUATO GT
GUERRERO GR
HIDALGO HG
JALISCO JC
M…XICO MC
MICHOAC£N MN
MORELOS MS
NAYARIT NT
NUEVO LEON NL
OAXACA OC

PUEBLA PL
QUER…TARO QT
QUINTANA ROO QR
SAN LUIS POTOSÕ SP
SINALOA SL
SONORA SR
TABASCO TC
TAMAULIPAS TS
TLAXCALA TL
VERACRUZ VZ
YUCAT£N YN
ZACATECAS ZS
*/
