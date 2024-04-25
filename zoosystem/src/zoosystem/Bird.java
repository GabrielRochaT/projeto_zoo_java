/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoosystem;

/**
 *
 * @author ALUNO
 */
public class Bird extends Animal {

    private double wingspan;
    private int size;

    public Bird(double wingspan, int size, int id, int idade, String diet, boolean born_zoo) {
        super(id, idade, diet, born_zoo);
        this.wingspan = wingspan;
        this.size = size;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public void reservedToTreatment(){
        System.out.println("Animal reservado para tratamento!");
        
    }
    
    public void updateDiet(int autentication, String new_diet){
        if (autentication == 123){
        
        }else{
        }
    }
}
    
