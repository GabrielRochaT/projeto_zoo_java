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
public class Reptile extends Animal{
    private boolean has_shell;

    public Reptile(boolean has_shell, int id, int idade, String diet, boolean born_zoo) {
        super(id, idade, diet, born_zoo);
        this.has_shell = has_shell;
    }

    public boolean isHas_shell() {
        return has_shell;
    }

    public void setHas_shell(boolean has_shell) {
        this.has_shell = has_shell;
    }
    
    
}
