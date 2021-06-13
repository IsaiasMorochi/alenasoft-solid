package edu.alenasoft.gildedrose;

public class BackstageItem implements DelegateItem {

    private final Item item;

    public BackstageItem(Item item) {
        this.item = item;
    }

    @Override
    public void age() {
        if (this.item.getQuality() < 50) {
            this.item.setQuality(this.item.getQuality() + 1);

            if (this.item.getSellIn() < 11 && this.item.getQuality() < 50) {
                this.item.setQuality(this.item.getQuality() + 1);
            }

            if (this.item.getSellIn() < 6 && this.item.getQuality() < 50) {
                this.item.setQuality(this.item.getQuality() + 1);
            }
        }

        this.item.setSellIn(this.item.getSellIn() - 1);

        if (this.item.getSellIn() < 0) {
            this.item.setQuality(0);
        }
    }
}
