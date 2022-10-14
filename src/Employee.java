public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    double tax() {

        if (this.salary > 1000) {
            double salaryTax = (this.salary * 0.03);
            return salaryTax;
        } else {
            return 0;
        }
    }

    int bonus() {

        if (workHours - 40 > 0) {
            int extraHours = (workHours - 40) * 30;
            return extraHours;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        int workingYears =  2021 - this.hireYear;
        double extra;
        if (workingYears < 10) {
            extra = (this.salary) * 0.05;
            return extra;
        } else if (workingYears > 9 && workingYears < 20) {
            extra = (this.salary) * 0.1;
            return extra;
        } else if (workingYears > 19) {
            extra = (this.salary) * 0.15;
            return extra;
        } else {
            return 0;
        }

    }

    public String toString() {
        double total = salary - tax() + bonus() + raiseSalary();
        double taxAdded = salary + bonus() - tax();

        System.out.println("Ad: " + this.name);
        System.out.println("Maaş: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxAdded);
        System.out.println("Toplam Maaş: " + total);

        return null;
    }
}
