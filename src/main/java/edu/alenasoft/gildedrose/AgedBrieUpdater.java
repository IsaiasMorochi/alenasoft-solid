package edu.alenasoft.gildedrose;

public class AgedBrieUpdater implements QualityUpdater {

    private final Item item;

    public AgedBrieUpdater(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (this.item.getQuality() < 50) {
            this.item.setQuality(this.item.getQuality() + 1);
        }

        this.item.setSellIn(this.item.getSellIn() - 1);

        if ( (this.item.getSellIn() < 0) && (this.item.getQuality() < 50) ) {
            this.item.setQuality(this.item.getQuality() + 1);
        }
    }
}
