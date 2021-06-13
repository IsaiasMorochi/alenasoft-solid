package edu.alenasoft.gildedrose;

public class ConjuredItem implements DelegateItem {
    private final Item item;

    public ConjuredItem(Item item) {
        this.item = item;
    }

    @Override
    public void age() {
        if (this.item.getQuality() > 0) this.item.setQuality(this.item.getQuality() - 2);

        this.item.setSellIn(this.item.getSellIn() - 1);

        if ( (this.item.getSellIn() < 0) && (this.item.getQuality() > 0) )
            this.item.setQuality(this.item.getQuality() - 2);

        if (this.item.getQuality() < 0) this.item.setQuality(0);
    }
}
