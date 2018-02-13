package Lab4Start;

/**
 * Name: Jaime Ortiz-Chavez
 * Date: 2/13/2018
 *
 * Sources:
 * Inheritance.zip
 * Lab-4 Video
 *
 * Description:
 * Represents a Faculty Employee's information such as their name and salary
 * but it also adds there courses. It extends employee but also still implements rules.
 *
 * Algorithm:
 * Faculty extends Employee.
 * Make a new variable called courses the is an array that holds strings.
 * Make constructor that has three parameters.
 * Make a getter for getCourses and getCoursenames.
 * Make a mutator for the field courses that allows people to add courses.
 * Lastly a toString to output the Faculty's information.
 *
 * Lab: 4
 * Spring 2018
 * CSIT 150
 *
 * @author Jaime Ortiz-Chavez
 */
public class Faculty extends Employee {

    //added a variable
    private String[] courses;

    /**
     * A constructor for Faculty
     *
     * @param name
     * @param salary
     * @param courses
     */
    public Faculty(String name, int salary, String[] courses) {
        super(name, salary);
        this.courses = new String[courses.length];
        for (int counter = 0; counter < courses.length; counter++) {
            this.courses[counter] = courses[counter];
        }
    }

    /**
     * @return an array of the courses
     */
    public String[] getCourses() {
        {
            String[] temp = new String[courses.length];
            for (int i = 0; i < courses.length; i++)
                temp[i] = new String(courses[i]);
            return temp;
        }
    }

    /**
     * @return a string of all the courses in the object formatted
     */
    public String getCoursesNames() {
        String courseNames = "";

        for (int counter = 0; counter < courses.length; counter++) {
            courseNames += courses[counter] + ", ";
        }
        courseNames += "\b\b";
        return courseNames;
    }

    /**
     * If the course is null it will double the size
     * Otherwise it will create a new array with both courses size
     * and store both in that array then back to the object array
     *
     * @param courses
     */
    public void setCourses(String[] courses) {

        if (this.courses == null) {
            this.courses = new String[2]; //double the size from 0 to 2
            for (int i = 0; i < 2; i++)
                this.courses[i] = new String();
        } else {
            String[] temp = new String[this.courses.length + courses.length];

            for (int c = 0; c < this.courses.length; c++)
                temp[c] = this.courses[c];

            for (int c = this.courses.length; c < temp.length; c++)
                temp[c] = courses[c - this.courses.length];

            this.courses = temp;
        }
    }


    /**
     * @return a string of the faculty members's information
     */
    @Override
    public String toString() {

        return "Employee: " + super.getName() + "\nCourses: " + getCoursesNames();
    }
}

