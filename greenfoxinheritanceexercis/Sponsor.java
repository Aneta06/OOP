package greenfoxinheritanceexercis;

public class Sponsor extends Person {

    private String company;
    private int hiredStudents;


    public Sponsor(){
        company = "to Google";
        hiredStudents = 0;


    }

    public Sponsor(String nameOfperson, int ageOfperson, String genderOfperson, String company){
        super(nameOfperson, ageOfperson, genderOfperson);
        this.company = company;
        hiredStudents = 0;
    }

    @Override
    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");

    }
    @Override
    public  void introduce(){
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire(){
        hiredStudents += 1;
    }
}
