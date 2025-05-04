package encapsulation;

public class Person {

//    String name;
//    int age;
    private String name;
    private int age;
    

//    void display() {
//        System.out.println("name is :" + name);
//        System.out.println("age is :" + age);
//
//    }
    public void setName(String name) {
        this.name = name;  //use this for params & variable is same word
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

}
