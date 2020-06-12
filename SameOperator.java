public class SameOperator {
    public static void main(String[] args){
        Integer a1 = 3;

        Integer a2 = 3;
  
        Integer a3 = 3000;
  
        Integer a4 = 3000;


        if (a1.intValue() == a2.intValue()) {

            System.out.println("a1 == a2");
   
         }
   
         if (a3.intValue() == a4.intValue()) {
   
            System.out.println("a3 == a4");
   
         }


    }
}