package Satranc;

public class At extends Tas {

	@Override
	public void hamleYap(Koordinat koordinat, Tahta tahta) {
		
		int xFark =Math.abs(koordinat.getbasX() - koordinat.getsonX());
		int yFark = Math.abs(koordinat.getbasY() - koordinat.getsonY());
		
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
		if(Degistir == 1)
		{
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='a';
        	tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		}
		
		
		else if(Degistir == 2)
		{
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='A';
        	tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		}
		
		
	}



}
