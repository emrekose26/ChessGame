package Satranc;

public class Fil extends Tas{


	@Override
	public boolean hamleYap(Koordinat koordinat, Tahta tahta) {
		int a=koordinat.getbasY();   
		int b=koordinat.getbasX();
		boolean girdi=false; 
		boolean yanlis_koordinat=false;
		int c,d;
		boolean tehdit=false;
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='f')  //beyaz oyuncu oynuyorsa
		{
		
		//sol yukar� �apraz 
		
		
		if(koordinat.getsonX() < koordinat.getbasX() && koordinat.getbasY() > koordinat.getsonY())
		{	
			//bo��a ve kendi ta��ndan farkl� bir ta�sa
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
	
		System.out.println();
		
		if(girdi==true && Character.isLowerCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()])==true)
		{
			tehdit=false;
			c=koordinat.getsonY();
			d=koordinat.getsonX();
			
			//sol yukar� �apraz
			while(c-1>0 && d-1>0 && tehdit==false && (tahta.tahta[c-1][d-1]==' ' || Character.isLowerCase(tahta.tahta[a-1][b-1])!=true ))
	        {
		        if(tahta.tahta[c-1][d-1]=='�')
		            {
			             System.out.println("Beyaz ta�l� oyuncu �ah�n�z� tehdit ediyor");
			             tehdit=true;
    		              break;
		            }
		
	          	c-=1;  d-=1;
		
            }
			//sa� yukar� �apraz
			c=koordinat.getsonY();
			d=koordinat.getsonX();
			
			 while(c-1>0 && d+1<7 && tehdit==false && (tahta.tahta[c-1][d+1]==' ' || Character.isLowerCase(tahta.tahta[c-1][d+1])!=true))
             {
	   
                	if(tahta.tahta[c-1][d+1]=='�')
	                    {
		                   System.out.println("Beyaz ta�l� oyuncu siyah� tehdit ediyor.");
		                   tehdit=true;
		                   break;
	                    }
	
  	         c-=1; d+=1;
             }
			    //sol a�a�� �apraz
			    c=koordinat.getsonY();
				d=koordinat.getsonX();
				
				 while(c+1<7 && d-1>0 && tehdit==false && (tahta.tahta[c+1][d-1]==' ' || Character.isLowerCase(tahta.tahta[c+1][d-1])!=true))
	             {
		   
	                	if(tahta.tahta[c-1][d+1]=='�')
		                    {
			                   System.out.println("Beyaz ta�l� oyuncu siyah� tehdit ediyor.");
			                   tehdit=true;
			                   break;
		                    }
		
	  	         c+=1; d-=1;
	             }
				 
				 //sa� a�a�� �apraz
				 
				c=koordinat.getsonY();
				d=koordinat.getsonX();
					
				 while(c+1<7 && d+1<7 && tehdit==false && (tahta.tahta[c+1][d+1]==' ' || Character.isLowerCase(tahta.tahta[c+1][d+1])!=true))
		             {
			   
		                	if(tahta.tahta[c+1][d+1]=='�')
			                    {
				                   System.out.println("Beyaz ta�l� oyuncu siyah� tehdit ediyor.");
				                   tehdit=true;
				                   break;
			                    }
			
		  	         c+=1; d+=1;
		             }	 	
			
		}
		
		
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
			
			
			if(girdi==true && Character.isUpperCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]))
			{
				c=koordinat.getsonY();
				d=koordinat.getsonX();
				
				//sol yukar� �apraz
				while(c-1>0 && d-1>0 && tehdit==false && (tahta.tahta[c-1][d-1]==' ' || Character.isUpperCase(tahta.tahta[c-1][d-1])!=true ))
		        {
			        if(tahta.tahta[c-1][d-1]=='�')
			            {
				             System.out.println("Siyah ta�l� oyuncu �ah�n�z� tehdit ediyor");
				             tehdit=true;
	    		              break;
			            }
			
		          	c-=1;  d-=1;
			
	            }
				//sa� yukar� �apraz
				c=koordinat.getsonY();
				d=koordinat.getsonX();
				
				 while(c-1>0 && d+1<7 && tehdit==false && (tahta.tahta[c-1][d+1]==' ' || Character.isLowerCase(tahta.tahta[c-1][d+1])!=true))
	             {
		   
	                	if(tahta.tahta[c-1][d+1]=='�')
		                    {
			                   System.out.println("Beyaz ta�l� oyuncu siyah� tehdit ediyor.");
			                   tehdit=true;
			                   break;
		                    }
		
	  	         c-=1; d+=1;
	             }
				    //sol a�a�� �apraz
				    c=koordinat.getsonY();
					d=koordinat.getsonX();
					
					 while(c+1<7 && d-1>0 && tehdit==false && (tahta.tahta[c+1][d-1]==' ' || Character.isLowerCase(tahta.tahta[c+1][d-1])!=true))
		             {
			   
		                	if(tahta.tahta[c+1][d-1]=='�')
			                    {
				                   System.out.println("Beyaz ta�l� oyuncu siyah� tehdit ediyor.");
				                   tehdit=true;
				                   break;
			                    }
			
		  	         c+=1; d-=1;
		             }
					 
					 //sa� a�a�� �apraz
					 
					c=koordinat.getsonY();
					d=koordinat.getsonX();
						
					 while(c+1<7 && d+1<7 && tehdit==false && (tahta.tahta[c+1][d+1]==' ' || Character.isLowerCase(tahta.tahta[c+1][d+1])!=true))
			             {
				   
			                	if(tahta.tahta[c+1][d+1]=='�')
				                    {
					                   System.out.println("Beyaz ta�l� oyuncu siyah� tehdit ediyor.");
					                   tehdit=true;
					                   break;
				                    }
				
			  	         c+=1; d+=1;
			             }	 	
			}
		}
		
		if(girdi==false) yanlis_koordinat=true;
		
		System.out.println();	
		return yanlis_koordinat;
	}

}
