abstract class Manager extends Employee {
    Double baseSalary;
    Double bonus;
    Double TatalSalary;
    Manager(Double baseSalary, Double bonus) throws Exception{
        super();
        if(baseSalary<0 || bonus<0){
            throw new Exception("base salary and bonus should be positive");
        }
        this.baseSalary=baseSalary;
        this.bonus=bonus;
    }

    @Override
    void calculateSalary() {
        TatalSalary = baseSalary + bonus;

    }
    void displayInfo(){
        System.out.println(" name: " + name + " phoneNumber: " + phoneNumber + " email address: " + EmailAddress + " base salary: " + baseSalary + " bonus: " + bonus + " totalSalary: " + TatalSalary);
}




}
