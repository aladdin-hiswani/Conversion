//Aladdin
package controller;
import model.MachineIO; 
public class ZahlensystemController {
    
    //Methods 
    public void dezToBin(){
        System.out.println("eine Dez zahl eingeben");
        int zahl = MachineIO.getScan().nextInt(); 
        int i = 0; 
        int bin[]= new int [100]; 
                
        while (zahl >0)
        {
            bin [i] = zahl%2; 
            zahl = zahl/2; 
            i++ ; 
        }
         for (int j=i-1; j>=0; j--)
             
            System.out.print(bin[j]);
        System.out.println("             \n++++++++++");
        
    }
    public void binToDez(){
        System.out.println("eine Binär Zahl eingeben");
       String bin = MachineIO.getScan().next(); 
       int deci = Integer.parseInt(bin, 2); 
       
        System.out.println("die Dezimal Zahl ist: " + deci);
        System.out.println("____________________________________");
    }
    public void dezToOCt(){
        System.out.println("eine Dez zahl eingeben");
        int zahl = MachineIO.getScan().nextInt(); 
        int i = 0; 
        int bin[]= new int [100]; 
                
        while (zahl >0)
        {
            bin [i] = zahl%8; 
            zahl = zahl/8; 
            i++ ; 
        }
         for (int j=i-1; j>=0; j--)
             
            System.out.print(bin[j]);
        System.out.println("             \n++++++++++");
    }
    public void octToDez(){
        System.out.println("eine octa Zahl eingeben");
       String bin = MachineIO.getScan().next(); 
       int octa = Integer.parseInt(bin, 8); 
       
        System.out.println("die dezimal Zahl ist: " + octa);
        System.out.println("____________________________________");
    }
    public void dezToHex(){
        int zahl = MachineIO.getScan().nextInt(), counter; 
                
        char [] ch = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexaValue = "";
        
        while (zahl >0)
        {
            counter = zahl%16; 
            hexaValue=ch[counter]+ hexaValue;
            zahl=zahl/16;
        }
        System.out.println(hexaValue);
        
    }
    public void hexToDez(){
        System.out.println("eine hexa Zahl eingeben");
       String bin = MachineIO.getScan().next(); 
       int hexa = Integer.parseInt(bin, 16); 
       
        System.out.println("die dezimal Zahl ist: " + hexa);
        System.out.println("____________________________________");
        
    }
}
