package practice07;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age,Klass klass) {
        super(name, age);
        this.klass = klass;
    }

//    public int getKlass() {
//        return klass;
//    }


    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce(){

        return  super.introduce()+" I am a Student. I am at Class "+klass.getNumber()+".";

    }
}
