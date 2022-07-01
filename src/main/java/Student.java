public class Student {
    private String name;
    private int age;
    private Group group;

    public  Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;

    }

        public String getName () {
            return this.name;
        }
        public void setGroup (Group group){
            this.group =  group;
        }

    }
