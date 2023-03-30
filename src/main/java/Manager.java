public class Manager extends BaseManager {

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalaryManager(){
        if(getNumberOfSubordinates() ==0){
            return getBaseSalary();
        } else {
            return (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        }
    }

    // adding a new method getSalary to practice Polymorphism;
    @Override
    public int getSalary(){
        return (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3));
    }
}
