public class Main {
    public static void main(String[] args) {
        Person Vika = new Person("Leesenko", "Vika", "Dmitrievna", "Ryazan", "higher", 1980);
        Person Anton = new Person("Binet", "Anton", "Dmitriev", "Ryazan", "higher", 1979);
        Person Artem = new Person("Niter", "Artem", "Dmitriev", "Ryazan", "average", 1958);
        Person Danya = new Person("Lettern", "Danya", "Dmitriev", "Ryazan", "average", 1978);
        Person [] student  = {Vika, Anton, Artem, Danya};
        int targetAge = 30;
        System.out.println("Граждане с возрастом выше " + targetAge);
        for(Person person : student){
            if(2024 - person.Date > targetAge){
                System.out.println(person.last_name+ " " +person.first_name+ " " +person.patronymic);
            }
        }
        System.out.println("Граждане с высшим образованием:");
        for(Person person : student){
            if(person.education == "higher"){
                System.out.println(person.last_name+ " " +person.first_name+ " " +person.patronymic);
            }
        }
    }
}
class Person {
    public String last_name;
    public String first_name;
    public String patronymic;
    public String address;
    public String education;
    public int Date;

    public Person(String last_name, String first_name, String patronymic, String address, String education, int Date) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.patronymic = patronymic;
        this.address = address;
        this.education = education;
        this.Date = Date;
    }
}