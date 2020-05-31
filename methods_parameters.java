public class methods_parameters {
    public static void main(String[] args) {
        showName();
        anotherMethods("hello"); //something: "넣고싶은말" 
        //anotherMethods 의 출력은 another methods + something 여기서는 "hello"
    }
    public static void showName(){
        System.out.println("From ShowName");
    }


    public static void anotherMethods(String something){ //안에 넣고싶은 인자의 타입을 정함
        System.out.println("another methods " + something); 
    }
}