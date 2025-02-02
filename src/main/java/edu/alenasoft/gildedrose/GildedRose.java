package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class GildedRose {

  private static final Logger logger = Logger.getLogger(GildedRose.class.getName());

  public static List<Item> items = new ArrayList<>();

  public static void main(String[] args) {

    logger.info("OMGHAI!");

    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    items.add(new Item("Conjured Mana Cake", 3, 6));

    updateQuality();

    logger.info(items.toString());
  }

  public static void updateQuality() {
    for (Item item : items) {
      UpdaterFactory.createQualityUpdaterByItem(item).updateQuality();
    }
  }

}
