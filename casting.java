public class casting {
    public static void main(String[] args) {

        int c = 12;
        double d = 12;

        int mod = (int) (d/c); //casting => double과 int의 계산에서 int로 확실하게 변환해줌
        System.out.println(mod);

    }
}