package Part5.Interfaces;

public class Nicecar {
    private Engine engine;
    private Media player = new CDplayer();

    public Nicecar(){
        engine = new Powerengine();
    }


    public Nicecar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

}
