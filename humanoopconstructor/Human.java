package humanoopconstructor;

public class Human {

    //constructor, kdyz tam vlozim promenny musim je mit i v mainu, presne podle poctu
    // co mam v konstruktoru, muzu si udelat vic konstruktoru i treba prazdnej viz pr.:
    //public Human(String gender), public Human(){

    String name;
    int age;
    double weight;


    // this. mi odkazuje na promennou nahore a vklada mi hodnoty do promennych v zavorce
    public Human(String name1, int age1, double weight1) {

        this.name = name1;
        this.age = age1;
        this.weight = weight1;


    }


    // fce, ktera rika co ten human dela a pouziju to name shora
    public void eat() {

        System.out.println(this.name + " is eating"); //


    }

    public void drink(){

        System.out.println(this.name + " drinks too much!!!");
    }


}
