//Aladdin
package view;

import controller.MachineDisplayController;

public class StartApp {
//Attr.
    public StartApp() {
    }
    
    
    
    //Method
    public void start(){
        new MachineDisplayController().menu();
    }
}
