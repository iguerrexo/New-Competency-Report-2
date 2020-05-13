public class Animal {

    public String name;
    public String type;
    
    public Animal(String name, String type){
        this.name=name;
        this.type=type;
    }

    public void printAnimal(){
       System.out.println(this.name); 
       System.out.println(this.type);
    }   
       public void attacks (User user){
        System.out.println(this.name+ " " + this.type + "attacks" + user.name);
    }
    
}