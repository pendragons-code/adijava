public class Machine{
    Item[][] items = new Item[3][3];

    public Machine(Item[][] items){
        for(int i = 0 ; i <items.length ; i ++) {
            for (int j = 0 ; j<items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }


    public  Item  getItem(int row,int spot){
        
                return new Item(items[row][spot]);
       

    }

    public void setItem(Item item , int row , int spot){
       
            this.items[row][spot]= new Item(item);


    }
   


    public boolean dispense(int row , int spot){
       if(items[row][spot].getQuantity() == 0){
        throw new IllegalArgumentException("The quantity can never be zero");
       }
       
       if(this.items[row][spot].getQuantity() > 0){
        this.items[row][spot].setQuantity(items[row][spot].getQuantity()-1);
        return true;
       } return false;



       }
       public int getLength(){
        return this.items.length;
       }
       public int getRowLength(){
        return this.items[0].length;
       }
       










       public String toString(){
        String temp = "";
        for (int i = 0; i < items.length; i++) {
            temp += "\t";
            for (int j = 0; j < items[i].length; j++) {
                temp += items[i][j].toString() + " ";
            }
            temp += "\n\n";
        }
        temp += "\t************************************************";
        return temp;
    }




        
    }
        
    

  


    
    











