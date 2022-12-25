/*
 * Assignment-2 (Variable and Data type)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: assign the following data in main method
101,iphone15,1895 euros,perfect product with best image quality, phone,
* step 5: print the data
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anisulsir;

/**
 *
 * @author MD NIROB KHAN
 */
public class Product {
    private String title;  // Data member
    private int id;
    private String description;
    private String category;
    private String price;
    public Product(){
        category = "phone";
        id = 101;
        description = " perfect product with best image quality";
        title ="iphone15";
        price = "1895 euros";
    }
    // Getter Methods : Retrieve the Values 
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public String getCategory(){
        return category;
    }
    public String getPrice (){
        return price;
    }
    
    // Settet Methods : Assign / alter the values 
    public void setTitle (String title){
        this.title = title;
    }
    public void setDescription (String description){
        this.description = description;
    }
    public void setCategory (String category){
        this.category = category;
        
    }
    public void setPrice(String price){
        this.price = price;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anisulsir;

/**
 *
 * @author MD NIROB KHAN
 */
public class AnisulSir {

    public static void main(String[] args) {
     
       Product ass2 = new Product();
       System.out.println("ID : " + ass2.getId());
       System.out.println("Title : " + ass2.getTitle());
       System.out.println("Price : " + ass2.getPrice());
       System.out.println("Description : " + ass2.getDescription());
       System.out.println("Category : " + ass2.getCategory());
       
     
     
       
    }
    
}




