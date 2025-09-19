abstract class Employee {
    public String name;
    public  int phoneNumber;
    public String EmailAddress;
    public Employee(){
        name="chantal";
        phoneNumber=7888987;
        EmailAddress="chantal@gmail.com";
    }
    abstract void calculateSalary();
    abstract void displayInfo();
}
