/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aihw2;

import java.util.Vector;

/**
 *
 * @author hp
 */
public class Fruit {
    private float sweetness;
    private float color;
    private String yDesired;
    private String yActual;
    //public Vector<Integer>  weights= new Vector<>();

    public float getSweetness() {
        return sweetness;
    }

    public float getColor() {
        return color;
    }

    public void setSweetness(float sweetness) {
        this.sweetness = sweetness;
    }

    public void setColor(float color) {
        this.color = color;
    }

    public String getyDesires() {
        return yDesired;
    }

    public String getyActual() {
        return yActual;
    }

    public void setyDesires(String yDesires) {
        this.yDesired = yDesires;
    }

    public void setyActual(String yActual) {
        this.yActual = yActual;
    }
    
    
    
    
}
