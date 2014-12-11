package Satranc;

public class Kale extends Tas{


	@Override
	public boolean hamleYap(Koordinat koordinat, Tahta tahta) {
		int a=koordinat.getbasY();
		int b=koordinat.getbasX();
		boolean girdi=false; 
		boolean yanlis_koordinat=false;
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='k') //beyazýn kale taþý
		{
		
			
		
		//dikey yukarý
		
		      if(koordinat.getsonY() < koordinat.getbasY() && koordinat.getbasX()==koordinat.getsonX())
		           {
			            while(tahta.tahta[a-1][b]==' ' || Character.isLowerCase(tahta.tahta[a-1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a-1))
		                     {
			 
			                     if(koordinat.getsonX()==b && koordinat.getsonY()==a-1 && Character.isLowerCase(tahta.tahta[a-1][b])==false)
			                          {
				                         tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
        		                         tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
        		                         
        		                         
        		                         girdi=true;
        		                         break;
			                          }
		           	     a=a-1;
		                     }
		           }
		      
		        a=koordinat.getbasY();
				b=koordinat.getbasX();
				
				//dikey aþaðý
				
				if(girdi!=true && koordinat.getsonY() > koordinat.getbasY() && koordinat.getbasX()==koordinat.getsonX())
				   {
				        while(tahta.tahta[a+1][b]==' ' || Character.isLowerCase(tahta.tahta[a+1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a+1))
				             {
					   
				                	if(koordinat.getsonX()==b && koordinat.getsonY()==a+1 && Character.isLowerCase(tahta.tahta[a+1][b])==false)
					                    {
						                   tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
		        		                   tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		        		                   girdi=true;
		        		                   break;
					                    }
					
				  	         a=a+1;
				             }
				  }
		
				a=koordinat.getbasY();
				b=koordinat.getbasX();
				
				//yatay sola 
				
				if(girdi!=true && koordinat.getsonY()==koordinat.getbasY() && koordinat.getbasX() > koordinat.getsonX())
				{
				     while(tahta.tahta[a][b-1]==' ' || Character.isLowerCase(tahta.tahta[a][b-1])!=true ||  (koordinat.getsonX()==b-1 && koordinat.getsonY()==a))
			           	{
					 
				         	if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a && Character.isLowerCase(tahta.tahta[a][b-1])==false)
					            {
						            tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
		        		            tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		        		            girdi=true;
		        		            break;
					            }
					        b=b-1;
			        	}
				}
				
				a=koordinat.getbasY();
				b=koordinat.getbasX();
				
				//yatay saða 
				
				if(girdi!=true && koordinat.getsonY()==koordinat.getbasY() && koordinat.getbasX() < koordinat.getsonX())
				{
				    while(tahta.tahta[a][b+1]==' ' || Character.isLowerCase(tahta.tahta[a][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a))
				       {
					 
				            	if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a && Character.isLowerCase(tahta.tahta[a+1][b])==false)
					                  {
						                   tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
		        		                   tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		        		                   girdi=true;
		        		                   break;
					                   }	
					      b=b+1;
					
				       }
				}
				
				
				//Beyaz için rok(1.durum)
				if(((koordinat.getbasY() == 7 && koordinat.getbasX() == 7) && (koordinat.getsonY() == 7 && koordinat.getsonX() == 5)) && (tahta.tahta[7][7] == 'k') && 
						(tahta.tahta[7][5] == ' ' && tahta.tahta[7][6] == ' ') && tahta.tahta[7][4] == 'þ')
				{
					tahta.tahta[7][6] = 'þ';
					tahta.tahta[7][5] = 'k';
					tahta.tahta[7][4] = ' ';
					tahta.tahta[7][7] = ' '; 
					System.out.println("Beyaz oyuncu Rok yaptý");
				}
				//Beyaz için rok (2.durum)
				if(((koordinat.getbasY() == 7 && koordinat.getbasX() == 0) && (koordinat.getsonY() == 7 && koordinat.getsonX() == 3)) && (tahta.tahta[7][0] == 'k') && 
						(tahta.tahta[7][1] == ' ' && tahta.tahta[7][2] == ' ' && tahta.tahta[7][3] == ' ') && tahta.tahta[7][4] == 'þ')
				{
					tahta.tahta[7][2] = 'þ';
					tahta.tahta[7][3] = 'k';
					tahta.tahta[7][4] = ' ';
					tahta.tahta[7][0] = ' '; 
					System.out.println("Beyaz oyuncu Rok yaptý");
				}
				
				
				System.out.println();	
				
		}
		
		         
	        
	        //Siyah Kale içinnnnn.....
		
		 if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='K') //siyah kale taþý
			{
			
			
			//dikey yukarý
			
			      if(koordinat.getsonY() < koordinat.getbasY() && koordinat.getbasX()==koordinat.getsonX())
			           {
				            while(tahta.tahta[a-1][b]==' ' || Character.isUpperCase(tahta.tahta[a-1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a-1))
			                     {
				 
				                     if(koordinat.getsonX()==b && koordinat.getsonY()==a-1 && Character.isUpperCase(tahta.tahta[a-1][b])==false)
				                          {
					                         tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		                         tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	        		                         girdi=true;
	        		                         break;
				                          }
			           	     a=a-1;
			                     }
			           }
			      
			        a=koordinat.getbasY();
					b=koordinat.getbasX();
					
					//dikey aþaðý
					
					if(girdi!=true && koordinat.getsonY() > koordinat.getbasY() && koordinat.getbasX()==koordinat.getsonX())
					   {
					        while(tahta.tahta[a+1][b]==' ' || Character.isUpperCase(tahta.tahta[a+1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a+1))
					             {
						   
					                	if(koordinat.getsonX()==b && koordinat.getsonY()==a+1 && Character.isUpperCase(tahta.tahta[a+1][b])==false)
						                    {
							                   tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
			        		                   tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			        		                   girdi=true;
			        		                   break;
						                    }
						
					  	         a=a+1;
					             }
					  }
			
					a=koordinat.getbasY();
					b=koordinat.getbasX();
					
					//yatay sola 
					
					if(girdi!=true && koordinat.getsonY()==koordinat.getbasY() && koordinat.getbasX() > koordinat.getsonX())
					{
					     while(tahta.tahta[a][b-1]==' ' || Character.isUpperCase(tahta.tahta[a][b-1])!=true ||  (koordinat.getsonX()==b-1 && koordinat.getsonY()==a))
				           	{
						 
					         	if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a && Character.isUpperCase(tahta.tahta[a][b-1])==false)
						            {
							            tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
			        		            tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			        		            
			        		            
			        		            
			        		            girdi=true;
			        		            break;
						            }
						        b=b-1;
				        	}
					}
					
					a=koordinat.getbasY();
					b=koordinat.getbasX();
					
					//yatay saða 
					
					if(girdi!=true && koordinat.getsonY()==koordinat.getbasY() && koordinat.getbasX() < koordinat.getsonX())
					{
					    while(tahta.tahta[a][b+1]==' ' || Character.isUpperCase(tahta.tahta[a][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a))
					       {
						 
					            	if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a && Character.isUpperCase(tahta.tahta[a+1][b])==false)
						                  {
							                   tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
			        		                   tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			        		                   girdi=true;
			        		                   break;
						                   }	
						      b=b+1;
						
					       }
					}
					
				
			}
		   
		 
		 			// Siyah için rok(1.durum)
					if(((koordinat.getbasY() == 0 && koordinat.getbasX() == 7) && (koordinat.getsonY() == 0 && koordinat.getsonX() == 5)) && (tahta.tahta[0][7] == 'k') && 
							(tahta.tahta[0][5] == ' ' && tahta.tahta[0][6] == ' ') && tahta.tahta[0][4] == 'þ')
					{
						tahta.tahta[0][6] = 'þ';
						tahta.tahta[0][5] = 'k';
						tahta.tahta[0][4] = ' ';
						tahta.tahta[0][7] = ' '; 
						System.out.println("Siyah oyuncu Rok yaptý");
					}
					
					//Siyah oyuncu için rok(2.durum)
					if(((koordinat.getbasY() == 0 && koordinat.getbasX() == 0) && (koordinat.getsonY() == 0 && koordinat.getsonX() == 3)) && (tahta.tahta[0][0] == 'k') && 
							(tahta.tahta[0][1] == ' ' && tahta.tahta[0][2] == ' ' && tahta.tahta[0][3] == ' ') && tahta.tahta[0][4] == 'þ')
					{
						tahta.tahta[0][2] = 'þ';
						tahta.tahta[0][3] = 'k';
						tahta.tahta[0][4] = ' ';
						tahta.tahta[0][0] = ' '; 
						System.out.println("Siyah oyuncu Rok yaptý");
					}
		 
		 
		 
		    if(girdi==false) yanlis_koordinat=true;
		 
			System.out.println();
			return yanlis_koordinat;
		
	}

}
