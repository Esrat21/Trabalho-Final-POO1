package rpgoneclick;
import java.util.Random;

public class Player extends Mob{
    
    public int DanoDaArma=15;
    Random gerador = new Random();
    
    public int getDanoDaArma() {
        return DanoDaArma+((getInteligencia()*gerador.nextInt(11))/10);
    }
    
    public void setDanoDaArma(int DanoDaArma) {
        this.DanoDaArma = DanoDaArma;
    }
    
    public int getHp(){
        return vida;
    }
    
    public void setHp(int danoSofrido){
        this.vida = danoSofrido;
    }
    
    public Player(int vida, int constituicao, int destreza, int forca, int inteligencia, int armadura, int resistencia) {
        super(vida, constituicao, destreza, forca, inteligencia, armadura, resistencia);
    }
    
    
    
}
