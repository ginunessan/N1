/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N1;

/**
 *
 * @author gjuni
 */
public class Ataque {
   private String nome;
	private int forca;
	
	public Ataque(String nome, int dano){
		this.nome = nome;
		this.forca = dano;
	}
	public int getDano(){
		return forca;
	}
	public String getNome(){
		return nome;
	} 
}
