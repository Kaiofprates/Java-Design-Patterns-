package facade;

// forneme uma intergace consistente para chamar
public class Facade {

    private Light light;
    private Music music;
    private Video video;

    public Facade(){
        light = new LightImpl();
        music = new MusicImpl();
        video = new VideoImpl();
    }

    public void sing(){
        System.out.println("Start singing with ");
        light.flash();
        music.play();
    }

    public void dance(){
        System.out.println("Start dancing with ");
        light.flash();
        music.play();
        video.show();
    }
    public void act(){
        System.out.println("Start acting with");
        light.flash();
        video.show();
    }


}
