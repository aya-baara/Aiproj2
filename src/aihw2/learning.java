/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aihw2;

import java.util.Random;
import java.util.Vector;


/**
 *
 * @author hp
 */
public class learning {
   


    public static void initialization(Vector<Float> vec){
        for(int i=0;i<2*proj.neurNums;i++){


            Random r = new Random();
            float low = 0;//(float) (-2.4/2);
            float high = (float) (2.4/2);
            float result = r.nextFloat(high-low) + low;
            vec.add(result);
        }

        for(int i=0;i<proj.neurNums;i++){
            Random r = new Random();
            float low =0; //(float) (-2.4/proj.neurNums);
            float high = (float) (2.4/proj.neurNums);
            float result = r.nextFloat(high-low) + low;
            vec.add(result);

        }


    }
    
    // z : hidden layer activation function .....> 0 sigmoid   1..>Tanh  ...>  2--> Relu
    
    // y : output layer activation function 

    public  static float calacOutput(Vector<Float> weight,Fruit fruit,int z,int y){
        Vector<Float>temp=new Vector<>();
        float tempVal = 0;
        float x;
        for(int i=0;i<proj.neurNums*2;i++){
             x=fruit.getSweetness()*weight.get(i) + fruit.getColor()*weight.get(i+1);
            
            switch (z) {
                case 0 -> tempVal=Functions.sigmoid(x);
                case 1 -> tempVal=Functions.Tanh(x);
                case 2 -> tempVal=Functions.ReLU(x);
                
            }
            temp.add(tempVal);
            i++;
        }
        float out=0;
        int j=0;
        for(int i=proj.neurNums*2;i<proj.neurNums*3;i++){
            out+=temp.get(j) *weight.get(i);
            j++;

        }
        switch (y) {
                case 0 -> out=Functions.sigmoid(out);
                case 1 -> out=Functions.Tanh(out);
                case 2 -> out=Functions.ReLU(out);
                default -> {
                }
            }
        
    return out;

    }
    
    
    
    
    
    
    



}
