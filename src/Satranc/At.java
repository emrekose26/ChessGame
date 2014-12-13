package Satranc;

public class At extends Tas {

	@Override
	public boolean hamleYap(Koordinat koordinat, Tahta tahta) {
		
		int xFark =Math.abs(koordinat.getbasX() - koordinat.getsonX());
		int yFark = Math.abs(koordinat.getbasY() - koordinat.getsonY());
		boolean  yanlis_koordinat=false;
		int Degistir = 0;
		
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
		
		int a=koordinat.getsonY()-2;
		int b=koordinat.getsonX()-1;
		int c=koordinat.getsonX()+1;
		int d=koordinat.getsonX()+2;
		int e=koordinat.getsonX()-2;
		int f=koordinat.getsonY()-1;
		int g=koordinat.getsonY()+1;
		int h=koordinat.getsonY()+2;
		
		
		 if( Degistir == 1)
		  {
			  tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='a';
       	  tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';


       	  if((a>=0 && a<=7 && b>= 0 && b<=7 && tahta.tahta[a][b]=='�' ) || (b>=0 && b<=7 && h>=0 && h<=7 && tahta.tahta[h][b]=='�') || (a>=0 && a<=7 && c>= 0 && c<= 7 && tahta.tahta[a][c]=='�') || (f>=0 && f<=7 && d>= 0 && d<=7 && tahta.tahta[f][d]=='�' )|| (f>=0 && f<=7 && e>=0 && e<=7 &&  tahta.tahta[f][e]=='�') ||  (g>=0 && g<=7 && d>= 0 && d<=7 && tahta.tahta[g][d]=='�') || (g>=0 && g<=7 && e>=0 && e<=7 && tahta.tahta[g][e]=='�') ||(c>= 0 && c<= 7 && h>=0 && h<=7 && tahta.tahta[h][c]=='�')) {  

		     		System.out.println("Beyaz oyuncu �ah �ekti. ");
       	    }
			
		  
		  } 
		
		
		 else if( Degistir == 2)
	    	{
			  tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='A';
     	  tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
     	  
     	  if((a>=0 && a<=7 && b>= 0 && b<=7 && tahta.tahta[a][b]=='�' ) || (b>=0 && b<=7 && h>=0 && h<=7 && tahta.tahta[h][b]=='�') || (a>=0 && a<=7 && c>= 0 && c<= 7 && tahta.tahta[a][c]=='�') || (f>=0 && f<=7 && d>= 0 && d<=7 && tahta.tahta[f][d]=='�' )|| (f>=0 && f<=7 && e>=0 && e<=7 &&  tahta.tahta[f][e]=='�') ||  (g>=0 && g<=7 && d>= 0 && d<=7 && tahta.tahta[g][d]=='�') || (g>=0 && g<=7 && e>=0 && e<=7 && tahta.tahta[g][e]=='�') ||(c>= 0 && c<= 7 && h>=0 && h<=7 && tahta.tahta[h][c]=='�')) {  

		     		System.out.println("Siyah oyuncu �ah �ekti. ");
     	    }
     	  }
		    
		
		
		System.out.println();	
		return yanlis_koordinat;
		
		
	}



}
