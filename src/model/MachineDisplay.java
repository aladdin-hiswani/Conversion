//Aladdin
package model;

public class MachineDisplay {

//Attr.
    private Integer[] menuNumber = {1, 2, 3, 4, 5, 6, 7};
    private String[] menuTitle = {"\u001B[34m"+"Längenmaße", "\u001B[34m"+"Gewichte","\u001B[34m"+ "Temperatur", "\u001B[34m"+"Währung", "\u001B[34m"+"Datenmenge","\u001B[34m"+ "Zahlensysteme",  "\u001B[34m"+"Beenden"};

    private Integer[] subMenuDistNumber = {1, 2, 3, 4, 5, 6, 7};
    private String[]  subMenuDistTitle =  {"Von m zu cm", "Von m zu mm", "Von cm zu m", "Von cm zu mm", "Von mm zu m", "Von mm zu cm", "zurück"};

    private Integer[] subMenuWeightNumber = {1, 2, 3, 4, 5, 6, 7};
    private String[] subMenuWeightTitle = {"Von kg zu g", "Von kg zu mg", "Von g zu kg", "Von g zu mg", "Von mg zu kg", "Von mg zu g", "zurück"};

    private Integer[] subMenuTempNumber = {1, 2, 3};
    private String[] subMenuTempTitle = {"Von °C zu °F", "Von °F zu °C", "zurück"};

    private Integer[] subMenuCurrencyNumber = {1, 2, 3};
    private String[] subMenuCurrencyTitle = {"Von €uro nach U$D", "Von U$D nach €uro", "zurück"};

    private Integer[] subMenuDataNumber = {1, 2, 3, 4, 5, 6, 7};
    private String[] subMenuDataTitle = {"Von kByte zu Byte", "Von kByte zu MByte", "Von Byte zu kByte", "Von Byte zu MByte", "Von MByte zu kByte", "Von MByte zu Byte", "zurück"};

    private Integer[] subMenuNumsysNumber = {1, 2, 3, 4, 5, 6, 7};
    private String[] subMenuNumsysTitle = {"Von dez zu bin", "Von bin zu dez", "Von dez zu oct", "Von oct zu dez", "Von dez zu hex", "Von hex zu dez", "zurück"};   

//Kons.

    public MachineDisplay() {
    }
    
 //Methods 
 public void menuShow(){
     for (int i=0; i<menuNumber.length; i++)
         System.out.println(menuNumber[i] + ". " + menuTitle[i]);
 }
 public void subMenuDistShow(){
     for (int i = 0; i<subMenuDistNumber.length; i++)
         System.out.println(subMenuDistNumber[i] + ". " + subMenuDistTitle[i]);
 }
 public void subMenuWeightShow(){
     for (int i=0; i<subMenuWeightNumber.length; i++)
         System.out.println(subMenuWeightNumber[i] + ". " + subMenuWeightTitle[i]);
 }
 public void subMenuTempShow(){
     for (int i = 0; i<subMenuTempNumber.length; i++)
         System.out.println(subMenuTempNumber[i] + ". " + subMenuTempTitle[i]);
      }
 public void subMenuCurrencyShow(){
     for (int i = 0; i<subMenuCurrencyNumber.length; i++)
         System.out.println(subMenuCurrencyNumber[i] + ". " + subMenuCurrencyTitle[i]);
     
 }
 public void subMenuDataShow(){
     for (int i = 0; i<subMenuDataNumber.length; i++)
         System.out.println(subMenuDataNumber[i] + ". " + subMenuDataTitle[i]);
 }
 public void subMenuNumSysShow(){
     for (int i = 0; i<subMenuNumsysNumber.length; i++)
         System.out.println(subMenuNumsysNumber[i] + ". " + subMenuNumsysTitle[i]);
 }
 


}
