public class methods_parameters {
    public static void main(String[] args) {
        showName();
        anotherMethods("hello",23); //something: "넣고싶은말" 
        //anotherMethods 의 출력은 another methods + something 여기서는 "hello"
    }
    public static void showName(){
        System.out.println("From ShowName");
    }


    public static void anotherMethods(String something, int age){
        if(age<90){
            System.out.println("I am still young!!");
        }

        System.out.println("another methods " + something +" "+ age);
    }
}