package Satranc;

public class Fil extends Tas{


	@Override
	public void hamleYap(Koordinat koordinat, Tahta tahta) {
		int a=koordinat.getbasY();   
		int b=koordinat.getbasX();
		boolean girdi=false; 
		
		
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='f')  //beyaz oyuncu oynuyorsa
		{
		
		//sol yukar� �apraz 
		
		
		if(koordinat.getsonX() < koordinat.getbasX() && koordinat.getbasY() > koordinat.getsonY())
		{	
			//bo��a veyaz kendi ta��ndan farkl� bir ta�sa
		       while(tahta.tahta[a-1][b-1]==' ' || Character.isLowerCase(tahta.tahta[a-1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1 ))
		        {
			        if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1 && Character.isLowerCase(tahta.tahta[a-1][b-1])==false)
			            {
				              tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
        		              tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
        		              girdi=true;
        		              break;
			            }
			
		          	a=a-1;  b=b-1;
			
	            }
		}
		
		a=koordinat.getbasY();
		b=koordinat.getbasX();
		
		//sa� yukar� �apraz 
		
	    if(girdi!=true && koordinat.getsonX() > koordinat.getbasX() && koordinat.getsonY() < koordinat.getbasY())
		{	
		        while(tahta.tahta[a-1][b+1]==' ' || Character.isLowerCase(tahta.tahta[a-1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1 ))
		         {
			         if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1 && Character.isLowerCase(tahta.tahta[a-1][b+1])==false)
			            {
				            tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
        		            tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
        		            girdi=true;
        		            break;
			            }
			
		         	a=a-1;  b=b+1;
			
		         }
		}
		
		a=koordinat.getbasY();
		b=koordinat.getbasX();
		
		//sol a�a�� �apraz 
		
		if(girdi!=true && koordinat.getsonX() < koordinat.getbasX() && koordinat.getsonY() > koordinat.getbasY())
		{	
		    while(tahta.tahta[a+1][b-1]==' ' || Character.isLowerCase(tahta.tahta[a+1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1 ))
	           	{
			       if (koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1 && Character.isLowerCase(tahta.tahta[a+1][b-1])==false)
			            {
				             tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
        		             tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
        		             girdi=true; 
        		             break;
			            }
			
			     a=a+1;  b=b-1;		
		        }
		}
		
		a=koordinat.getbasY();
		b=koordinat.getbasX();
		
		//sa� a�a�� �apraz 
		
		if(girdi!=true && koordinat.getsonX() > koordinat.getbasX() && koordinat.getsonY() > koordinat.getbasY())
		{	
		    while(tahta.tahta[a+1][b+1]==' ' || Character.isLowerCase(tahta.tahta[a+1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1 ))
		         {
			         if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1 && Character.isLowerCase(tahta.tahta[a+1][b+1])==false)
			             {
				              tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
        		              tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
        		              girdi=true;
        		              break;
			             }
			
			     a=a+1;  b=b+1;
			
	           	}
		}
	}
	
		tahta.yazdir(); System.out.println();
		
		      //Siyah fil i�in
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='F')
		{
			
			//sol yukar� �apraz 
			
			
			if(koordinat.getsonX() < koordinat.getbasX() && koordinat.getbasY() > koordinat.getsonY())
			{	
				//bo��a veyaz kendi ta��ndan farkl� bir ta�sa
			       while(tahta.tahta[a-1][b-1]==' ' || Character.isUpperCase(tahta.tahta[a-1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1 ))
			        {
				        if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1 && Character.isUpperCase(tahta.tahta[a-1][b-1])==false)
				            {
					              tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		              tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	        		              girdi=true;
	        		              break;
				            }
				
			          	a=a-1;  b=b-1;
				
		            }
			}
			
			a=koordinat.getbasY();
			b=koordinat.getbasX();
			
			//sa� yukar� �apraz 
			
		    if(girdi!=true && koordinat.getsonX() > koordinat.getbasX() && koordinat.getsonY() < koordinat.getbasY())
			{	
			        while(tahta.tahta[a-1][b+1]==' ' || Character.isUpperCase(tahta.tahta[a-1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1 ))
			         {
				         if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1 && Character.isUpperCase(tahta.tahta[a-1][b+1])==false)
				            {
					            tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		            tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	        		            girdi=true;
	        		            break;
				            }
				
			         	a=a-1;  b=b+1;
				
			         }
			}
			
			a=koordinat.getbasY();
			b=koordinat.getbasX();
			
			//sol a�a�� �apraz 
			
			if(girdi!=true && koordinat.getsonX() < koordinat.getbasX() && koordinat.getsonY() > koordinat.getbasY())
			{	
			    while(tahta.tahta[a+1][b-1]==' ' || Character.isUpperCase(tahta.tahta[a+1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1 ))
		           	{
				       if (koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1 && Character.isUpperCase(tahta.tahta[a+1][b-1])==false)
				            {
					             tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		             tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	        		             girdi=true; 
	        		             break;
				            }
				
				     a=a+1;  b=b-1;		
			        }
			}
			
			a=koordinat.getbasY();
			b=koordinat.getbasX();
			
			//sa� a�a�� �apraz 
			
			if(girdi!=true && koordinat.getsonX() > koordinat.getbasX() && koordinat.getsonY() > koordinat.getbasY())
			{	
			    while(tahta.tahta[a+1][b+1]==' ' || Character.isUpperCase(tahta.tahta[a+1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1 ))
			         {
				         if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1 && Character.isUpperCase(tahta.tahta[a+1][b+1])==false)
				             {
					              tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		              tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	        		              girdi=true;
	        		              break;
				             }
				
				     a=a+1;  b=b+1;
				
		           	}
			}
			
	
		}
		
		tahta.yazdir();  System.out.println();
		
	}

}
