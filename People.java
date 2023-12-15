public class People {
    protected String name;
    protected String lastname;
    protected int age;
    People(){
        name = "none";
        lastname = "none";
        age = 18;
    }
    People(String nameP, String lastnameP, int ageP){
        name = nameP;
        lastname = lastnameP;
        age = ageP;
    }

    @Override
    public String toString() {
        return "People{" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + ", age=" + age + "}";
    }

    void walk(){
        System.out.println(name + " is walking!");
    }
    void voice(){
        System.out.println(name + " is singing!");
    }
    void run(){
        System.out.println(name + " is running!");
    }
}
