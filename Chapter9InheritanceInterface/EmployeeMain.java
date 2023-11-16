public class EmployeeMain {
    public static void main(String[] args) {
        System.out.print("Employeee: ");
        Employee sanjay=new Employee();
        System.out.print(sanjay.getHours() + " ");
        System.out.print(sanjay.getSalary() + " ");
        System.out.print(sanjay.getVacationDays()+ " " );
        System.out.println(sanjay.getVacationForm());

        System.out.print("Secretary ");
        Secretary shravanthi= new Secretary();
        System.out.print(shravanthi.getVacationDays()+ " ");
        shravanthi.takeDictation(" It is a method for taking dictations");

        //Lawyer object creation

        System.out.print("Lawyer :");
        Lawyer Mike= new Lawyer();
        System.out.print(Mike.getVacationDays()+ " ");
        System.out.print(Mike.getVacationForm()+ " ");
        Mike.sue();


        }
    
}
