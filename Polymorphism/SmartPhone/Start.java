package Polymorphism.SmartPhone;

public class Start {
    public static void main(String[] args)
    {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.takePhoto();
        smartPhone.makeCall(555);
        smartPhone.playSong();

         Camera c1 = smartPhone; 

         c1.autoFocus();

         ((SmartPhone)c1).makeCall(555);  

         Phone p1 = smartPhone; 

         p1.answerCall();

         ((SmartPhone)p1).autoFocus(); 

    }
}