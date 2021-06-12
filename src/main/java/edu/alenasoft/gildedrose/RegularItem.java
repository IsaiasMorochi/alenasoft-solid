package edu.alenasoft.gildedrose;

public class RegularItem {

    private Item item;

    public RegularItem(Item item) {
        this.item = item;
    }

    public void age() {
        if ((!"Aged Brie".equals(this.item.getName()))
                && !"Backstage passes to a TAFKAL80ETC concert".equals(this.item.getName())) {
            if (this.item.getQuality() > 0) {
                if (!"Sulfuras, Hand of Ragnaros".equals(this.item.getName())) {
                    this.item.setQuality(this.item.getQuality() - 1);
                }
            }
        } else {
            if (this.item.getQuality() < 50) {
                this.item.setQuality(this.item.getQuality() + 1);

                if ("Backstage passes to a TAFKAL80ETC concert".equals(this.item.getName())) {
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

        if (!"Sulfuras, Hand of Ragnaros".equals(this.item.getName())) {
            this.item.setSellIn(this.item.getSellIn() - 1);
        }

        if (this.item.getSellIn() < 0) {
            if (!"Aged Brie".equals(this.item.getName())) {
                if (!"Backstage passes to a TAFKAL80ETC concert".equals(this.item.getName())) {
                    if (this.item.getQuality() > 0) {
                        if (!"Sulfuras, Hand of Ragnaros".equals(this.item.getName())) {
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
