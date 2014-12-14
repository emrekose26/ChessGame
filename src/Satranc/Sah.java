package Satranc;

public class Sah extends Tas{

	@Override
	public boolean hamleYap(Koordinat koordinat, Tahta tahta) {
		
		int xFark =(koordinat.getbasX() - koordinat.getsonX());
		int yFark = (koordinat.getbasY() - koordinat.getsonY());
		boolean yanlis_koordinat=false;
		int Degistir = 0;
		int Degistir2 = 0;
		
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
			
			//Beyaz i�in rok (1. durum)
			if(((koordinat.getbasY() == 7 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 7 && koordinat.getsonX() == 6)) && (tahta.tahta[7][7] == 'k') && 
					(tahta.tahta[7][5] == ' ' && tahta.tahta[7][6] == ' ') && tahta.tahta[7][4] == '�')
			{
				Degistir2 = 3;
				
			}
			//Beyaz i�in rok (2.durum)
			else if(((koordinat.getbasY() == 7 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 7 && koordinat.getsonX() == 2)) && (tahta.tahta[7][0] == 'k') && 
					(tahta.tahta[7][1] == ' ' && tahta.tahta[7][2] == ' ' && tahta.tahta[7][3] == ' ') && tahta.tahta[7][4] == '�')
			{
				Degistir2 = 4;
			}
			
		}
		
		//2.oyuncu i�in
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == '�')
		{
			//�ah�n oynama durumlar�
			if((xFark == 0 && yFark == 1)|| (xFark == 1 && yFark == 1) || (xFark == 1 && yFark == 0) || (xFark == 1 && yFark == -1) || (xFark == 0 && yFark == -1) || (xFark == -1 && yFark == -1) || (xFark == -1 && yFark == 0) || (xFark == -1 && yFark == 1) )
			{
				if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] != ' ')
				{
					Degistir = 2;
				}
				//oynanacak pozisyonda ta� varsa ve yiyebilece�i ta�lar varsa 
				else if((tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] != ' ' ) && ((tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='p') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='k') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='a') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'f') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='v')))
				{
					Degistir = 2;
				}
			}
			
			
			// Siyah i�in rok(1.durum)
			if(((koordinat.getbasY() == 0 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 0 && koordinat.getsonX() == 6)) && (tahta.tahta[0][7] == 'K') && 
					(tahta.tahta[0][5] == ' ' && tahta.tahta[0][6] == ' ') && tahta.tahta[0][4] == '�')
			{
				Degistir2 = 5;
				
			}
			
			//Siyah oyuncu i�in rok(2.durum)
			else if(((koordinat.getbasY() == 0 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 0 && koordinat.getsonX() == 2)) && (tahta.tahta[0][0] == 'K') && 
					(tahta.tahta[0][1] == ' ' && tahta.tahta[0][2] == ' ' && tahta.tahta[0][3] == ' ') && tahta.tahta[0][4] == '�')
			{
				Degistir2 = 6;
				
			}
			
		}
		
		if(Degistir == 0)  yanlis_koordinat=true;
		
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
		
		//Beyaz i�in rok(Durum 1)
		else if(Degistir2 == 3)
		{
			tahta.tahta[7][6] = '�';
			tahta.tahta[7][5] = 'k';
			tahta.tahta[7][4] = ' ';
			tahta.tahta[7][7] = ' '; 
			System.out.println("Beyaz oyuncu Rok yapt�");
		}
		
		//Beyaz i�in rok(Durum 2)
		else if(Degistir2 == 4)
		{
			tahta.tahta[7][2] = '�';
			tahta.tahta[7][3] = 'k';
			tahta.tahta[7][4] = ' ';
			tahta.tahta[7][0] = ' '; 
			System.out.println("Beyaz oyuncu Rok yapt�");
		}
		//Siyah i�in rok(Durum 1)
		else if(Degistir2 == 5)
		{
			tahta.tahta[0][6] = '�';
			tahta.tahta[0][5] = 'K';
			tahta.tahta[0][4] = ' ';
			tahta.tahta[0][7] = ' '; 
			System.out.println("Siyah oyuncu Rok yapt�");
		}
		
		//Siyah i�in rok(Durum 2) 
		else if(Degistir2 == 6)
		{
			tahta.tahta[0][2] = '�';
			tahta.tahta[0][3] = 'K';
			tahta.tahta[0][4] = ' ';
			tahta.tahta[0][0] = ' '; 
			System.out.println("Siyah oyuncu Rok yapt�");
		}
		
		System.out.println();
		return yanlis_koordinat;
		
	}

	

}
