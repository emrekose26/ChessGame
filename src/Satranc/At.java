package Satranc;

public class At extends Tas {

	@Override
	public boolean hamleYap(Koordinat koordinat, Tahta tahta) {
		
		int xFark =Math.abs(koordinat.getbasX() - koordinat.getsonX());
		int yFark = Math.abs(koordinat.getbasY() - koordinat.getsonY());
		boolean  yanlis_koordinat=false;
		int Degistir = 0;
		boolean tehdit=false;
		int a,b;
		
		//1.oyuncunun at i�in oynama durumlar�
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'a')
		{
			if(((xFark == 1 && yFark == 2) || (xFark == 2 && yFark == 1)))
			{
				//oynayaca�� koordinat�n bo� olma ve rakip ta�� bulundurma durumu(yeme)
				if((tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] != ' ') || (tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'P') || (tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'K')|| (tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'A') || 
						(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'F')|| (tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'V'))
					Degistir = 1; 
				   
			}
		}
		
		//2.oyuncunun at i�in oynama durumlar�
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'A')
		{
			if(((xFark == 1 && yFark == 2) || (xFark == 2 && yFark == 1)))
			{
				if(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] != ' ' || tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'p' || tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'k'|| tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'a' || 
						tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'f'|| tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'v')
					    Degistir = 2;
				   
			}
			
		}
		
		//1. ve 2.oyuncunun oynayabilme durumlar�
		
		if( Degistir==0) yanlis_koordinat=true;		 //�artlara uymam�� de�i�memi� demekki hataal�
		
		 a=koordinat.getsonY();
		 b=koordinat.getsonX();
		
		
		 if( Degistir == 1)
		  {
			  tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='a';
       	  tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';


       	    if(b+1<7 &&  a-2>0 && tehdit!=true && tahta.tahta[a-2][b+1]=='�')
       	    {
       	    	tehdit=true;
       	    	System.out.println("Beyaz oyuncu �ah �ekti");
       	    }
       	    else if(b-1>0 && a-2>0 && tehdit!=true && tahta.tahta[a-2][b-1]=='�')
       	    {
       	    	tehdit=true;
       	    	System.out.println("Beyaz oyuncu �ah �ekti");
       	    }
       	    else if(b+2<7 && a-1>0 && tehdit!=true && tahta.tahta[a-1][b+2]=='�')
       	    {
       	    	tehdit=true;
       	    	System.out.println("Beyaz oyuncu �ah �ekti");
       	    }
       	    else if(b+2<7 && a+1<7 && tehdit!=true && tahta.tahta[a+1][b+2]=='�')
       	    {
       	    	tehdit=true;
       	    	System.out.println("Beyaz oyuncu �ah �ekti");
       	    }
       	    else if(b+1<7 && a+2<7 && tehdit!=true && tahta.tahta[a+2][b+1]=='�')
       	    {
       	    	tehdit=true;
       	    	System.out.println("Beyaz oyuncu �ah �ekti");
       	    }
       	    else if(b-1>0 && a+2<7 && tehdit!=true && tahta.tahta[a+2][b-1]=='�')
       	    {
       	    	tehdit=true;
       	    	System.out.println("Beyaz oyuncu �ah �ekti");
       	    }
       	    else if(b-2>0 && a+1<7 && tehdit!=true && tahta.tahta[a+1][b-2]=='�')
       	    {
       	    	tehdit=true;
       	    	System.out.println("Beyaz oyuncu �ah �ekti");
       	    }
       	    else if(b-2>0 && a-1>0 && tehdit!=true && tahta.tahta[a-1][b-2]=='�')
       	    {
       	    	tehdit=true;
       	    	System.out.println("Beyaz oyuncu �ah �ekti");
       	    }		
		  
		  } 
		
		
		   else if( Degistir == 2)
	    	{
			  tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='A';
       	  tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
       	  
       	  
       	  if(b+1<7 &&  a-2>0 && tehdit!=true && tahta.tahta[a-2][b+1]=='�')
     	    {
     	    	tehdit=true;
     	    	System.out.println("Siyah oyuncu �ah �ekti");
     	    }
     	    else if(b-1>0 && a-2>0 && tehdit!=true && tahta.tahta[a-2][b-1]=='�')
     	    {
     	    	tehdit=true;
     	    	System.out.println("Siyah oyuncu �ah �ekti");
     	    }
     	    else if(b+2<7 && a-1>0 && tehdit!=true && tahta.tahta[a-1][b+2]=='�')
     	    {
     	    	tehdit=true;
     	    	System.out.println("Siyah oyuncu �ah �ekti");
     	    }
     	    else if(b+2<7 && a+1<7 && tehdit!=true && tahta.tahta[a+1][b+2]=='�')
     	    {
     	    	tehdit=true;
     	    	System.out.println("Siyah oyuncu �ah �ekti");
     	    }
     	    else if(b+1<7 && a+2<7 && tehdit!=true && tahta.tahta[a+2][b+1]=='�')
     	    {
     	    	tehdit=true;
     	    	System.out.println("Siyah oyuncu �ah �ekti");
     	    }
     	    else if(b-1>0 && a+2<7 && tehdit!=true && tahta.tahta[a+2][b-1]=='�')
     	    {
     	    	tehdit=true;
     	    	System.out.println("Siyah oyuncu �ah �ekti");
     	    }
     	    else if(b-2>0 && a+1<7 && tehdit!=true && tahta.tahta[a+1][b-2]=='�')
     	    {
     	    	tehdit=true;
     	    	System.out.println("Siyah oyuncu �ah �ekti");
     	    }
     	    else if(b-2>0 && a-1>0 && tehdit!=true && tahta.tahta[a-1][b-2]=='�')
     	    {
     	    	tehdit=true;
     	    	System.out.println("Siyah oyuncu �ah �ekti");
     	    }	

       	  }
		    
		System.out.println();	
		return yanlis_koordinat;
		
		
	}



}
