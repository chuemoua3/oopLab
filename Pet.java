

public class Pet{
    public static void main(String[] args){
        Pet pet1 = new Pet();
        pet1.setName("Jaxx");
        pet1.setAge(2);
        pet1.setLocation("Charlotte");
        pet1.setType("Maltipoo");
        System.out.println(pet1.getName());
        System.out.println(pet1.getAge());
        System.out.println(pet1.getLocation());
        System.out.println(pet1.getType());


        Pet pet2 = new Pet("\nAddole", 6, "Charlotte", "Boxer");
        System.out.println(pet2.getName());
        System.out.println(pet2.getAge());
        System.out.println(pet2.getLocation());
        System.out.println(pet2.getType());

    }

    private String name, location, type;
    private int age;

    //creating two constructors
    //one empty and one with all attributes
    Pet(){
        this.name = "Harry";
        this.age = 3;
        this.location = "NC";
        this.type = "Dog";
    }
    Pet(String name, int age, String location, String type){
        this.name =  name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getLocation(){
        return location;
    }
    public String getType(){
        return type;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setType (String type){
        this.type = type;
    }
}