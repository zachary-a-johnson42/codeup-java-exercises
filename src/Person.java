
public class Person {
    //Assigning variables to be initialized..
    private String name;
    public String cohort;

    //Overloading? Person constructor can be made with a name argument
    public Person(String name){
        this.name = name;
        this.cohort = "Unassigned";
    }

    //Getting the hang of overloading. This time, 2 arguments, for name and cohort.
    public Person(String name, String cohort){
        this.name = name;
        this.cohort = cohort;
    }

    // A public method that can show name. READ ONLY.
    public String getName(){
        return this.name;
    }


    // A public method to change name attribute of person, even though name is private.
    public void setName(String name){
        //The reason we use "this" is because it'll self reference what "Person" instance is called or active?
        //Is instantiated the word here?
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello, %s%n", this.name);
    }

    public static void main(String[] args) {

        Person zach = new Person("zach");
        // "Hello, zach" expected.
        zach.sayHello();
        zach.setName("broly");
        //"Hello, broly" expected
        zach.sayHello();


    }
}
