//Aladdin
package controller;

import model.MachineIO;

public class WaehrungController {
//Attr.
private Double input; 
private Double output;

//Getter & Setter

//    public Double getInput() {
//        return input;
//    }
//
//    public void setInput(Double input) {
//        this.input = input;
//    }
//
//    public Double getOutput() {
//        return output;
//    }
//
//    public void setOutput(Double output) {
//        this.output = output;
//    }

    //Methods
    public void € (){
        System.out.println("Kohle in € eingeben");  
        input= MachineIO.getScan().nextDouble(); 
        output= input * 1.13; 
//        setInput(MachineIO.getScan().nextDouble());
//        setOutput(getInput() * 1.13);
        System.out.println("Ihre Kohle in $ ist: " + output + " $");
    }
    public void $ (){
        System.out.println("Kohle in $ eingeben");    
        input= MachineIO.getScan().nextDouble(); 
        output= input * 0.89; 
//        setInput(MachineIO.getScan().nextDouble());
//        setOutput(getInput() * 0.89);
        System.out.println("Ihre Kohle in € ist: " + output + " €");
    }
    
}
