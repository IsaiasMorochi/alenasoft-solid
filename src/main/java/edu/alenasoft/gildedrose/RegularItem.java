package edu.alenasoft.gildedrose;

public class RegularItem {

    private Item item;

    protected RegularItem(Item item) {
        this.item = item;
    }

    public static RegularItem createRegularItem(Item item) {
        if (item.name.equals("Aged Brie")) return new AgedBrieItem(item);
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) return new BackstageItem(item);
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) return new SulfurasItem(item);
        return new RegularItem(item);
    }

    public void age() {
        boolean isAgedBrie = "Aged Brie".equals(this.item.getName());
        boolean isBackstage = "Backstage passes to a TAFKAL80ETC concert".equals(this.item.getName());
        boolean isNotSulfuraItem = !"Sulfuras, Hand of Ragnaros".equals(this.item.getName());
        if ((!isAgedBrie)
                && !isBackstage) {
            if (this.item.getQuality() > 0) {
                if (isNotSulfuraItem) {
                    this.item.setQuality(this.item.getQuality() - 1);
                }
            }
        } else {
            if (this.item.getQuality() < 50) {
                this.item.setQuality(this.item.getQuality() + 1);

                if (isBackstage) {
                    if (this.item.getSellIn() < 11) {
                        if (this.item.getQuality() < 50) {
                            this.item.setQuality(this.item.getQuality() + 1);
                        }
                    }

                    if (this.item.getSellIn() < 6) {
                        if (this.item.getQuality() < 50) {
                            this.item.setQuality(this.item.getQuality() + 1);
                        }
                    }
                }
            }
        }

        if (isNotSulfuraItem) {
            this.item.setSellIn(this.item.getSellIn() - 1);
        }

        if (this.item.getSellIn() < 0) {
            if (!isAgedBrie) {
                if (!isBackstage) {
                    if (this.item.getQuality() > 0) {
                        if (isNotSulfuraItem) {
                            this.item.setQuality(this.item.getQuality() - 1);
                        }
                    }
                } else {
                    this.item.setQuality(this.item.getQuality() - this.item.getQuality());
                }
            } else {
                if (this.item.getQuality() < 50) {
                    this.item.setQuality(this.item.getQuality() + 1);
                }
            }
        }
    }
}
