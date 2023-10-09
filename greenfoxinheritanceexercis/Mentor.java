package greenfoxinheritanceexercis;

public class Mentor extends Person {

    private String level;

    public Mentor() {
        level = "intermediate";

    }

    public Mentor(String nameOfperson, int ageOfperson, String genderOfperson, String level1) {
        super(nameOfperson, ageOfperson, genderOfperson);
        level = level1;
    }
    @Override
    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");

    }
    @Override
    public  void introduce(){
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " " + level + " mentor.");
    }
}
