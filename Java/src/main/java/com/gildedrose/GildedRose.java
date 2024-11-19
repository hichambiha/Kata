package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            NormalItem itemType = itemTypeFactory(item);
            itemType.updateItem(item);
        }
    }

    private NormalItem itemTypeFactory(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new LegendaryItem();
        }
        if (item.name.equals("Aged Brie")) {
            return new AgedBrieItem();
        }
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePassItem();
        }
        if (item.name.startsWith("Conjured"))
            return new ConjuredItem();

        return new NormalItem();
    }
}
