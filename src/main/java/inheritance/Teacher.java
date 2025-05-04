package inheritance;

public class Teacher extends Person {

    //name,age,displayInfo1
    String qualification;

    public void displayInfo2() {
//        System.out.println("Name is :" + name);
//        System.out.println("Age is :" + age);
        displayInfo1();
        System.out.println("Qualification is :" + qualification);

    }

}
