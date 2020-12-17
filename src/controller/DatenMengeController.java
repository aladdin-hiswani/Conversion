//Aladdin
package controller;

import model.DatenMenge;
import model.MachineIO;

public class DatenMengeController {

//Attr. 
DatenMenge dm = new DatenMenge(); 


//Methods
public void KBtoB(){
    System.out.println("Wert in Kilobyte eingeben ");
    dm.setInput(MachineIO.getScan().nextDouble());
    dm.setOutput(dm.getInput()*1000);
    System.out.println("Wert in Byte ist: "+ dm.getOutput() + " Byte");
}
public void KBtoMB(){
    System.out.println("Wert in Kilobyte eingeben ");
    dm.setInput(MachineIO.getScan().nextDouble());
    dm.setOutput(dm.getInput()/1000);
    System.out.println("Wert in Megabyte ist: "+ dm.getOutput() + " Megabyte");
}
public void BtoKB(){
    System.out.println("Wert in Byte eingeben ");
    dm.setInput(MachineIO.getScan().nextDouble());
    dm.setOutput(dm.getInput()/1000);
    System.out.println("Wert in Kilobyte ist: "+ dm.getOutput() + " Kilobyte");
}
public void BtoMB(){
    System.out.println("Wert in Kilobyte eingeben ");
    dm.setInput(MachineIO.getScan().nextDouble());
    dm.setOutput(dm.getInput()/1000000);
    System.out.println("Wert in Byte ist: "+ dm.getOutput() + " Byte");
}
public void MBtoKB(){
    System.out.println("Wert in Megabyte eingeben ");
    dm.setInput(MachineIO.getScan().nextDouble());
    dm.setOutput(dm.getInput()*1000);
    System.out.println("Wert in Kilobyte ist: "+ dm.getOutput() + " Kilobyte");
}
public void MBtoB(){
    System.out.println("Wert in Megabyte eingeben ");
    dm.setInput(MachineIO.getScan().nextDouble());
    dm.setOutput(dm.getInput()*1000000);
    System.out.println("Wert in Byte ist: "+ dm.getOutput() + " Byte");
}

        
}
