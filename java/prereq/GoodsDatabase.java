package prereq;

import java.util.ArrayList;

public class GoodsDatabase {

   private ArrayList<Listing> goods;

   public GoodsDatabase() {
      // Make goods an empty ArrayList of Listings
      goods = new ArrayList<Listing>();
   }

   // Put a new Listing in the database
   public void addListing(Listing listing) {
      goods.add(listing);
   }

   // Get the number of listings in the database
   public int getDatabaseSize() {
      // TODO: Implement
      return goods.size();
   }

   public ArrayList<Listing> getAllListings() {
      // TODO: Implement
      return goods;
   }

   public ArrayList<Listing> getListingsByTitle(String title) {
      // TODO: Implement
      ArrayList<Listing> result = new ArrayList<Listing>();
      for(Listing listing : goods) {
         if(listing.getTitle().equals(title)) {
            result.add(listing);
         }
      }
      return result;
   }

}