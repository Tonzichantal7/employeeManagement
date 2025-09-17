public class Programmer {
    Double workHours;
    Double hourlyRate;
    Double totalSalary;
    @Override
    void calculateSalary(){
         totalSalary=workHours*hourlyRate;
    };
    void displayInfo(){
        System.out.println("name");
    }

}
