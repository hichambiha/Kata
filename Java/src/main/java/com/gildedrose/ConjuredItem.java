package com.gildedrose;

public class ConjuredItem extends NormalItem {
	
	 protected void updateExpired(Item item) {
         decrementQuality(item);
         decrementQuality(item);
     }
     protected void updateQuality(Item item) {
         decrementQuality(item);
         decrementQuality(item);
     }

}
