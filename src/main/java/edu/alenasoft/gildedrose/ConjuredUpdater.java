package edu.alenasoft.gildedrose;

public class ConjuredUpdater implements QualityUpdater {
    private final Item item;

    public ConjuredUpdater(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (this.item.getQuality() > 0) this.item.setQuality(this.item.getQuality() - 2);

        this.item.setSellIn(this.item.getSellIn() - 1);

        if ( (this.item.getSellIn() < 0) && (this.item.getQuality() > 0) )
            this.item.setQuality(this.item.getQuality() - 2);

        if (this.item.getQuality() < 0) this.item.setQuality(0);
    }
}
