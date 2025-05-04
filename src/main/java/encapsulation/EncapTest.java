package encapsulation;

public class EncapTest {

    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.name="Sohel";
//        p1.age=34;
//        p1.display

        p1.setName("Sohel");
        System.out.println(p1.getName());
         p1.setAge(34+2);
        System.out.println(p1.getAge());

    }
}
