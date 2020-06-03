package 알고리즘;

public class MaxNumber {
    static int MaxNum(int a, int b, int c){
        int max =a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;

        return max;

    }
    public static void main(String[] args){
        System.out.println(MaxNum(3, 2, 1));
    }
}