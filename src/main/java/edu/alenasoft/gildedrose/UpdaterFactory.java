package edu.alenasoft.gildedrose;

public class UpdaterFactory implements QualityUpdater {

    private final Item item;

    protected UpdaterFactory(Item item) {
        this.item = item;
    }

    public static QualityUpdater createQualityUpdaterByItem(Item item) {
        if (item.getName().equals("Aged Brie")) return new AgedBrieUpdater(item);
        if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) return new BackstageUpdater(item);
        if (item.getName().equals("Sulfuras, Hand of Ragnaros")) return new SulfurasUpdater(item);
        if (item.getName().equals("Conjured Mana Cake")) return new ConjuredUpdater(item);
        return new UpdaterFactory(item);
    }

    @Override
    public void updateQuality() {
        if (this.item.getQuality() > 0) {
            this.item.setQuality(this.item.getQuality() - 1);
        }

        this.item.setSellIn(this.item.getSellIn() - 1);

        if ( (this.item.getSellIn() < 0) && (this.item.getQuality() > 0) ) {
            this.item.setQuality(this.item.getQuality() - 1);
        }
    }
}
