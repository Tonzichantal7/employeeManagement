//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Programmer programmer = new Programmer(10.2, 10);
            programmer.displayInfo();
            programmer.calculateSalary();
            System.out.println("Total salary: " + programmer.totalSalary);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }


    }
}