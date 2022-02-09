package entidades;

import java.time.LocalDate;

//Ejercicio 5, parte A
public abstract class Metal {
	public abstract float maximaPurezaAlcanzada();
	public abstract float[] cotasPurezaEfectiva();
	
	public LocalDate fecha; //Examen 4 Ejericio 4
	public boolean asignada = false; //Examen 4 Ejericio 4
	
	public Metal() {
	}
	
	public Metal(LocalDate f, boolean b) {
		this.fecha = f;
		this.asignada = b;
	}
	
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public boolean isAsignada() {
		return asignada;
	}
	public void setAsignada(boolean asignada) {
		this.asignada = asignada;
	}
	
}
