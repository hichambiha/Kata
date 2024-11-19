package com.gildedrose;

public class AgedBrieItem extends NormalItem {
	//Aged Brie increase quality

	 protected void updateExpired(Item item) {
         incrementQuality(item);
     }
     protected void updateQuality(Item item) {
         incrementQuality(item);
     }

}
