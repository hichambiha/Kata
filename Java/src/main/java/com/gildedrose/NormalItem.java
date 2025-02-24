package com.gildedrose;

public class NormalItem {
    protected void updateItem(Item item) {
        updateQuality(item);
        updateSellIn(item);
        if (item.sellIn < 0) {
            updateExpired(item);
        }
    }
    protected void updateSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }
    protected void updateQuality(Item item) {
        decrementQuality(item);
    }
    protected void updateExpired(Item item) {
        decrementQuality(item);
    }
    protected void incrementQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
    protected void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
