public class casting {
    public static void main(String[] args) {

        //더하기 빼기 곱하기 나누기 ( + , - , * , / )
        int a = 12;
        int b = 12;

        int total = b + a;
        
        System.out.println("total is " + total);
        System.out.println(10 + total);

        int c = 12;
        double d = 12;

        int mod = (int) (d/c); //casting => double과 int의 계산에서 int로 확실하게 변환해줌
        System.out.println(mod);

    }
}