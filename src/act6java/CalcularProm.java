/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act6java;

/**
 *
 * @author LDranzer
 */
final class CalcularProm {
    
    public int[]calif = {80,90,75,100,100};
    public int value;
    public String letter;
    public String name="Esau";
    
    
    
    public void sumCalif(){
        
    int prom = calif[0]+calif[1]+calif[2]+calif[3]+calif[4];
    
    value = prom/5;
    
    }
    
    public void calif(){
        if(value<=50){
            letter = "F";
        }
        if(value>=51 && value<=60){
            letter = "E";
        }
        if(value>=61 && value<=70){
            letter = "D";
        }
        if(value>=71 && value<=80){
            letter = "C";
        }
        if(value>=81 && value<=90){
            letter = "B";
        }
        if(value>=91 && value<=100){
            letter = "A";
        }
        
    }
    
    public void print(){
        
        System.out.println("Nombre del estudiante: " + name);
        System.out.println("Calificación 1: " + calif[0]);
        System.out.println("Calificación 2: " + calif[1]);
        System.out.println("Calificación 3: " + calif[2]);
        System.out.println("Calificación 4: " + calif[3]);
        System.out.println("Calificación 5: " + calif[4]);
        System.out.println("Promedio: " + value);
        System.out.println("Calificación: " + letter);
        
    }
    
}
