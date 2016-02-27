package Practica1;

public class ParCF {
	private String clave;
	private int frecuencia;
	public ParCF(String c,int f){
		clave = c;
		frecuencia = f;
	}
	public ParCF(int f){
		clave = null;
		frecuencia = f;
	}
	public String getClave() {
		return clave;

	}
	public int getFrecuencia() {
		return frecuencia;
	}
}
