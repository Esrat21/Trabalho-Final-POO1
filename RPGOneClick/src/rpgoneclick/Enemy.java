/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgoneclick;
public class Enemy extends Character { // SUBCLASSE DE ENEMY
    private int maxHp;
    private int dmg;
    private int hpAtual;
    Enemy(int pLvl){
        if (pLvl == 1){
           maxHp = 15;
           dmg = Dice(4);
           hpAtual = maxHp;
           Armor = 10;
        }
        else if (pLvl == 2){
           maxHp = 20;
           dmg = Dice(6);
           hpAtual = maxHp;
           Armor = 12;
        }
        else if (pLvl == 3){
           maxHp = 25;
           dmg = Dice(8);
           hpAtual = maxHp;
           Armor = 15;
        }
    }

    public int getHpAtual() {
        return hpAtual;
    }

    public void setHpAtual(int hpAtual) {
        this.hpAtual = hpAtual;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int Strength) {
        this.Strength = Strength;
    }

    public int getArmor() {
        return Armor;
    }

    public void setArmor(int Armor) {
        this.Armor = Armor;
    }
    
@Override 
   public boolean Run(){
       boolean run = false;
       if(Dice(20)>15){
           run = true;
       }
       return run;
   } 
   
}
