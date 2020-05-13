public class Example{

    public static void main (String[] args) {

        //two users
        
        User Shay = new User("Shay",200);

        User Sam = new User ("Sam", 22);

        //display the object
        
        Shay.printUser(); // display user 1
        Sam.printUser(); // display user 2

    Student Christian = new Student ("Christian" ,30,9);
    Student Unknown = new Student ("x", 1,9);

    Christian.printUser();
    Unknown.printUser();

    //animal
    Animal shark = new Animal ("Baby","shark");
    Animal zebra = new Animal ("happy","Zebra");


    shark.printAnimal();
    zebra.printAnimal();

    shark.attacks (Sam);
    shark.attacks (Shay);
    }
}