package com.institut.inventari;

import java.util.List;

/**
 * Conté la lògica principal de l'inventari. Gestiona l'afegit, préstec i
 * devolució de materials.
 * 
 * @author Soulaimane El Bouazi
 */
public class InventariService {

	// Repositori intern que guarda els materials en memòria
	private InventariRepository repo = new InventariRepository();

	/**
	 * Afegeix un material a l'inventari.
	 * 
	 * @param m material a afegir
	 */
	public void afegirMaterial(Material m) {
		repo.guardar(m);
	}

	/**
	 * Llista tots els materials de l'inventari.
	 * 
	 * @return llista de materials
	 */
	public List<Material> llistarInventari() {
		return repo.llistar();
	}

	/**
	 * Marca un material com a prestat si està disponible.
	 * 
	 * @param id     identificador del material
	 * @param usuari usuari que sol·licita el préstec
	 * @return true si s’ha prestat, false si no estava disponible
	 */
	public boolean prestarMaterial(int id, String usuari) {
		Material m = repo.buscarPerId(id);
		if (m != null && "disponible".equalsIgnoreCase(m.getEstat())) {
			m.setEstat("prestat");
			System.out.println("Préstec fet a " + usuari);
			return true;
		}
		return false;
	}

	/**
	 * Retorna un material prestat (canvia l'estat a disponible).
	 * 
	 * @param id identificador del material
	 */
	public void retornarMaterial(int id) {
		Material m = repo.buscarPerId(id);
		if (m != null) {
			m.setEstat("disponible");
		}
	}

	/**
	 * Exemple d'ús del sistema amb proves per consola.
	 */
	public static void main(String[] args) {
		InventariService service = new InventariService();
		Categoria cat = new Categoria(1, "Informàtica");
		Material pc = new Material(1, "Portàtil HP", "disponible", cat);

		service.afegirMaterial(pc);
		System.out.println(service.llistarInventari());

		service.prestarMaterial(1, "Professor Joan");
		System.out.println(service.llistarInventari());

		service.retornarMaterial(1);
		System.out.println(service.llistarInventari());
	}
}
