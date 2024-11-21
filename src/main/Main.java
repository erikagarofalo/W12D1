package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Esercizio #1
		 * - moltiplica: accetta due interi e ritorna il loro prodotto;
		 * 
		 * - concatena: accetta una stringa e un intero e restituisce una stringa che concatena gli elementi;
		 * 
		 * - inserisciInArray: accetta un array di stringhe di cinque elementi ed una stringa e restituisce un 
		 * array di sei elementi in cui la stringa passata sia al terzo posto 
		 * e le stringhe precedentemente in quarta e quinta posizione siano rispettivamente in quinta e sesta.
		 */
		System.out.println("---------------------------------ESERCIZIO 1----------------------------------");
		System.out.println(Main.moltiplica(2, 3));
		System.out.println(Main.concatena("concatena ", 5));
		String[] cinque = {"a","b","c","d","e","f","g"};
		String stringa = "terzo";
		for(int i = 0; i < Main.inserisciInArray(cinque, stringa).length; i++) 
			System.out.println(	Main.inserisciInArray(cinque, stringa)[i]);



		/* Esercizio #2
		 * Implementare il metodo main che chiede all'utente di inserire 3 stringhe da tastiera e scrive 
		 * in console la concatenazione delle stringhe in ordine di inserimento e in ordine di inserimento inverso
		 */
		System.out.println("---------------------------------ESERCIZIO 2----------------------------------");
		Scanner in = new Scanner(System.in);
		String[] treStringhe = new String[3];

		System.out.println("Scrivi " + treStringhe.length + " stringhe");
		String concatenated = "";
		for(int i = 0; i < treStringhe.length; i++) {
			treStringhe[i] = in.nextLine();
			if(i != treStringhe.length)
				concatenated += treStringhe[i] + " ";
			else
				concatenated += treStringhe[i];
		}
		System.out.println("Concatenazione: " + concatenated);

		concatenated = "";

		for(int i = treStringhe.length-1; i >= 0; i--) {
			if(i != treStringhe.length)
				concatenated += treStringhe[i] + " ";
			else
				concatenated += treStringhe[i];
		}
		System.out.println("Reverse: " + concatenated);


		/*ESERCIZIO #3
		 * Implementare i seguenti metodi :
		 * - perimetroRettangolo che accetta la lunghezza decimale dei due lati di un rettangolo e ne calcola il
		 * perimetro;
		 * 
		 * - pariDispari che accetta un numero intero e restituisce 0 se il numeroè pari e 1 se è dispari;
		 * 
		 * - perimetroTriangolo che accetta le lunghezze decimali dei lati di un triangolo 
		 * e ne restituisca l'area (è possibile usare la formula di Erone)
		 * 
		 * Scrivere un main che utilizzzi in sequenza i tre metodi chiedendo l'input dei dati all'utente
		 */
		System.out.println("---------------------------------ESERCIZIO 3----------------------------------");
		System.out.println("Inserisci base e altezza del rettangolo");
		double w = Double.parseDouble(in.nextLine()), h = Double.parseDouble(in.nextLine());
		System.out.println("Il perimetro del rettangolo è : " + Main.perimetroRettangolo(w, h));
		System.out.println("Inserisci il numero del quale vuoi sapere se è pari o dipari");
		if(Main.pariDispari(Integer.parseInt(in.nextLine())) == 0) 
			System.out.println("Il numero è pari");
		else 
			System.out.println("Il numero è dispari");
		System.out.println("Dammi la dimensione dei 3 lati del triangolo del quale vuoi sapere l'area");
		double a = Double.parseDouble(in.nextLine()), 
				b = Double.parseDouble(in.nextLine()), 
				c = Double.parseDouble(in.nextLine());
		System.out.println("L'area del triangolo è : " + Main.perimetroTriangolo(a, b, c));
		in.close();

	}// chiusura main



	static int moltiplica(int x , int y) {
		return x*y;
	}

	static String concatena(String s, int i) {
		return s + i;
	}

	static String[] inserisciInArray(String[] arr, String s) {
		String[] sei = new String[6];
		for(int i = 0; i < sei.length; i++) {
			if(i <= 1) 
				sei[i] = arr[i];
			else if(i == 2) 
				sei[i] = s;
			else 
				sei[i] = arr[i - 1];
		}
		return sei;
	}

	static double perimetroRettangolo(double w, double h) {
		return (w*2) + (h*2);
	}

	static int pariDispari(int x) {
		return x%2 == 0? 0 : 1;
	}

	static double perimetroTriangolo(double a, double b, double c) {
		double s = (a + b + c)/2;
		return Math.sqrt(s*(s - a)*(s - b)*(s - c));
	}

}// chiusura classe
