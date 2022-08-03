public class Item{
    private String name ;
    private double price;
    private int quantity;


    public Item(String name,double price,int quantity){
        if(price < 0){
            throw new IllegalArgumentException("the name of the item cannot be negative");
        }
        if(name == null || name == " "){
            throw new IllegalArgumentException("the name of the item cannot be negative");
        }
        if(quantity < 0){
            throw new IllegalArgumentException("the quantity cannot be negative");
        }
        this.name = name ;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(Item source){
        
        this.name = source.name ;
        this.price = source.price;
        this.quantity = source.quantity;
    }

    public String getName(){
        return this.name;

    }
    public double getprice(){
        if(price < 0){
            throw new IllegalArgumentException("the prce of the item cannot be negative");
        }
        return this.price;
    }
    public int getQuantity(){
        return this.quantity = quantity;
    }

    public void setName(String name){
        if(name == null || name == " "){
            throw new IllegalArgumentException("the name of the item cannot be negative");
        }
        this.name = name ;
    }
    public void setPrice(double price){
        if(price < 0){
            throw new IllegalArgumentException("the prce of the item cannot be negative");
        }
        this.price = price;
    }
    public void setQuantity(int quantity){
        if(quantity < 0){
            throw new IllegalArgumentException("the quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    public String toString(){
        return this.name+" :"+"\t"+ this.price +" "+ this.quantity;
    }





}

