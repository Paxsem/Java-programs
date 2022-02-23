/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author cep
 */
public class EX5 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int numero = 2345;
		System.out.println(sumaNum(numero));
	}
	public static int sumaNum(int num) {
		int sumador;
		if(num < 10) {
			sumador = num;
		}
		else {
			sumador = (num%10) + sumaNum(num/10);
		}
		return sumador;
	}
	
}
