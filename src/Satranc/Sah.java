package Satranc;

public class Sah extends Tas{

	@Override
	public void hamleYap(Koordinat koordinat, Tahta tahta) {
		
		int xFark =(koordinat.getbasX() - koordinat.getsonX());
		int yFark = (koordinat.getbasY() - koordinat.getsonY());
		
		int Degistir = 0;
		
		//1.oyuncu i�in
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == '�')
		{
			//�ah�n oynama durumlar�
			if((xFark == 0 && yFark == 1) || (xFark == 1 && yFark == 1) || (xFark == 1 && yFark == 0) || (xFark == 1 && yFark == -1) || (xFark == 0 && yFark == -1) || (xFark == -1 && yFark == -1) || (xFark == -1 && yFark == 0) || (xFark == -1 && yFark == 1))
			{
				
				if(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == ' ')
				{
					Degistir = 1;
					
				}
				
				//oynanacak pozisyonda ta� varsa ve yiyebilece�i ta�lar varsa 
				else if((tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] != ' ' ) || ((tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='P') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='K') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='A') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='F') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='V')))
				{
					Degistir = 1;
					
				}
			}
			
		}
		
		
		
		//2.oyuncu i�in
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == '�')
		{
			//�ah�n oynama durumlar�
			if((xFark == 0 && yFark == 1)|| (xFark == 1 && yFark == 1) || (xFark == 1 && yFark == 0) || (xFark == 1 && yFark == -1) || (xFark == 0 && yFark == -1) || (xFark == -1 && yFark == -1) || (xFark == -1 && yFark == 0) || (xFark == -1 && yFark == 1) )
			{
				if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == ' ')
				{
					Degistir = 2;
				}
				//oynanacak pozisyonda ta� varsa ve yiyebilece�i ta�lar varsa 
				else if((tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] != ' ' ) && ((tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='p') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='k') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='a') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'f') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='v')))
				{
					Degistir = 2;
				}
			}
				
		}
		
		if(Degistir == 1)
		{
			tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] = '�';
		}
		else if(Degistir == 2)
		{
			tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] = '�';
		
		}
		
		
	}

	

}
