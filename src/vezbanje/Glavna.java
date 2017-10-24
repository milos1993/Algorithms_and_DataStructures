/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vezbanje;

/**
 *
 * @author Milos Dragovic
 */
  public  class Glavna {
    String name;
    public Glavna(String name){
        this.name = name;
    }
    String printText(){
        return "Ja sam Glavna klasa";
    }
    String callForPrint(){
    return printText()+this.name;
    }

}


