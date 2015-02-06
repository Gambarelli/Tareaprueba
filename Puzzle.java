import java.util.Scanner;
        
public class Puzzle {

    public static void main(String[] args) {
            Scanner sc= new Scanner (System.in);
            int casilla11=0 + (int)(Math.random()*9);
            int casilla12=0 + (int)(Math.random()*9);
            //Random primera fila
            while (casilla12==casilla11)
            {
                casilla12=0 + (int)(Math.random()*9);
            }
            int casilla13=0 + (int)(Math.random()*9);
            while ((casilla13==casilla11)||(casilla13==casilla12))
            {
                casilla13=0 + (int)(Math.random()*9);
            }
            //Random 2 Fila
            int casilla21=0 + (int)(Math.random()*9);
            while ((casilla21==casilla11)||(casilla21==casilla12)||(casilla21==casilla13))
            {
                casilla21=0 + (int)(Math.random()*9);
            }
            int casilla22=0 + (int)(Math.random()*9);
            while ((casilla22==casilla11)||(casilla22==casilla12)||(casilla22==casilla13)||(casilla22==casilla21))
            {
                casilla22=0 + (int)(Math.random()*9);
            }
            int casilla23=0 + (int)(Math.random()*9);
            while ((casilla23==casilla11)||(casilla23==casilla12)||(casilla23==casilla13)||(casilla23==casilla21)||(casilla23==casilla22))
            {
                casilla23=0 + (int)(Math.random()*9);
            }
            //Fila 3
            int casilla31=0 + (int)(Math.random()*9);
            while ((casilla31==casilla11)||(casilla31==casilla12)||(casilla31==casilla13)||(casilla31==casilla21)||(casilla31==casilla22)||(casilla31==casilla23))
            {
                casilla31=0 + (int)(Math.random()*9);
            }
            int casilla32=0 + (int)(Math.random()*9);
            while ((casilla32==casilla11)||(casilla32==casilla12)||(casilla32==casilla13)||(casilla32==casilla21)||(casilla32==casilla22)||(casilla32==casilla23)||(casilla32==casilla31))
            {
                casilla32=0 + (int)(Math.random()*9);
            }
            int casilla33=0 + (int)(Math.random()*9);
            while ((casilla33==casilla11)||(casilla33==casilla12)||(casilla33==casilla13)||(casilla33==casilla21)||(casilla33==casilla22)||(casilla33==casilla23)||(casilla33==casilla31)||(casilla33==casilla32))
            {
                casilla33=0 + (int)(Math.random()*9);
            }
            //Se dibuja el tablero
            System.out.println(""+ casilla11+casilla12+casilla13);
            System.out.println(""+ casilla21+casilla22+casilla23);
            System.out.println(""+casilla31 + casilla32+casilla33);
            System.out.println("Usa WASD para mover el puzzle");
            
            while(!((casilla11 ==1) && (casilla12== 2) && (casilla13 ==3) && (casilla21==4) && (casilla22==5) && (casilla23==6) && (casilla31==7) && (casilla32==8) && (casilla33==0))){
               
                char pat=sc.next().charAt(0);
            //Fila3 s
               if(pat=='w')
               { 
                   
                   if(casilla33==0)
                   {
                        casilla33=casilla23;
                     casilla23=0;
                   }
                    else if(casilla32==0)
                  {
                       casilla32=casilla22;
                     casilla22=0;
                   }

                     else if(casilla31==0)
                    {
                     casilla31=casilla21;
                     casilla21=0;
                     }
                  //Fila 2 w
                    else  if(casilla23==0)
                    {
                        casilla23=casilla13;
                       casilla13=0;
                   }
                      else  if(casilla22==0)
                    {
                     casilla22=casilla12;
                      casilla12=0;
                   }
                     else  if(casilla21==0)
                     {
                        casilla21=casilla11;
                       casilla11=0;
                    }
            
                
             
               }
               //S
               if(pat=='s')
               {
             //Fila1
               if(casilla11==0)
              {
                  casilla11=casilla21;
                    casilla21=0;
                 }
                  else if(casilla12==0)
              {
                  casilla12=casilla22;
                  casilla22=0;
              }
              else if(casilla13==0)
                {
                    casilla13=casilla23;
                    casilla23=0;
                }
              //fila 2
               else if(casilla21==0)
                {
                    casilla21=casilla31;
                     casilla31=0;
               }
               else if(casilla22==0)
               {
                   casilla22=casilla32;
                  casilla32=0;
               }
                else if(casilla23==0)
              {
                  casilla23=casilla33;
                  casilla33=0;
               }
               }
               
               //A
               if (pat=='a')
               {
                   //Fila 1
                   if(casilla13==0)
                 {
                  casilla13=casilla12;
                  casilla12=0;
                 }
                   else if(casilla12==0)
              {
                  casilla12=casilla11;
                  casilla11=0;
               }//Fila 2
                   else if(casilla22==0)
              {
                  casilla22=casilla21;
                  casilla21=0;
               }
                   else if(casilla23==0)
              {
                  casilla23=casilla22;
                  casilla22=0;
               }
                   else if(casilla32==0)
              { //Fila 3
                  casilla32=casilla31;
                  casilla31=0;
               }
                   else if(casilla33==0)
              {
                  casilla33=casilla32;
                  casilla32=0;
               }}
                   //D
                   if (pat=='d')
               {
                   //Fila 1
                   if(casilla11==0)
                 {
                  casilla11=casilla12;
                  casilla12=0;
                 }
                   else if(casilla12==0)
              {
                  casilla12=casilla13;
                  casilla13=0;
               }//Fila 2
                   else if(casilla21==0)
              {
                  casilla21=casilla22;
                  casilla22=0;
               }
                   else if(casilla22==0)
              {
                  casilla22=casilla23;
                  casilla23=0;
               }
                   else if(casilla31==0)
              { //Fila 3
                  casilla31=casilla32;
                  casilla32=0;
               }
                   else if(casilla32==0)
              {
                  casilla32=casilla33;
                  casilla33=0;
               }
                  
               }
               System.out.println(""+ casilla11+casilla12+casilla13);
               System.out.println(""+ casilla21+casilla22+casilla23);
               System.out.println(""+casilla31 + casilla32+casilla33);
               
            } 
		//aqui ya se cerro el while
		
		System.out.println("El jugador ha Ganado!");
		
            
    }
    
}