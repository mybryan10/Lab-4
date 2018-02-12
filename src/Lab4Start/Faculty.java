package Lab4Start;

public class Faculty extends Employee {

    private String[] courses;

    public Faculty(String name, int salary, String[] courses) {
        super(name, salary);
        this.courses = new String[courses.length];
        for (int counter = 0; counter < courses.length; counter++) {
            this.courses[counter] = courses[counter];
        }
    }

    public String[] getCourses() {
        {
            String[] temp = new String[courses.length];
            for (int i = 0; i < courses.length; i++)
                temp[i] = new String(courses[i]);
            return temp;
        }
    }

    public String getCoursesNames() {
        String courseNames = "";

        for (int counter = 0; counter < courses.length; counter++) {
            courseNames += courses[counter] + ", ";
        }
        courseNames += "\b\b";
        return courseNames;
    }

    public void setCourses(String[] courses) {

        if (this.courses == null) {
            this.courses = new String[2]; //double the size from 0 to 2
            for (int i = 0; i<2; i++)
                this.courses[i] = new String();
        }
        else {
            String[] temp = new String[this.courses.length + courses.length];

            for (int c = 0; c < this.courses.length; c++)
                temp[c] = this.courses[c];

            for (int c = this.courses.length; c < temp.length; c++)
                temp[c] = courses[c - this.courses.length];

            this.courses = temp;
        }
    }


    @Override
    public String toString() {

        return "Employee: " + super.getName() + "\nCourses: " + getCoursesNames();
    }
}

