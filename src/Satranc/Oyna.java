package Satranc;

import java.util.Scanner;

public class Oyna {

	public static void main(String[] args) {
		boolean hata1=false;
		boolean hata1_1=false;
		boolean hata1_2=false;
		boolean hata2=false;
		boolean hata2_1=false;
		boolean hata2_2=false;
		Tahta tahta = new Tahta();
		Koordinat koordinat = new Koordinat();
		Oyuncu beyaz = new Oyuncu();
		Oyuncu siyah = new Oyuncu();
		
		
		while(true)
		{

			if(hata2!=true && hata2_1!=true && hata2_2!=true )  
			{

		    tahta.yazdir(); System.out.println();
			System.out.println("Beyaz ta�l� oyuncumuz s�ra sizin,oynatmak istedi�iniz ta��n X koordinat�?");
	    	koordinat.setbasX(new Scanner(System.in).nextByte());
	    	System.out.println("Y koordinat� l�tfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
	    	System.out.println("G�t�rmek istedi�iniz x koordinat�?"); koordinat.setsonX(new Scanner(System.in).nextByte());
	    	System.out.println("G�t�rmek istedi�iniz y koordinat� ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
			
	    	if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0')  //bo� koordiinat veya rakip ta�� se�me durumunda 
	    		{ hata1=true;  System.out.println("Hatal� koordinat se�imi"); System.out.println(); }
	    	else 
	    		hata1=false;
	    	
	    	if(Character.isUpperCase(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()])==true){
	    	    hata1_1=true;  System.out.println("Hatal� se�im! Rakip ta�� oynayamazs�n�z");
	    	}
	    	else 
	    		hata1_1=false;
	    	
	    	
	    	if(hata1_1!=true && tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
	    	  {
	    		 
	    		beyaz.koordinatiAl(koordinat);    
	    		beyaz.tahtayiAl(tahta);      
	    		
	    		   if(beyaz.tahtayaGonder()) 
	    		      {
	    			    System.out.println("hatal� koordinat giriyorsunuz "); 
	    			    hata1_2=true;  
	    		      }
	    		   else 
	    		   {
	    			   hata1=false;  hata1_1=false;  hata1_2=false;
	    		   }
	    	  }
	    	
	      }
	    		
			
			

			 
			//Siyah i�in beyaz hata yapmamal�
			
	    	if(hata1!=true && hata1_1!=true && hata1_2!=true )
	    	{

				tahta.yazdir(); System.out.println();
	    		System.out.println("Siyah ta�l� oyuncumuz s�ra sizin,oynatmak istedi�iniz ta��n X koordinat�?");
		    	koordinat.setbasX(new Scanner(System.in).nextByte());
		    	System.out.println("Y koordinat� l�tfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
		    	System.out.println("G�t�rmek istedi�iniz x koordinat�?"); koordinat.setsonX(new Scanner(System.in).nextByte());
		    	System.out.println("G�t�rmek istedi�iniz y koordinat� ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
	    	  	
	    		     if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0' )
	    		     { hata2=true;   System.out.println("Hatal� koordinat"); System.out.println();}
	    		     else
	    		    	 hata2=false;
	    		
	    		     if(Character.isLowerCase(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()])==true){
	    		    	 hata2_1=true;  System.out.println("Hatal� se�im! Rakip ta�� oynayamazs�n�z ");
	    		     }
	    		    	    
	    		    	else if(Character.isUpperCase(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()])==true)
	    		    		hata2_1=false;
	    		     
	    		      if( hata2_1==false && tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
		    	          {
		    		       
		    		        siyah.koordinatiAl(koordinat);  
		    		        siyah.tahtayiAl(tahta);     
		    		
		    		             if(siyah.tahtayaGonder())
		    		                {
		    			                System.out.println("hatal� koordinat giriyorsunuz "); 
		    		                    hata2=true; //yanl�� koordinat girmi�se 
		    		                }
		    		             else 
		    		             {
		    		            	 hata2=false; hata2_1=false; hata2_2=false;
		    		             }
		    		
		    	          }
	 
	    		
	    	 }
	    	
	    	 
		}

	}

}
