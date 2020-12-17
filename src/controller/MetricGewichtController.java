
package controller;
import model.MachineIO;
import model.MetricGewicht; 
public class MetricGewichtController {

//Attr.
MetricGewicht mg = new MetricGewicht();

//Kons

    public MetricGewichtController() {
    }
//Methods
    public void kgToG(){
        System.out.println("Werg in Kilogramm eingeben:");
        mg.setInput(MachineIO.getScan().nextDouble());
        mg.setOutput(mg.getInput() *1000);
        System.out.println("Wert in Gramm: " + mg.getOutput() + " g.");
    }
    public void kgToMg(){
        System.out.println("Wert in Kilogramm eingeben: ");
        mg.setInput(MachineIO.getScan().nextDouble());
        mg.setOutput(mg.getOutput()*1000000);
        System.out.println("Wert in Milligramm: " + mg.getOutput() + " mg.");
    }
    public void gToMg(){
        System.out.println("Wert in Gramm eingeben: ");
        mg.setInput(MachineIO.getScan().nextDouble());
        mg.setOutput(mg.getOutput()*1000);
        System.out.println("Wert in Milligramm: " + mg.getOutput() + " mg.");
    }
    public void gToKg(){
        System.out.println("Wert in Gramm eingeben: ");
        mg.setInput(MachineIO.getScan().nextDouble());
        mg.setOutput(mg.getOutput()/1000);
        System.out.println("Wert in Kilogramm: " + mg.getOutput() + " kg.");
    }
    public void mgToKg() {
        System.out.println("Wert in Milligramm eingeben: ");
        mg.setInput(MachineIO.getScan().nextDouble());
        mg.setOutput(mg.getInput()/1000000);
        System.out.println("Wert in Kilogramm: " + mg.getOutput() + "Kg. \n");
    }

    public void mgToG() {
        System.out.println("Wert in Milligramm eingeben: ");
        mg.setInput(MachineIO.getScan().nextDouble());
        mg.setOutput(mg.getInput()/1000);
        System.out.println("Wert in Gramm: " + mg.getOutput() + "g. \n");

    }
}
