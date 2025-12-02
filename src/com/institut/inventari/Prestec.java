package com.institut.inventari;

import java.time.LocalDate;

/**
 * Representa un préstec de material dins l'inventari. Conté informació sobre el
 * material prestat, l'usuari i les dates.
 * 
 * @author Soulaimane El Bouazi
 */
public class Prestec {

	private int id; // Identificador únic del préstec
	private Material material; // Material prestat
	private String usuari; // Usuari que sol·licita el préstec
	private LocalDate dataInici; // Data d'inici del préstec
	private LocalDate dataFi; // Data de fi del préstec

	/**
	 * Crea un nou préstec amb les dades principals.
	 * 
	 * @param id        identificador únic
	 * @param material  material prestat
	 * @param usuari    usuari que sol·licita el préstec
	 * @param dataInici data d'inici
	 * @param dataFi    data de fi
	 */
	public Prestec(int id, Material material, String usuari, LocalDate dataInici, LocalDate dataFi) {
		this.id = id;
		this.material = material;
		this.usuari = usuari;
		this.dataInici = dataInici;
		this.dataFi = dataFi;
	}

	/**
	 * Marca la devolució del material prestat (canvia l'estat a disponible).
	 */
	public void marcarDevolucio() {
		material.setEstat("disponible");
	}

	/**
	 * Retorna una representació textual del préstec. Exemple: Prestec{id=1,
	 * material=Portàtil HP, usuari='Professor Joan', dataInici=2025-12-02,
	 * dataFi=2025-12-10}
	 */
	@Override
	public String toString() {
		return "Prestec{" + "id=" + id + ", material=" + material.getNom() + ", usuari='" + usuari + '\''
				+ ", dataInici=" + dataInici + ", dataFi=" + dataFi + '}';
	}
}
