package edu.alenasoft.gildedrose;

public class RegularItem implements DelegateItem {

    private final Item item;

    protected RegularItem(Item item) {
        this.item = item;
    }

    public static DelegateItem createRegularItem(Item item) {
        if (item.getName().equals("Aged Brie")) return new AgedBrieItem(item);
        if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) return new BackstageItem(item);
        if (item.getName().equals("Sulfuras, Hand of Ragnaros")) return new SulfurasItem(item);
        return new RegularItem(item);
    }

    @Override
    public void age() {
        if (this.item.getQuality() > 0) {
            this.item.setQuality(this.item.getQuality() - 1);
        }

        this.item.setSellIn(this.item.getSellIn() - 1);

        if ( (this.item.getSellIn() < 0) && (this.item.getQuality() > 0) ) {
            this.item.setQuality(this.item.getQuality() - 1);
        }
    }
}
