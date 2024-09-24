package aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public void Contrutor(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.println("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        } else {
            System.out.println("Impossível aumentar o volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        } else {
            System.out.println("Impossível diminuir o volume.");
        }
    }

    @Override
    public void ligarModo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else{
            System.out.println("Não consegui reproduzir.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(false);
        }else{
            System.out.println("Não consegui pausar.");
        }
    }
}
