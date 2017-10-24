/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder.main;

import com.sun.xml.internal.ws.spi.db.OldBridge;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Milos Dragovic
 */
public class Main {

    public static void main(String[] args) {

        Olive lig = new Ligurio();
        Olive kal = new Kalamata();
        Olive pig = new Picholine();
        TreeSet<Olive> treeSet = new TreeSet<>();
        try {

            treeSet.add(pig);
            treeSet.add(kal);
            treeSet.add(lig);

        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        System.out.println(treeSet);
    }

}
