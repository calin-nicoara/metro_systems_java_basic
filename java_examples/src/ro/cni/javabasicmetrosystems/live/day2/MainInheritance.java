package ro.cni.javabasicmetrosystems.live.day2;

import ro.cni.javabasicmetrosystems.live.day2.person.Person;

public class MainInheritance extends Object{
    public static void main(String[] args) {
//        Personv2 person = new Personv2("Ion", "1231231", "Bucuresti");

        Employee employee = new Employee("Ion", "1231231", "Bucuresti",
                10.0, 21);


//        Personv2 person1 = employee;
//
//        if(person1 instanceof Employee) {
//            Employee employee2 = (Employee) person1;
//        }
//
//        person1.getCNP();
//        person1.setNume("Popica");
//
//        System.out.println(employee.getNume());
//
//
//        employee.getSalariu();
//
//        employee.getNume();

//        employee.showSuperName();

//        System.out.println(person.getNume());
//        System.out.println(employee.getNume());

        Person person1 = employee;

        System.out.println(person1.getNume());

        System.out.println(person1.getDailySchedule());

        wakeUp(employee);

    }

    public static void wakeUp(Person person) {

    }
}
