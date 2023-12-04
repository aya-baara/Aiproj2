/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aihw2;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author hp
 */


public class proj {
    public static int neurNums;

    public static Vector <Float> weights=new Vector<>();
    public  Vector<Fruit>fruits=new Vector<>();

    public static void main(String[] args) {
        // TODO code application logic here
        
        neurNums=4;
        learning.initialization(weights);
        for(int i=0;i<weights.size();i++){
        
            System.out.println("weight(i)= "+String.format("%.2f", weights.get(i)));
        
        }
        
        Fruit fr=new Fruit ();
        fr.setSweetness((float) 5.8);
        fr.setColor(2);
        float x=learning.calacOutput(weights, fr,2,0);
        System.out.println("output is   "+x);//String.format("%.2f", x));
        
    }
    
}
