//Person_Employess에서 사용할 수 있게 extends

public class Person_Manager extends Person_Employee{
    

    @Override // =>Person_Employee 로 확장한 Person_Manager를 오버라이드함 => Person_use에서 사용한 Person_Manager의 값이 변화
    public double getAnnualSalary() {
        return super.getAnnualSalary() + 10000; //super를 통해 오버라이드
    }


    @Override //String의 형태로 출력 => toString (이건 자바안에 있는 자바클래스 => object클래스 가장 상위)
    public String toString() {
        return this.getFirstName() + ", "
                + this.getId() + ", "
                + this.getAnnualSalary();
    }

}