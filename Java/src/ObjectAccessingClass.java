class Person{
    String name,country;
    Person(String name,String country){
        this.name=name;
        this.country=country;
    }

    void greet(){
        if(this.country=="India"){
            System.out.println("Namaste "+this.country);
        }
        else{
            System.out.println("Hello "+this.country);
        }
    }
}
public class ObjectAccessingClass {
    public static void main(String args[]) {
        Person p = new Person("Likhith", "India");
    }
}
