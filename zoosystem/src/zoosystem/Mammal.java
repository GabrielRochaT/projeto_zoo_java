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
public class Mammal extends Animal{
    private String type_coat;

    public Mammal(String type_coat, int id, int idade, String diet, boolean born_zoo) {
        super(id, idade, diet, born_zoo);
        this.type_coat = type_coat;
    }

    public String getType_coat() {
        return type_coat;
    }

    public void setType_coat(String type_coat) {
        this.type_coat = type_coat;
    }
    
}
