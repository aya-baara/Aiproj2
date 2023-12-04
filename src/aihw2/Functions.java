/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aihw2;

/**
 *
 * @author hp
 */
public class Functions {
    
    
    public static int step(int x){
        if(x>0) return 1;
         return 0;
    
    }
    
    public static int sign(int x){
        if(x>0) return 1;
        return -1;
    
    }
    public static float sigmoid(float x){
        return (float) (1/(1+ Math.exp(-x)));

    }
    
    public static int linear(int x){
        return x;
    }
    
    
    public static float ReLU(float x){
        if(x<0) {
            return 0;
        }
        return x;
    
    }
    public static float Tanh(float x){
        return (float) (2/(1+ Math.exp(-2*x)));
    
    }
}
