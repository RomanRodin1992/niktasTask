public class Student {
    String name;
    int age;
    private Group group;

    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;

    }

    public String getName() {
        return this.name;
    }

    public void setGroup(Group group) {
            this.group = group;
    }

}
