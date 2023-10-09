package greenfoxinheritanceexercis;

public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;


    public Student() {
        previousOrganization = "The School of Life";
        skippedDays = 0;

    }
        public Student(String nameOfperson, int ageOfperson, String genderOfperson, String previousOrganization1){
        super(nameOfperson, ageOfperson, genderOfperson);
        previousOrganization = previousOrganization1;
        skippedDays = 0;

        }
    @Override
    public void getGoal(){
        System.out.println("Be a junior software developer.");

    }
    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + getName()+ ", a " +getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays){
        skippedDays = skippedDays + numberOfDays;


    }


}
