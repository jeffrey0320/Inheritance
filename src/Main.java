public class Main {
    public static void main(String[] args) {
        // Create a Faculty object.
        System.out.println("Creating Faculty object");
        Faculty prof = new Faculty();	//uses the default constructors

        // Use a Person method.
        prof.setName("Indiana Jones");

        // Use a Faculty method.
        prof.setDepartment(Person.Discipline.ARCHEOLOGY);

        System.out.println();							//skip a line

        //Print prof's info
        System.out.print("Professor " +  prof.getName()
                + " teaches in the Department of ");

        // Get department as an enumerated type.
        Person.Discipline dept = prof.getDepartment();

        // Print out the department in string form.
        System.out.println(Person.dName[dept.ordinal()]);
        //System.out.println(dept);

        System.out.println();							//skip a line

        //Print prof's info
        System.out.println(prof);						//uses Faculty .toString() method
    }
}
