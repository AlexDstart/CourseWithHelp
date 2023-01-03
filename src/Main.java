public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая по новой");
        Employee[] empl = new Employee[10];
        empl[0] = new Employee("Петров Алексей Михайлович", 1, 18_000);
        empl[1] = new Employee("Никольский Евгений Сергеевич", 2, 55_000);
        empl[2] = new Employee("Дудун Олег Иванович", 3, 65_000);
        empl[3] = new Employee("Петун Олег Сергеевич", 4, 32_000);
        empl[4] = new Employee("Мосейко Виталий Игоревич", 5, 37_000);
        empl[5] = new Employee("Ломакин Петр Иванович", 1, 80_000);
        empl[6] = new Employee("Иванов Иван Иванович", 3, 78_000);
        empl[7] = new Employee("Петров Петр Петрович", 3, 22_000);
        empl[8] = new Employee("Цебулька Андрей Игоревич", 4, 85_000);
        empl[9] = new Employee("Обаянин Михаил Александрович", 5, 95_000);


        System.out.println("Информация о всех сотрудниках: ");
        printAll(empl);
        System.out.println();

        salarySum(empl);
        System.out.println();

        minSalary(empl);
        System.out.println();

        maxSalary(empl);
        System.out.println();

        averageSalary(empl);
        System.out.println();

        for (Employee e: empl) {
            System.out.println(e);
        }
    }



    public static void printAll(Employee[] empl){
        for (int i =0; i< empl.length; i++){
            System.out.println(empl[i]);
        }
    }

    public static int salarySum(Employee[] empl){
        int salarySum = 0;
        for (int i =0; i< empl.length; i++){
            salarySum = salarySum + empl[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляют: " + salarySum);
        return salarySum;
    }

    public static void minSalary(Employee[] empl){
        int minSalary = 20_000;
        String minEmpl = "";
        for (int i =0; i< empl.length; i++){
            if (empl[i].getSalary() < minSalary){
                minSalary = empl[i].getSalary();
                minEmpl = empl[i].getName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minEmpl + " " + minSalary);
    }

    public static void maxSalary(Employee[] empl){
        int maxSalary = 50_000;
        String maxEmpl = "";
        for (int i =0; i< empl.length; i++){
            if (empl[i].getSalary() > maxSalary){
                maxSalary = empl[i].getSalary();
                maxEmpl = empl[i].getName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxEmpl + " " + maxSalary);
    }
    public static void averageSalary(Employee[] empl){
        int averageSalary = 0;
        averageSalary = salarySum(empl)/empl.length;
        System.out.println("Средняя зарплата: " + averageSalary);
    }
}
