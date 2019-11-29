public class Student extends Person{
    enum Classification {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }

    // This array of Strings is used to print the enumerated type in string form.
    final static String[] cName = {"Freshman", "Sophomore", "Junior", "Senior"};

    private Discipline major;
    private Classification sClass;
    private Person advisor = new Person();

    //No-Arg Constructor
    public Student() {
        //super();			//super() must be the first statement of the subclass Constructor
        System.out.println("The Student class No-arg Constructor is running");
    }

    //4-parameter Constructor
    public Student(String sName, Discipline d, Classification c, String pName) {
        //super();			//calls the NoArg Superclass Constructor
        //super(sName);		//calls the 1-parameter Superclass Constructor
        System.out.println("The Student class 4-parameter Constructor is running");
        setName(sName);		//not needed if the Superclass 1-parameter constructor is called
        major = d;
        sClass = c;
        advisor.setName(pName);
    }

    //setters
    public void setMajor(Discipline d)
    {
        major = d;
    }
    public void setClassification(Classification c)
    {
        sClass = c;
    }
    public void setAdvisor(Person p)
    {
        advisor = p;
    }

    //getters
    public Discipline getMajor()
    {
        return major;
    }
    public Classification getClassification()
    {
        return sClass;
    }
    public Person getAdvisor()
    {
        return advisor;
    }

    //toString() method - uses String static method .format()
    public String toString() {
        String str = String.format("%s is a %s majoring in %s\n%s\'s advisor is %s",
                getName(),
                cName[sClass.ordinal()],
                dName[major.ordinal()],
                getName(),
                advisor.getName()
        );
        return str;
    }
}
