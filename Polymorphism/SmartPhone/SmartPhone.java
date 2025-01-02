package Polymorphism.SmartPhone;

public class SmartPhone implements Phone, Camera, AudioPlayer //we will make SmartPhone implement Phone, Camera, AudioPlayer 
{

    @Override
    public void makeCall(int number)
    {
        System.out.println("Making call");
    }

    @Override
    public void answerCall()
    {
        System.out.println("Answering call");
    }

    @Override
    public void lookupContact()
    {
        System.out.println("Looking up contact");
    }

    @Override
    public void autoFocus()
    {
        System.out.println("Engaging autofocus");
    }

    @Override
    public void takePhoto()
    {
        System.out.println("Taking photo");
    }

    @Override
    public void deletePhoto()
    {
        System.out.println("Deleting Photo");
    }

    @Override
    public void zoom(int percent)
    {
        System.out.println("Zooming in");
    }

    @Override
    public void playSong()
    {
        System.out.println("Playing a song");
    }

    @Override
    public void playPlayList()
    {
        System.out.println("Playing a playlist");
    }

    @Override
    public void skipToNextSong()
    {
        System.out.println("Skipping to next song");
    }

    @Override
    public void setVolume(int volume)
    {
        System.out.println("Setting volume to " + volume);
    }

}
