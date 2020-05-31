public class Microphone_use {
    
    public static void main(String[] args){
        Microphone microphone = new Microphone(); //객체를 인스턴스화 instantiating our object
        microphone.color = "Blue";
        microphone.name = "Blue Yeti";
        microphone.model = 13345;

        Microphone gHMic = new Microphone(); //위의 객체와는 다른 Microphone 의 인스턴스
        gHMic.model = 456;
        gHMic.name = "GHZB";
        gHMic.color = "Red";

        System.out.println(gHMic.color); //color, name, model 없이 gHMic 으로 접근하면 객체가 출력됨 like 맵
        System.out.println(gHMic.name);
        System.out.println(gHMic.model);

        System.out.println(microphone.color);
        System.out.println(microphone.name);
        System.out.println(microphone.model);
    }
}