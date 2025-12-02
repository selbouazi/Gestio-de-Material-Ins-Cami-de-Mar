package com.institut.inventari;

/**
 * Representa un material dins l'inventari. Cada material té un id, un nom, un
 * estat i una categoria associada.
 * 
 * @author Soulaimane El Bouazi
 */
public class Material {

	private int id; // Identificador únic
	private String nom; // Nom del material
	private String estat; // Estat actual: "disponible" o "prestat"
	private Categoria categoria; // Categoria a la qual pertany

	/**
	 * Crea un nou material amb els seus atributs bàsics.
	 * 
	 * @param id        identificador únic
	 * @param nom       nom del material
	 * @param estat     estat inicial (disponible/prestat)
	 * @param categoria categoria associada
	 */
	public Material(int id, String nom, String estat, Categoria categoria) {
		this.id = id;
		this.nom = nom;
		this.estat = estat;
		this.categoria = categoria;
	}

	/** @return identificador del material */
	public int getId() {
		return id;
	}

	/** @return nom del material */
	public String getNom() {
		return nom;
	}

	/** @return estat actual del material */
	public String getEstat() {
		return estat;
	}

	/** @return categoria associada al material */
	public Categoria getCategoria() {
		return categoria;
	}

	/** Actualitza l'estat del material */
	public void setEstat(String estat) {
		this.estat = estat;
	}

	/** @return representació textual del material */
	@Override
	public String toString() {
		return "Material{" + "id=" + id + ", nom='" + nom + '\'' + ", estat='" + estat + '\'' + ", categoria="
				+ categoria.getNom() + '}';
	}
}
