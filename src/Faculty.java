public class Faculty extends Person {
    private Discipline department;

    //No-Arg Constructor
    public Faculty() {
        //super();			//super() must be the first statement of the subclass Constructor
        System.out.println("The Faculty class No-arg Constructor is running");
    }

    //2-parameter Constructor
    public Faculty(String pName, Discipline d) {
        //super();			//calls the NoArg Superclass Constructor
        //super(pName);		//calls the 1-parameter Superclass Constructor
        System.out.println("The Faculty class 2-parameter Constructor is running");
        setName(pName);		//not needed if the Superclass 1-parameter constructor is called
        department = d;
    }

    //setters
    public void setDepartment(Discipline d)
    {
        department = d;
    }

    //getters
    public Discipline getDepartment( )
    {
        return department;
    }

    //toString() method - uses String static method .format()
    public String toString() {
        String str = String.format("Professor %s teaches in the Department of %s",
                getName(),
                dName[department.ordinal()]
        );
        return str;
    }
}
