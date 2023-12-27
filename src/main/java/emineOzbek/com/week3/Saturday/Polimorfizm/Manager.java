package emineOzbek.com.week3.Saturday.Polimorfizm;

public class Manager extends Employee{

    int maasKatsayisi= 1500;

    @Override
    public int calculateSalary() {
        int managerSalary = maasKatsayisi* getTotalYearsWorked();
        return  managerSalary;
    }
}
