package Satranc;

import java.util.Scanner;

public class Oyna {

	public static void main(String[] args) {
		Tahta tahta = new Tahta();
		Koordinat koordinat = new Koordinat();
		Oyuncu beyaz = new Oyuncu();
		Oyuncu siyah = new Oyuncu();
		
		boolean hata1 = false , hata2 = false;
		
		while(true){
			
			if(hata2!=true)  
			{

		    tahta.yazdir();
			System.out.println("Beyaz ta�l� oyuncumuz s�ra sizin,oynatmak istedi�iniz ta��n X koordinat�?");
	    	koordinat.setbasX(new Scanner(System.in).nextByte());
	    	System.out.println("Y koordinat� l�tfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
	    	System.out.println("G�t�rmek istedi�iniz x koordinat�?"); koordinat.setsonX(new Scanner(System.in).nextByte());
	    	System.out.println("G�t�rmek istedi�iniz y koordinat� ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
			
	    	if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0') 
	    		{ hata1=true;  System.out.println("Hatal� koordinat se�imi"); }
	    	
	    	if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
	    	  {
	    		hata1=false; beyaz.koordinatiAl(koordinat);     beyaz.tahtayiAl(tahta);       beyaz.tahtayaGonder();  
	    	  }
	    		
			} 
			

			 
			//Siyah i�in beyaz hata yapmamal�
			
	    	if(hata1!=true)
	    	{

				tahta.yazdir();
	    		System.out.println("Siyah ta�l� oyuncumuz s�ra sizin,oynatmak istedi�iniz ta��n X koordinat�?");
		    	koordinat.setbasX(new Scanner(System.in).nextByte());
		    	System.out.println("Y koordinat� l�tfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
		    	System.out.println("G�t�rmek istedi�iniz x koordinat�?"); koordinat.setsonX(new Scanner(System.in).nextByte());
		    	System.out.println("G�t�rmek istedi�iniz y koordinat� ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
	    	  	
	    		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0')
	    		     { hata2=true;   System.out.println("Hatal� koordinat"); }
	    		
	    		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
		    	  {
		    		hata2=false;   beyaz.koordinatiAl(koordinat);     beyaz.tahtayiAl(tahta);       beyaz.tahtayaGonder();   tahta.yazdir();
		    	  }
	 
	    		
	    	}
	    	
	    	
	    	
		}

	}

}
