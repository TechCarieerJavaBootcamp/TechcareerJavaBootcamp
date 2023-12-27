package emineOzbek.com.week3.Saturday.Polimorfizm;

public class Polimorfizm {
    public static void main(String[] args) {
//
//        System.out.println("Engineer maaşı hesapla.");
//      Engineer engineer = new Engineer();
//        engineer.setTotalYearsWorked(2);
//        int engineerSalary = engineer.calculateSalary();
//        System.out.println(engineerSalary);
//
//
//        System.out.println("Manager maaşı hesapla.");
//        Manager manager = new Manager();
//        manager.setTotalYearsWorked(2);
//        int managerSalary = manager.calculateSalary();
//        System.out.println(managerSalary);


        Employee engineer = new Engineer();
        engineer.setTotalYearsWorked(3);
        Employee manager = new Manager();
        manager.setTotalYearsWorked(4);

        CalculateSalaryService calculateSalaryService = new CalculateSalaryService();
     //   calculateSalaryService.calculateSalary(engineer);
        calculateSalaryService.calculateSalary(manager);


    }
}
