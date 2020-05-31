public class Logical_Operators {
    public static void main(String[] args) {
        /*Logical Operators
          AND => && 둘다 참이여야함
          OR => || 둘중 하나라도 참이여야함
          ! -> ~가 아니다 */

        boolean isAged = true;
        boolean isNotAged = false;
        
        if (isAged && isNotAged){
            System.out.println("both true!!");
        }else{
            System.out.println("one is true or false!!");
        }

        if (isAged || isNotAged){
            System.out.println("both true!!");
        }else{
            System.out.println("one is true or false!!");
        }
    }
}