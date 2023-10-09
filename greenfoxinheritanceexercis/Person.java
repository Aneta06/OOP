package greenfoxinheritanceexercis;

public class Person {

//Create a Person class with the following fields:
//
//name: the name of the person
//age: the age of the person (whole number)
//gender: the gender of the person (male / female)

  private String name;
  private int age;



    private String gender;

//Person(name, age, gender)
//Person(): sets name to Jane Doe, age to 30, gender to female

    public Person(){

        name = "Jane Doe";
        age = 30;
        gender = "female";

    }
    public Person(String nameOfperson, int ageOfperson, String genderOfperson){
        this.name = nameOfperson;
        this.age = ageOfperson;
        this.gender = genderOfperson;


    }

    //getGoal(): prints "My goal is: Live for the moment!"
    //introduce(): prints "Hi, I'm name, a age year old gender."

    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");

    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }

    public String getName(){
        return name;

    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

//    public void int setAge(int newAge){
//       this.age = newAge;
//    }

}
