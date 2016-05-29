// Day 13: Abstract Classes

//Write MyBook Class
class MyBook extends Book{
    int price=0;
   MyBook(String title, String author, int price)
       {
       super(title,author);
       this.price = price;
   }
    
    void display(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}  
