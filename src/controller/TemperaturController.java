//Aladdin
package controller;

import model.MachineIO;

public class TemperaturController {
    //Attr. 
private Double input; 
private Double output;

//kons.

    public TemperaturController() {
    }
//Methods
//Getter & Setter
    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    public void cToF(){
        System.out.println("Wärmegrad in °C eingeben: ");
        setInput(MachineIO.getScan().nextDouble());
        setOutput((getInput() * 9/5) + 32);
        System.out.println("Wärmegrad in °F ist " + getOutput() + " °F");
    }
    public void fToC(){
        System.out.println("Wärmegrad in °F eingeben: ");
        setInput(MachineIO.getScan().nextDouble());
        setOutput((getInput() - 32) * 5/9);
        System.out.println("Wärmegrad in °C ist " + getOutput() + " °C");
    }
}
