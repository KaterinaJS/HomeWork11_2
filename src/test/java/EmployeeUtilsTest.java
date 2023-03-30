import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeUtilsTest {

    @Test
    public void findByName(){
        Employee emp1 = new Employee("Arnold", 10);
        Employee emp2 = new Employee("Phoebe", 20);
        Employee emp3 = new Employee("Helga", 30);
        Employee[] employees = {emp1, emp2, emp3};
        Assert.assertEquals(EmployeeUtils.findByName("Arnold", employees), 0);
    }

    @Test
    public void findBySubName(){
        Employee emp1 = new Employee("Arnold", 10);
        Employee emp2 = new Employee("Phoebe", 20);
        Employee emp3 = new Employee("Helga", 30);
        Employee[] employees = {emp1, emp2, emp3};
        Assert.assertEquals(EmployeeUtils.findBySubName("He", employees), 2);
    }

    @Test
    public void salarySum(){
        Worker wr1 = new Worker("Pete", 10);
        Worker wr2 = new Worker("Tim", 20);
        Worker[] workers = {wr1, wr2};
        Assert.assertEquals(EmployeeUtils.salarySum(workers), 30);
    }

    @Test
    public void findMaxSalary(){
        Worker wr1 = new Worker("Pete", 10);
        Worker wr2 = new Worker("Tim", 20);
        Worker[] workers = {wr1, wr2};
        Assert.assertEquals(EmployeeUtils.findMaxSalary(workers), 20);
    }

    @Test
    public void findMinSalary(){
        Manager man1 = new Manager("Joe", 1000, 100);//3000
        Manager man2 = new Manager("John", 2000, 200);//12000
        Manager man3 = new Manager("Lee", 3000, 300);//27000
        Manager[] managers = {man1, man2, man3};
        Assert.assertEquals(EmployeeUtils.findMinSalary(managers), 3000);
    }

    @Test
    public void findMaxNumberOfSubordinates(){
        Manager man1 = new Manager("Joe", 1000, 100);
        Manager man2 = new Manager("John", 2000, 200);
        Manager man3 = new Manager("Lee", 3000, 300);
        Manager[] managers = {man1, man2, man3};
        Assert.assertEquals(EmployeeUtils.findMaxNumberOfSubordinates(managers), 300);
    }

    @Test
    public void findMinNumberOfSubordinates(){
        Director dir1 = new Director("Chris", 10, 1);
        Director dir2 = new Director("Kyle", 20, 2);
        Director dir3 = new Director("Jasper", 30, 3);
        Director[] directors = {dir1, dir2, dir3};
        Assert.assertEquals(EmployeeUtils.findMinNumberOfSubordinates(directors), 1);
    }

    @Test
    public void findMaxIncrement(){
        Manager man1 = new Manager("Joe", 1000, 100);//3000 - 1000 = 2000
        Manager man2 = new Manager("John", 2000, 200);//12000 - 2000 = 10000
        Manager man3 = new Manager("Lee", 3000, 300);//27000 - 3000 = 24000
        Manager[] managers = {man1, man2, man3};
        Assert.assertEquals(EmployeeUtils.findMaxIncrement(managers), 24000);
    }

    @Test
    public void findMinIncrement(){
        Manager man1 = new Manager("Joe", 1000, 100);//3000 - 1000 = 2000
        Manager man2 = new Manager("John", 2000, 200);//12000 - 2000 = 10000
        Manager man3 = new Manager("Lee", 3000, 300);//27000 - 3000 = 24000
        Manager[] managers = {man1, man2, man3};
        Assert.assertEquals(EmployeeUtils.findMinIncrement(managers), 2000);
    }

    @Test
    public void findSumOfSalaries(){
        Worker wr3 = new Worker("Chandler", 10);
        Manager man4 = new Manager("Monica", 2000, 100);
        Director dir4 = new Director("Ross", 3000, 200);
        Employee[] empExtended = {wr3, man4, dir4};
        Assert.assertEquals(EmployeeUtils.findSumOfSalaries(empExtended), 60010);
    }

}
