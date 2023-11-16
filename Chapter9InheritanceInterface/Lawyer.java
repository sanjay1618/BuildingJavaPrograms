public class Lawyer extends Employee{
    //overrides getVacationDays method from the Employee class to make changes to the method.
    @Override
    public int getVacationDays(){
        return 15;
    }
    //overrides the getSalary method from the Employee class
    @Override
    public double getSalary(){
        return super.getSalary() +5000;

    }
    //overrides getVacationForm from the Employee class.
    @Override
    public String getVacationForm(){
        return "pink";
    }
    // this is Lawyer's added behaviour that is not part of the Employee Class.
    public void sue(){
        System.out.println("I will see you in court!");
    }
    
}
