public class Person {
    enum Discipline {
        ARCHEOLOGY, BIOLOGY, COMPUTER_SCIENCE
    }

    // This array of Strings is used to print the enumerated type in string form.
    final static String[] dName = {"Archeology", "Biology", "Computer Science"};

    private String name;

    //No-Arg Constructor
    public Person()
    {
        System.out.println("The Person class No-arg Constructor is running");
        name = "";
    }

    //Constructor with parameters
    public Person(String pName)
    {
        System.out.println("The Person class 1-parameter Constructor is running");
        name = pName;
    }

    //setters
    public void setName(String pName)
    {
        name = pName;
    }

    //getters
    public String getName()
    {
        return name;
    }
}
