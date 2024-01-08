public class Teacher extends Person {
    String subject;
    String school;

    public Teacher(String name, String subject, String school) {
        super(name);
        this.subject = subject;
        this.school = school;
    }

    @Override
    void describeRole() {
        System.out.println(getName() + " is a teacher that teaches " + subject +
                ", and is associated with " + school + " school.");
    }

}
