public class Oops3StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName= "pnhs";
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);

    }
}

class Student{
    int rollNO;
    String name;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
