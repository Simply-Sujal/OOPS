package Part5.Interfaces;

public class CDplayer implements Media{
    
    @Override
    public void start(){
        System.out.println("Music Starts");
    }

    @Override
    public void stop(){
        System.out.println("Music Stops");
    }
}
