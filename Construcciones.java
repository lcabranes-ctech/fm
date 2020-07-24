package construcciones;
import java.util.Scanner;
import java.util.scanner;

public class Construcciones {
	private double alto, ancho, profundidad;
	private int ambientes, pisos;
	private String ambienteTipo;
	private boolean puertaP, lucesE, lucesI, sistemaSeguridad;
	
	public Construcciones(double alto, double ancho, double profundidad, int ambientes, 
	 int pisos, String ambienteTipo, boolean puertaP, boolean lucesE, boolean lucesI, boolean sistemaSeguridad) {
			            	  this.alto = alto;
			            	  this.ancho = ancho;
			            	  this.profundidad = profundidad;
			            	  this.ambientes = ambientes;
			            	  this.pisos = pisos;
			            	  this.ambienteTipo = ambienteTipo;
			            	  this.puertaP = puertaP;
			            	  this.lucesE = lucesE;
			            	  this.lucesI = lucesI;
			            	  this.sistemaSeguridad = sistemaSeguridad;
		
		
	}
	
	public void datosFisiscos() {
		
		System.out.println("Altura: " + alto + " mts.");
		System.out.println("Ancho: " + ancho + " mts.");
		System.out.println("Profundidad: " + profundidad + " mts.");
		
	}
	
	public void distribucionEspacios() {
		
		System.out.println("Cantidad de ambientes: " + ambientes);
		System.out.println("Cantidad de pisos: " + pisos);
		System.out.println(ambienteTipo + ".");
		
	}
	
	public void mecanismos() {
		if(puertaP == true) {
			
			System.out.println("La puerta principal esta abierta.");
			
		} else {
			
			System.out.println("La puerta pricipal esta cerrada.");
			
		}
		
		if(lucesE == true) {
			
			System.out.println("Las luces exteriores estan prendidas.");
			
		} else {
			
			System.out.println("Las luces exterioresestan apagadas.");
			
		}
		
		if(lucesI == true) {
			
			System.out.println("Las luces interiores estan prendidas.");
			
		} else {
			
			System.out.println("Las luces interiores estan apagadas.");
		}
		
		if(sistemaSeguridad == true) {
			
			System.out.println("Sistema de seguridad: encendido.");
			
		} else {
			
			System.out.println("Sistema de seguridad: apagado.");
		}
	}
	
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int nroConstruccion;
		
		//Estructuras
        Casa casita = new Casa(); 	
		Departamento depart = new Departamento();
		Kiosco kiosquito = new Kiosco();
		Office oficina = new Office();
		
		System.out.println("Selleccione una estructura:");
		System.out.println("Casa(1)  Departamento dos ambientes(2)  Kiosco(3)  Oficinas(4)");
		
		nroConstruccion = entrada.nextInt();
		
		if(nroConstruccion == 1) {
			
			casita.datosFisiscos();
			casita.distribucionEspacios();
			casita.mecanismos();
			
		} else if (nroConstruccion == 2) {
			
			depart.datosFisiscos();
			depart.distribucionEspacios();
			depart.mecanismos();
			
		} else if (nroConstruccion == 3) {
			
			kiosquito.datosFisiscos();
			kiosquito.distribucionEspacios();
			kiosquito.mecanismos();
			
		} else if (nroConstruccion == 4) {
			
			oficina.datosFisiscos();
			oficina.distribucionEspacios();
			oficina.mecanismos();
			
		} else {
			
			System.out.println("La estructura no existe.");
			
		}
		
	}
}
