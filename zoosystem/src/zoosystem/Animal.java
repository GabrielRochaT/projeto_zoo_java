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
abstract class Animal {
    private int id;
    private int idade;
    private String diet;
    private boolean born_zoo;

    public Animal(int id, int idade, String diet, boolean born_zoo) {
        this.id = id;
        this.idade = idade;
        this.diet = diet;
        this.born_zoo = born_zoo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public boolean isBorn_zoo() {
        return born_zoo;
    }

    public void setBorn_zoo(boolean born_zoo) {
        this.born_zoo = born_zoo;
    }
    
}
