public class methods_return {
    public static void main(String[] args){
        System.out.println(addNums(4,5));

        //return한 값을 변수에 한번 저장 => 다른값을 추가하기 쉬움
        int finalResult = addNums(4,10) + 100;
        System.out.println(finalResult);

        System.out.println(fullName("Georage", "The Man"));

        System.out.println(showChar('B'));

        String bio = showBio("Georage", "I Was born in Nebraska", 75);
        System.out.println(bio);
        
    }

    //숫자로리턴 
    //            void대신 int를 씀으로써 값을 return 해서 넣어줌
    public static int addNums(int A, int B){
        int result;
        result = A + B;
        return result; //(a + b)
    }

    //문자로리턴
    public static String fullName(String firstName, String lastName){
        return firstName +" "+ lastName;
    }
    
    //char
    public static char showChar(char c){
        return c;
    }

    //여러가지 타입으로 리턴
    public static String showBio(String name, String bio, int age){

        return "My name is "
                + name + "and I am " + age + "years old. "
                +bio;
    }
}