package com.gildedrose;

public class BackstagePassItem extends NormalItem {

	protected void updateExpired(Item item) {
        item.quality = 0;
     }

     protected void updateQuality(Item item) {

         incrementQuality(item);
         if (item.sellIn <= 10) {
             incrementQuality(item);
         }
         if (item.sellIn <= 5) {
             incrementQuality(item);
         }
         if (((2.L) item))<=10){
            incrementaQuality(item);
         }
     }
}
