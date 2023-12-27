package emineOzbek.com.week3.Saturday.Polimorfizm;

public abstract class Employee {

    private Long identityNumber;
    private String name;
    private int totalYearsWorked;

    public int calculateSalary() {
        int salary = getTotalYearsWorked() * 100;
        return salary;
    }

    public Long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(Long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalYearsWorked() {
        return totalYearsWorked;
    }

    public void setTotalYearsWorked(int totalYearsWorked) {
        this.totalYearsWorked = totalYearsWorked;
    }
}
