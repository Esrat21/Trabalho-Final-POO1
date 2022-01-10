package rpgoneclick;

public class Mob {

    protected int vida;
    protected int constituicao;
    protected int destreza;
    protected int forca;
    protected int inteligencia;
    protected int armadura;
    protected int resistencia;

    public Mob(int vida, int constituicao, int destreza, int forca, int inteligencia, int armadura, int resistencia) {
        this.vida = vida;
        this.constituicao = constituicao;
        this.destreza = destreza;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.armadura = armadura;
        this.resistencia = resistencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vidaPerdida) {
        this.vida -= vidaPerdida;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

}
