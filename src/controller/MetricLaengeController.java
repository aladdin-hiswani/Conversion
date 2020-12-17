//Aladdin
package controller;

import model.MachineIO;
import model.MetricLaenge;

public class MetricLaengeController {
    //Attr. 
    MetricLaenge ml= new MetricLaenge(); 
    
    //Kons:

    public MetricLaengeController() {
    }
    
    //Methods
    public void mToCm(){
        System.out.println("Wert in Meter eingeben: ");
        ml.setInput(MachineIO.getScan().nextDouble());
        ml.setOutput(ml.getInput()*100);
        System.out.println("Wert in Cm: " + ml.getOutput() + " cm");
    }
    public void mToMm(){
        System.out.println("Wert in Meter eingeben: ");
        ml.setInput(MachineIO.getScan().nextDouble());
        ml.setOutput(ml.getInput()*1000);
        System.out.println("Wert in mm: " + ml.getOutput() + " mm");
        
    }
    public void cmToM(){
        System.out.println("Wert in Zentimeter eingeben: ");
        ml.setInput(MachineIO.getScan().nextDouble());
        ml.setOutput(ml.getInput()/100);
        System.out.println("Wert in Meter: " + ml.getOutput() + " M");
    }
    public void cmToMm(){
        System.out.println("Wert in Zentimeter eingeben: ");
        ml.setInput(MachineIO.getScan().nextDouble());
        ml.setOutput(ml.getInput()*10);
        System.out.println("Wert in mm: " + ml.getOutput() + " mm");
    }
    
    public void mmToM(){
        System.out.println("Wert in MilliMeter eingeben: ");
        ml.setInput(MachineIO.getScan().nextDouble());
        ml.setOutput(ml.getInput()/1000);
        System.out.println("Wert in Meter: " + ml.getOutput() + " M");
    }
    public void mmToCm(){
        System.out.println("Wert in MilliMeter eingeben: ");
        ml.setInput(MachineIO.getScan().nextDouble());
        ml.setOutput(ml.getInput()/10);
        System.out.println("Wert in Zentimeter: " + ml.getOutput() + " Cm");
        
    }
}
