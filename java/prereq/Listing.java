package prereq;

public class Listing {
   // These are examples properties
   private String title;
   private double price;

   // TODO: Add more properties
   private String description;
   private String category;

   // TODO: Add your setter/getter here
   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getCategory(String category) {
      return category;
   }
   
   public void setCategory(String category) {
      this.category = category;
   }

   public void printInfo() {
      // TODO: Complete this to print out the information of the Listing
      System.out.println("Item: " + title);
      System.out.println("\tPrice: " + price);
      System.out.println("\t\tDescription: " + description);
      System.out.println("\t\t\tCategory: " + category);
   }
}