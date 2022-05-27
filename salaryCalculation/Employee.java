public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHouse, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHouse;
        this.hireYear = hireYear;
    }
    double tax(){
        if(this.salary < 1000){
            return 0.0;
        }
        else {
            return (this.salary / 100*3.0);
        }
    }
    double bonus() {
        if(this.workHours > 40) {
            return ((this.workHours - 40) * 30);
        }
        else {
            return 0.0;
        }
    }
    double raiseSalary() {
        int currentYear = 2021;
        if(currentYear - hireYear >19) {
            return (this.salary / 100 * 15);
        }
        else if (currentYear - hireYear > 9) {
            return (this.salary / 100 * 10);
        }
        else {
            return (this.salary / 100 * 5) ;
        }
    }
    
    public String toString() {
    double salaryWithTaxAndBonus = this.salary + bonus() - tax();
    double totalSalary = salaryWithTaxAndBonus + raiseSalary();
    return "Adı: " + name + "\n" + "Maaşı: " + salary + "\n" + "Çalışma Saati: " + workHours + "\n" + "Başlangıç Yılı: " + hireYear + "\n" + "Vergi: " + tax() + "\n" + "Bonus: " + bonus() + "\n" + "Maaş Artışı: " + raiseSalary() + "\n" + "Vergi ve Bonuslar ile birlikte maaş: " + salaryWithTaxAndBonus + "\n" + "Toplam Maaş: " + totalSalary;
  }
    
    
    
}
