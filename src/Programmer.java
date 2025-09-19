public class Programmer extends Employee {
    Double workHours;
    int hourlyRate;
    Double totalSalary;
    Programmer(Double workHours, int hourlyRate) throws Exception{
        super();
        if(workHours < 0 || hourlyRate<0){
            throw new Exception("work hours and hourly rate should be positive");g
        }

        this.workHours=workHours;
        this.hourlyRate=hourlyRate;
    }
    @Override
    void calculateSalary(){
         totalSalary=workHours*hourlyRate;
    };
    void displayInfo(){
        System.out.println("name " + name + "\n" +" phone number " + phoneNumber + "\n"+" email address: " + EmailAddress + "\n"+" tatalSalary: "+ totalSalary + "\n"+" work hours: " + workHours + " hourly rate: " + hourlyRate);
    }

}
