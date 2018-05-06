package com.projeto.array;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayVetor {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int result=0,soma=0,sub=0,media=0,maior=0,menor=0,opera=0;
		int[] vetorAr = new int[10];
		System.out.println("Digite 10 números para o vetorAr!");
		for(int i=0;i<vetorAr.length;i++){
			System.out.printf("vetorAr[%d]=",i+1);
			vetorAr[i]=in.nextInt();
		}
		System.out.println("números armazenados!");
		System.out.printf(Arrays.toString(vetorAr));
		System.out.println();
		
		do{
			Imprimir imp = new Imprimir();
			imp.imprimi();
			result = in.nextInt();
			
			if(result!=6){
				
		if(result==1){
			for(int u=0;u<vetorAr.length;u++){
		    soma += vetorAr[u];
			}
		    opera=soma;
		    System.out.println("O resultado da operação é:"+opera);
		}else{
		if(result==2){
			  int  mult=1;
				for(int y=0;y<vetorAr.length;y++){
					     mult *= vetorAr[y];
				}
			System.out.println("O resultado da operação é:"+mult);
		}else{
	    if(result==3){
	    	for(int u=0;u<vetorAr.length;u++){
			    soma += vetorAr[u];
				}
			    opera = soma;
	            media = opera/vetorAr.length;
	            opera = media;
	            System.out.println("O resultado da operação é:"+opera);
	    }else{
	    if(result==4){
	    	for(int z=0;z<vetorAr.length;z++){
	    		if(vetorAr[z]>maior)
	    			maior = vetorAr[z];
	    	}
	    		  opera=maior;
	    		  System.out.println("O resultado da operação é:"+opera);
	    }else{
	    if(result==5){
	    	for(int z=0;z<vetorAr.length;z++){
	    		if(vetorAr[z]<menor||menor==0)
	    			menor = vetorAr[z];
	    	}
	    		  opera=menor;
	    		  System.out.println("O resultado da operação é:"+opera);
	    }else{
	    	if(result>6){
	    	System.out.println("Operação inválida!tente outra vez!...");
						         }
						 }
	    		                 }
			          }
			   }	
		    }  
	      }
		}while(result!=6);
		System.out.println("Programa Finalizado!...");
	}
}
