public class Cars {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.setModel("NSX");
        car1.setBrand("Acura");
        car1.setType("Sport");
        car1.setPrice(50000);
        System.out.println(car1.getModel());
        System.out.println(car1.getBrand());
        System.out.println(car1.getType());
        System.out.println(car1.getPrice());

        
    }
    private String model, brand, type;
    private int price;

    //empty attribute
    Cars(){
        this.model = "Civic";
        this.brand = "Honda";
        this.type = "Economy";
    }
    Cars(String model, String brand, String type, int price){
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.price = price;
    }
    public String getModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public String getType(){
        return type;
    }
    public int getPrice(){
        return price;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPrice(int price){
        this.price = price;
    }

}