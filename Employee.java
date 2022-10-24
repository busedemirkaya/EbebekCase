public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){

        if (this.salary < 1000){
            return salary;
        }else {
            double tax = salary * 0.03;
            return tax;
        }
    }
    public int bonus(){
        if (workHours > 40){
            int bonus = (workHours - 40)*30;
            return bonus;
        }
        return 0;
    }
    public double raiseSalary(){

        if (hireYear<=0 || hireYear>2021){
            System.out.println("Yanlış değer girdiniz. Lütfen tekrar deneyin.");

        }else {
            int dYear = 2021 - hireYear;
            double raise;

            if (dYear>0 && dYear <10){
                raise =  salary * 0.05;
                return raise;
            }else if (dYear>9 && dYear<20){
                raise = salary * 0.1;
                return raise;
            }else if (dYear>19){
                raise = salary * 0.15;
                return  raise;
            }else if (dYear == 0){
                return 0;
            }
        }

        return 0;
    }


    public String toString(){

        double total = salary + bonus() - tax();
        double overall = salary - tax() + bonus() + raiseSalary();
        System.out.println("Adı : "+ name);
        System.out.println("Maaşı : "+ salary);
        System.out.println("Çalışma Saati : "+ workHours);
        System.out.println("Başlangıç Yılı : "+ hireYear);
        System.out.println("Vergi : "+ tax());
        System.out.println("Bonus : "+ bonus());
        System.out.println("Maaş artışı : "+ raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş : "+ total);
        System.out.println("Toplam Maaş : "+ overall);


        return null;
    }
}
