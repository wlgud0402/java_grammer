public class types {

    public static void main(String[] args) {

        //Variable == bucket in memory
        int age = 23;
        long longage =343423434;   // 더 큰 숫자를 저장하고 싶다면 long을 사용함
        byte b = 127; // +-127까지 표현가능
        short s = 356; // 2x byte

        float pi = 3.14f;   //float를 java에서 사용할때는 숫자의 뒤에 f를 붙임
        double pid = 3.14;   //float보다 큰 소숫점숫자 => double을 사용하면 뒤에 d나 다른걸 붙이지 않아도됨

        String name = "Georgina"; //안에 글자가 몇개든 가능!
        char a = 'a';  //작은따옴표, 한글자만 들어갈 수 있다.

        //boolean => true or false, 1, 0
        boolean isTrue = true;
        System.out.println(isTrue);

        boolean isfalse; //꼭한줄로 정의할 필요는 없다.
        isfalse = false;
        System.out.println(isfalse);

        System.out.println(name);
        System.out.println(age);
        //System.out.println("Hey I am a programer.");
        System.out.println("My name is " + name + " and I'm " + age + " years old."); //concat => 문자와 숫자를 합하여 사용

        System.out.println("longage:"+longage + "byte:b:"+b + "short:s:"+s + "float:pi:"+pi + "double:pid:"+pid+"char:a:"+a);

    }

}
