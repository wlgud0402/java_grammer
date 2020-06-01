//Person으로 extends한 모든것들을 사용할수 있으며 원하는 값으로 getter와 setter를 이용해 바꿔서 쓸 수 있다.

public class Person_use {
    public static void main(String[] args) {
        

        Person_Employee Person_Employee = new Person_Employee();

        Person_Employee.setFirstName("James");
        Person_Employee.setLastName("Bond");
        Person_Employee.setAge(47);
        Person_Employee.setId(12356);

        Person_Employee.setAnnualSalary(10000);

        System.out.println(Person_Employee.getId());
        System.out.println(Person_Employee.getAnnualSalary());


        Person_Manager Person_Manager = new Person_Manager();
        Person_Manager.setFirstName("Person_Manager Geroge");
        Person_Manager.setLastName("Kilos");
        Person_Manager.setAge(35);
        Person_Manager.setId(456);
        Person_Manager.setAnnualSalary(45000); //Person_Manager를 오버라이드해서 값이 10000추가 되게했으므로 55000이 출력됨

        System.out.println(Person_Manager.getAnnualSalary() + " , "
        + Person_Manager.getFirstName());


        //object는 가장 상위의 것(클래스,메소드)
        String myString = "Hello there";
        boolean isempty = myString.isEmpty();
        boolean contains = myString.contains("h");

        if(contains){
            System.out.println("Yes contains h");
        }else{
            System.out.println("NO h");
        }

        if (!isempty) {
            System.out.println(myString);
        }else{
            System.out.println("Empty");
        }
    }
}