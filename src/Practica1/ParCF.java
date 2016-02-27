package Practica1;

public class ParCF {
	private int clave;
	private int frecuencia;
	public ParCF(int c,int f){
		setClave(c);
		setFrecuencia(f);
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public int getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}
}
