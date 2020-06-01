public class Microphone {
    //instance variables / properties / fields
    private String name;
    private String color;
    private int model;

    //비어있는 constructor나 더 적은수의 인자를 가진것을 만들어도 괜찮음 몇개든 제작가능! //but다른 것과 아에 같은것은 안됨.
    public Microphone(){}
    
    public Microphone(String name, String color){
        this.name = name;
        this.color = color;
    }

    //Alt + Insert => generate code => constructor// 컨스트럭터 사용으로 다른 곳에서 사용할때 더 간편함
    //위에서 정의한 클래스명과 같아야함
    public Microphone(String name, String color, int model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    //Alt + Insert
    //Getters And Setters =>오버라이드 할수 있게 따로 도와줌
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    //Actions methods => 다른곳에서 사용할수 있도록 정의해줌
    public void turnOff(){
        System.out.println(this.name + " Turn Off"); //this.name => 메소드의 name
    }
    public void turnOn(){
        System.out.println(this.name + " Turn On");
    }
    public void setVolume(){
        System.out.println(this.name + " Setting volume");
    }

    public String showDescription(){
        return "Microphone name " + "with color: " + this.color
                + " and its model " + this.model;
    }
}