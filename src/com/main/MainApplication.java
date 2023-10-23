package com.main;

import com.bean.Academy;
import com.bean.Corso;

public class MainApplication {

	public static void main(String[] args) {

		int arrayInt[] = new int[3];
		arrayInt[0] = 1;
		arrayInt[1] = 2;
		arrayInt[2] = 3;

		/*
		 * int arrayNew [] = {1,2,3,4,5}
		 */

		/*
		 * CICLO FOR
		 */
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++ for");

		/*
		 * ITERAZIONE AL CONTRARIO DA PIù GRANDE A PIù PICCOLO
		 */
		for (int i = arrayInt.length - 1; i >= 0; i--) {
			System.out.println(arrayInt[i]);

		}

		/*
		 * CICLO FOREACH
		 */

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++ foreach");

		for (int i : arrayInt) {
			System.out.println(i);

		}

		/*
		 * CICLO WHILE
		 */

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++ while");

		int i = 0;

		while (i < arrayInt.length) {
			i++;
			System.out.println(i);

		}

		/*
		 * ARRAY DI OGGETTI
		 */
		Corso corsi[] = new Corso[3];
		corsi[0] = new Corso("a", "b", "c");
		corsi[1] = new Corso("d", "e", "f");
		corsi[2] = new Corso("g", "h", "j");
		
		/*
		 * FOREACH OGGETTI
		 */
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++ foreach oggetti");
		
		for (Corso corso : corsi) {
			if(corso.getSede().equals("c")) {
			
			System.out.println(corso.toString());
			}
			
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++ foreach oggetti mischiati");
		
		Object arrayCA [] = new Object[2];
		arrayCA[0] = new Corso("1", "2", "3");
		arrayCA[1] = new Academy("4", "5", "6", "7");
		
		for(Object object : arrayCA) {
			
			System.out.println(object.toString());
			
		}

	}

}
