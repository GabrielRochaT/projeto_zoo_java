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
public class Fish extends Animal{
    private boolean live_sea;

    public Fish(boolean live_sea, int id, int idade, String diet, boolean born_zoo) {
        super(id, idade, diet, born_zoo);
        this.live_sea = live_sea;
    }

    public boolean isLive_sea() {
        return live_sea;
    }

    public void setLive_sea(boolean live_sea) {
        this.live_sea = live_sea;
    }
    
    
}