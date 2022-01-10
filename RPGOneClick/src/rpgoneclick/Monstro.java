package rpgoneclick;

import java.util.Random;

public class Monstro {
    
    private int Dano=8;
    private int vida;
    private int def;

    Monstro(int d, int v,int de) {
        this.Dano = d;
        this.vida = v;
        this.def = de;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vidaperdida) {
        this.vida = vidaperdida ;
    }

    public Monstro(int vida) {
        this.vida = vida;
    }
    
    
    Random gerador = new Random();
    
    
    public int getDano() {
        return Dano+gerador.nextInt(5);
    }
    
    public int getHp(){
        return vida;
    }
    
    public void setHp(int v){
        this.vida = v;
    }
    
    public void setDano(int n){
        Dano = n;
    }
    
}
