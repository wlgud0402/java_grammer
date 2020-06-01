public class Person_Employee extends Person { //extends로 다른곳에서 사용할수 있게함
    private int id;
    private double annualSalary;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
