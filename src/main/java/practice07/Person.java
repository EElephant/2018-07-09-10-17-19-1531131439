package practice07;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age =age;
    }

    public String basicIntroduce(){
        return  "My name is "+getName()+". I am "+getAge()+" years old.";
    }

    public String introduce(){
        return basicIntroduce();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
