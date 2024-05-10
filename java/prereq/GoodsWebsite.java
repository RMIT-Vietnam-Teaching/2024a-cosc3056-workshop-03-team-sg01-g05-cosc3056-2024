package prereq;

import java.util.ArrayList;

public class GoodsWebsite {

   public static void main(String[] args) {
      
      // Create a database
      GoodsDatabase database = new GoodsDatabase();

      // TODO: Create three listings, setting the properties,
      //       and add to the database
      Listing item1 = new Listing();
      Listing item2 = new Listing();
      Listing item3 = new Listing();

      item1.setTitle("Title");
      item1.setPrice(1.0);
      item1.setDescription("Description 1");
      item1.setCategory("Category 1");

      item2.setTitle("Title 2");
      item2.setPrice(2.0);
      item2.setDescription("Description 2");
      item2.setCategory("Category 2");

      item3.setTitle("Title");
      item3.setPrice(3.0);
      item3.setDescription("Description 3");
      item3.setCategory("Category 3");

      database.addListing(item1);
      database.addListing(item2);
      database.addListing(item3);

      
      // Get the number of items in the database
      int count = database.getDatabaseSize();
      System.out.println("Number of listing in the database: " + count);
      System.out.println();

      // TODO: Output all of the items in the database
      System.out.println("All listing in the database:");
      ArrayList<Listing> allItems = database.getAllListings();
      for(Listing listing : allItems) {
         System.out.println(" - " + listing.getTitle());
      }
      System.out.println();


      // TODO: Output all of the items that match a given title
      String title = "Title";
      System.out.println("All listing in the database that match '" + title + "':");
      allItems = database.getListingsByTitle(title);
      for(Listing listing : allItems) {
         System.out.println(" - " + listing.getTitle());
      }
      System.out.println();
   }
}