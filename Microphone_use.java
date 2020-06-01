public class Microphone_use {
    
    public static void main(String[] args){

        //constructor를 생성해서 사용하기전에는 함수를 정의하고 원하는 값들을 따로 microphone.블라블라로 정의했지만 
        //이를 사용함으로써 좀더 간단해진다.

        // Microphone microphone = new Microphone(); //객체를 인스턴스화 instantiating our object
        // microphone.color = "Blue";
        // microphone.name = "Blue Yeti";
        // microphone.model = 13345;

        // Microphone gHMic = new Microphone(); //위의 객체와는 다른 Microphone 의 인스턴스
        // gHMic.model = 456;
        // gHMic.name = "GHZB";
        // gHMic.color = "Red";


        //위에서 counstructor없이 사용할때는 값들을 다 정해주느라 코드가 길다.
        Microphone microphone = new Microphone("Blue Yeti", "Blue", 364663);
        Microphone gHMic = new Microphone("GHMic","red", 546);

        //오버라이드한값들을 getter와 setter를 사용해서 새로 사용해줌
        microphone.setModel(87);
        microphone.setName("New Blue Yeti");
        microphone.setColor("Red Blue");

        System.out.println("New Mic: " + microphone.getModel());


        /*
        System.out.println(gHMic.color); //color, name, model 없이 gHMic 으로 접근하면 객체가 출력됨 like 맵
        System.out.println(gHMic.name);
        System.out.println(gHMic.model);

        System.out.println(microphone.color);
        System.out.println(microphone.name);
        System.out.println(microphone.model);
        */


        //Acitons methods 사용
        microphone.turnOn();
        microphone.setVolume();
        microphone.turnOff();

        gHMic.turnOn();
        gHMic.setVolume();
        gHMic.turnOff();

        System.out.println(microphone.showDescription());

        //새로 만든 constructor
        Microphone newMic = new Microphone("NewMic","Green",123);
        Microphone otherMic = new Microphone();
        otherMic.setColor("Other Mic");

        System.out.println(otherMic.getColor());
        System.out.println(newMic);

        //좀 다른 형태로 만들어서 오버라이딩
        Microphone grandMic = new Microphone("Grand", "Yellow");
        System.out.println(grandMic);
    }
}