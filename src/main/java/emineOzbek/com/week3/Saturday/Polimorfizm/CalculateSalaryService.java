package emineOzbek.com.week3.Saturday.Polimorfizm;

public class CalculateSalaryService {

    public void calculateSalary(Employee employee){
        employee.setTotalYearsWorked(4);
        int salary = employee.calculateSalary();
        System.out.println("Employee'nin maaşı: " + salary);
    }
}
