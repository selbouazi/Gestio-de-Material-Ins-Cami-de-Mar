package com.institut.inventari;

import java.util.ArrayList;
import java.util.List;

/**
 * Simula un repositori de materials. Guarda i gestiona els materials en memòria
 * (sense base de dades real).
 * 
 * @author Soulaimane El Bouazi
 */
public class InventariRepository {

	// Llista interna on es guarden els materials
	private List<Material> materials = new ArrayList<>();

	/**
	 * Desa un material al repositori.
	 * 
	 * @param m material a guardar
	 */
	public void guardar(Material m) {
		materials.add(m);
	}

	/**
	 * Retorna tots els materials guardats.
	 * 
	 * @return llista completa de materials
	 */
	public List<Material> llistar() {
		return materials;
	}

	/**
	 * Busca un material pel seu identificador.
	 * 
	 * @param id identificador únic
	 * @return el material si existeix, o null si no es troba
	 */
	public Material buscarPerId(int id) {
		for (Material m : materials) {
			if (m.getId() == id) {
				return m;
			}
		}
		return null;
	}
}
