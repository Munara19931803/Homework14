public class Main {
    public static void main(String[] args) {
        Person person = new Person("Filip", "learn");
        Dancer dancer = new Dancer("Seitek", "dancer", "Bachata");
        Programmer programmer = new Programmer("Asan", "coding", "GOOGLE");
        Singer singer = new Singer("Filip", "singing", "Gorod 312");

        person.eat();
        person.walk();
        person.learn();
        System.out.println("____________");
        dancer.eat();
        dancer.walk();
        dancer.learn();
        dancer.dancing();
        System.out.println("_____________");
        programmer.eat();
        programmer.walk();
        programmer.learn();
        programmer.coding();
        System.out.println("________________");
        singer.eat();
        singer.walk();
        singer.learn();
        singer.playGuitar();
        System.out.println("_______________________");

        System.out.println(person);
        System.out.println(dancer);
        System.out.println(programmer);

    }
}