package org.javaClasses.libreria;


public class Book {

	private String nome;
	private String ID;
	private Double prezzo;
	private Integer disponibilitÓ;
	private String genere;
	
	public Book(String nome, Double prezzo, String genere){
		this.nome = nome;
		this.prezzo = prezzo;
		this.genere = genere;
		disponibilitÓ = 1;
		ID = generateID();
	}
	
	public Book(String nome, Double prezzo, String genere, Integer disponibilitÓ){
		this.nome = nome;
		this.prezzo = prezzo;
		this.genere = genere;
		this.disponibilitÓ = disponibilitÓ;
		ID = generateID();
	}
	
	private String generateID() {
		String ID = "";
		if(nome.length() < 4)
			ID = nome.substring(0, nome.length());
		else
			ID = nome.substring(0, 4);
		return ID;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(Double nuovoPrezzo) {
		if(nuovoPrezzo <= 0) {
			System.out.println("Non si pu˛ inserire un prezzo minore o uguale a 0");
			return;
		}
		prezzo = nuovoPrezzo;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public void aggiungiDisponibilitÓ(int disp) {
		if(disp <= 0) {
			System.out.println("Non si pu˛ aggiungere una disponibilitÓ minore o uguale a 0");
			return;
		}
		disponibilitÓ += disp;
	}
	
	public void sottraiDisponibilitÓ(int disp) {
		if(disp <= 0) {
			System.out.println("Non si pu˛ sottrarre una disponibilitÓ minore o uguale a 0");
			return;
		}
		else if(disponibilitÓ < disp) {
			System.out.println("Non c Ŕ disponibilitÓ del prodotto");
			return;
		}
		
		disponibilitÓ -= disp;
	}
	
	public Integer getDisponibilitÓ() {
		return disponibilitÓ;
	}
	
	public void applicaSconto(Integer percentuale) {
		if(percentuale <= 0 || percentuale >= 100) {
			System.out.println("Non Ŕ possibile effettuare lo sconto del " + percentuale + "%");
			return;
		}
	
		Double nuovoPrezzo = prezzo - (prezzo/100*percentuale);
		prezzo = nuovoPrezzo;
	}
}
