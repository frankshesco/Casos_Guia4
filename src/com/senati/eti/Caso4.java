package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int num_pares = 0, num_impares = 0;
        float promedio = 0;
        
        Integer[] numero = new Integer[5];
        
        for (int i = 0; i < numero.length; i++) {
        	System.out.println("Ingrese numero  " + (i + 1) + ":");
        	numero[i] = a.nextInt();
        	
        	if (numero[i]% 2 == 0) {
        		num_pares++;}
        	else {
        		num_impares++;}
        	
        	promedio += numero[i];
        }
        
        promedio/= numero.length;
        
        System.out.println("--------------------------------");
        System.out.println("\n----R E S U L T A D O S ------");
        System.out.println("--------------------------------");
        System.out.println("cantidad de numeros pares :" + num_pares);
        System.out.println("cantidad de numeros impares :" + num_impares);
        System.out.println("promedio de los numeros :" + promedio);
        
     
  }
}
