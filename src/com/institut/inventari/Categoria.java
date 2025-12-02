package com.institut.inventari;

/**
 * Representa una categoria de material dins l'inventari.
 * 
 * @author Soulaimane El Bouazi
 */
public class Categoria {
	private int id; // Identificador unic
	private String nom; // Nom de la categoria

	/**
	 * Crea una nova categoria amb un id i un nom.
	 * 
	 * @param id  identificador unic
	 * @param nom nom de la categoria
	 */
	public Categoria(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	/** @return identificador de la categoria */
	public int getId() {
		return id;
	}

	/** @return nom de la categoria */
	public String getNom() {
		return nom;
	}

	/** @return representació textual de la categoria */
	@Override
	public String toString() {
		return "Categoria{" + "id=" + id + ", nom='" + nom + '\'' + '}';
	}
}
