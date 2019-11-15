package ressources.gildedrose;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class InnTest {
  @Test
  public void should_return_liste_for_one_Inn_updateQuality() {
	 ArrayList<Item>  liste = new ArrayList<Item>();
	 liste.add(new Item("+5 Dexterity Vest", 9, 19));
	 liste.add(new Item("Aged Brie", 1, 3));
	 liste.add(new Item("Elixir of the Mongoose", 4, 6));
	 liste.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
	 liste.add(new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21));
	 liste.add(new Item("Conjured Mana Cake", 2, 4));
	 Inn test = new Inn();	 
	 
	 test.updateQuality();
	 assertArrayEquals(liste.toArray(),test.getItems().toArray());
  }
}