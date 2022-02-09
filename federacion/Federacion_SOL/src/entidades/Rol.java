package entidades;

/**
 * Examen 4 Ejercicio 2
 * Implementar la enumeración Rol. Implementar un constructor para la enumeración con ese parámetro y métodos para la
obtención de cada campo por separado
 * @author Luis
 *
 */
public enum Rol {
	DIRECTIVA("Directiva de la Federación"), 
	MANAGER("Mánager"), 
	ATLETA("Atleta"), 
	COLEGIADO("Colegiado"),
	ADMIN("Administrador"), //Examen 4 Ejercicio 3A
	INVITADO("Invitado");	//Examen 4 Ejercicio 3A

	String nombre;

	Rol(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
}
