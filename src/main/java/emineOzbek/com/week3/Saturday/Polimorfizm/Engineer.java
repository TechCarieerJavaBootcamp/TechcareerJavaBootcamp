package emineOzbek.com.week3.Saturday.Polimorfizm;

public class Engineer extends Employee {

    private int maasKatsayisi;

    @Override
    public int calculateSalary() {
        int employeeSalary = super.calculateSalary();
        employeeSalary = employeeSalary + (employeeSalary * 30 / 100);
        return employeeSalary;
    }

}
