package Part5.Interfaces;

// import javax.sound.midi.VoiceStatus;

public class Car implements Engine , Brake , Media{
    
    int a = 30;

    @Override
    public void brake(){
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start(){
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop(){
        System.out.println("I stop wngine like a normal car");
    }

    @Override
    public void acc(){
        System.out.println("I accelerate like a normal car");
    }
}
