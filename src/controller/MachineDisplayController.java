//Aladdin
package controller;

import java.util.Scanner;
import model.MachineDisplay;
import model.MachineIO;

public class MachineDisplayController {
    //Attr. 
    MachineDisplay md = new MachineDisplay(); 
    MetricLaengeController mlc = new MetricLaengeController();
    MetricGewichtController mgc = new MetricGewichtController(); 
    
    
    private String mSelectInt; 
    private String smSelectInt; 
    boolean wantsBackOrQuit = false; 

//Kons.
    public MachineDisplayController() {
    }
   //Methods
    
    public void menu(){
        do {
            
            System.out.println("\u001B[31m"+"Bitte auswählen: ");
            md.menuShow();
            mSelectInt = MachineIO.getScan().next(); 
            switch(mSelectInt){
        case "1": 
            subMenuDist(); 
            wantsBackOrQuit = false;
            break;
        case "2": 
            subMenuWeight(); 
            wantsBackOrQuit = false;
            break;
        case "3": 
            subMenuTemp(); 
            wantsBackOrQuit = false;
            break;
        case "4": 
            subMenuCurrency(); 
            wantsBackOrQuit = false;
            break;
        case "5": 
            subMenuData(); 
            wantsBackOrQuit = false;
            break;
        case "6": 
            subMenuNumSys(); 
            wantsBackOrQuit = false;
            break;
        case "7": 
            beenden(); 
            
            wantsBackOrQuit = true;
            break;
            default:
                System.out.println("Falsche Eingabe");
               break;
                
                
            }
            
        }while (!wantsBackOrQuit); 
    }
    
    public void subMenuDist(){
        do {
            new MachineDisplay().subMenuDistShow();
                mSelectInt = MachineIO.getScan().next(); 
        switch (mSelectInt){
            case "1": 
                new MetricLaengeController().mToCm();
                wantsBackOrQuit = false; 
                break;
            case "2": 
                new MetricLaengeController().mToMm();
                wantsBackOrQuit = false; 
                break;
            case "3": 
                mlc.cmToM();
                wantsBackOrQuit = false; 
                break;
            case "4": 
                mlc.cmToMm();
                wantsBackOrQuit = false; 
                break;
            case "5": 
                mlc.mmToM();
                wantsBackOrQuit = false; 
                break;
            case "6": 
                mlc.mmToCm();
                wantsBackOrQuit = false; 
                break;
            case "7": //zurück
                wantsBackOrQuit = true; 
                break;
                
                default:
                    System.out.println("Falsche Eingabe");
                    break;
        }
        }while (!wantsBackOrQuit); 
        
    }
    public void subMenuWeight(){
        do {
            new MachineDisplay().subMenuWeightShow();
            mSelectInt = MachineIO.getScan().next(); 
        switch (mSelectInt){
            case "1": 
                mgc.kgToG();
                wantsBackOrQuit = false; 
                break;
            case "2": 
                mgc.kgToMg();
                wantsBackOrQuit = false;  
                break;
            case "3": 
                mgc.gToKg();
                wantsBackOrQuit = false;  
                break;
            case "4": 
                mgc.gToMg();
                wantsBackOrQuit = false; 
                break;
            case "5": 
                mgc.mgToKg();
                wantsBackOrQuit = false; 
                break;
            case "6": 
                mgc.mgToG();
                wantsBackOrQuit = false; 
                break;
            case "7": //zurück
                wantsBackOrQuit = true; 
                break;
                
                default:
                    System.out.println("Falsche Eingabe");
                    break;
        }
        }while (!wantsBackOrQuit); 
        
        
    }
    public void subMenuTemp(){
        do {
            new MachineDisplay().subMenuTempShow();
            mSelectInt = MachineIO.getScan().next(); 
        switch (mSelectInt){
            case "1": 
             new TemperaturController().cToF();
                wantsBackOrQuit = false; 
                break;
            case "2": 
                new TemperaturController().fToC();
                wantsBackOrQuit = false; 
                break;
            case "3": //zurück
                
                wantsBackOrQuit = true; 
                break;
                
                default:
                    System.out.println("Falsche Eingabe");
                    break;
        }
        }while (!wantsBackOrQuit); 
    }
     public void subMenuCurrency(){
        do {
            new MachineDisplay().subMenuCurrencyShow();
            mSelectInt = MachineIO.getScan().next(); 
        switch (mSelectInt){
            case "1": 
                new WaehrungController().€();
                wantsBackOrQuit = false; 
                break;
            case "2": 
                new WaehrungController().$();
                wantsBackOrQuit = false; 
                break;
            case "3": //zurück
                wantsBackOrQuit = true; 
                break;
                default:
                    System.out.println("Falsche Eingabe");
                    break;
        }
        }while (!wantsBackOrQuit); 
        
    }
    public void subMenuData(){
        do {
            new MachineDisplay().subMenuDataShow();
            mSelectInt = MachineIO.getScan().next(); 
        switch (mSelectInt){
            case "1": 
                new DatenMengeController().KBtoB();
                wantsBackOrQuit = false; 
                break;
            case "2": 
                new DatenMengeController().KBtoMB();
                wantsBackOrQuit = false;
                break;
            case "3": 
                new DatenMengeController().BtoKB();
                wantsBackOrQuit = false;
                break;
            case "4": 
                new DatenMengeController().BtoMB();
                wantsBackOrQuit = false;
                break;
            case "5": 
                new DatenMengeController().MBtoKB();
                wantsBackOrQuit = false;
                break;
            case "6": 
                new DatenMengeController().MBtoB();
                wantsBackOrQuit = false;
                break;
            case "7": //zurück
                wantsBackOrQuit = true;
                break;
                
                default:
                    System.out.println("Falsche Eingabe");
                    break;
        }
        }while (!wantsBackOrQuit); 
        
    }
    public void subMenuNumSys(){
        do {
            new MachineDisplay().subMenuNumSysShow();
            mSelectInt = MachineIO.getScan().next(); 
        switch (mSelectInt){
            case "1": 
                new ZahlensystemController().dezToBin();
                wantsBackOrQuit = false;
                break;
            case "2": 
                new ZahlensystemController().binToDez();
                wantsBackOrQuit = false;
                break;
            case "3": 
                new ZahlensystemController().dezToOCt();
                wantsBackOrQuit = false;
                break;
            case "4": 
                new ZahlensystemController().octToDez();
                wantsBackOrQuit = false;
                break;
            case "5": 
                new ZahlensystemController().dezToHex();
                wantsBackOrQuit = false;
                break;
            case "6": 
                new ZahlensystemController().hexToDez();
                wantsBackOrQuit = false;
                break;
            case "7": //zurück
                wantsBackOrQuit = true; 
                break;
                
                default:
                    System.out.println("Falsche Eingabe");
                    break;
        }
        }while (!wantsBackOrQuit); 
        
    }
    public void beenden(){
        System.out.println("Programm hat beendet"
                + "\nAufwiedersehen");
        
        
    }
    
}
