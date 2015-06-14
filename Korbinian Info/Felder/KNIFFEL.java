import java.util.Random;

class KNIFFEL{
    //Attribute und Referenzattribute;
    
    /*int zahl1;
    int zahl2;
    int zahl3;
    int zahl4;
    int zahl5;*/
    Random zufallsgenerator;
    int [] würfel;
    
    int counter = 0;
   
    
    KNIFFEL(){
        zufallsgenerator = new Random();
        würfel = new int [5];
        
    }
    
    public void würfeln(){
        if (counter < 3){
            würfel[0] = zufallsgenerator.nextInt(6) +1;
            würfel[1] = zufallsgenerator.nextInt(6) +1;
            würfel[2] = zufallsgenerator.nextInt(6) +1;
            würfel[3] = zufallsgenerator.nextInt(6) +1;
            würfel[4] = zufallsgenerator.nextInt(6) +1;
            
            
            System.out.println("Würfel 1:"+ würfel[0]);
            System.out.println("Würfel 2:"+ würfel[1]);
            System.out.println("Würfel 3:"+ würfel[2]);
            System.out.println("Würfel 4:"+ würfel[3]);
            System.out.println("Würfel 5:"+ würfel[4]);
            counter ++;
        }
        else {
            System.out.println("Die maximale Würfelanzahl von 3 ist erreicht!");
        }
    }
    
    public void EinenWürfelNochmalWerfen(int wuerfelnummer){
        if (counter < 3){
            würfel[wuerfelnummer -1] = zufallsgenerator.nextInt(6) +1;
            for (int i=0; i<5; i++){
                System.out.println("Würfel " + (i+1)+":" + würfel[i]);
                
            }
            counter++;
            
            /*System.out.println("Würfel 1:"+ würfel[0]);
            System.out.println("Würfel 2:"+ würfel[1]);
            System.out.println("Würfel 3:"+ würfel[2]);
            System.out.println("Würfel 4:"+ würfel[3]);
            System.out.println("Würfel 5:"+ würfel[4]);
            counter ++;*/
        }
        else {
            System.out.println("Die maximale Würfelanzahl von 3 ist erreicht!");
        }
    }
    
    public void wuerfeln(int[] aufnahmewuerfel){
         if(counter < 3){                
            for (int i=0;i<aufnahmewuerfel.length;i++) {
               EinenWürfelNochmalWerfen(aufnahmewuerfel[i]); 
            }
        }
    }
    
    
    
    
}