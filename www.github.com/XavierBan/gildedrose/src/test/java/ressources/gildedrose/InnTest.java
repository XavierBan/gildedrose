package ressources.gildedrose;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;

public class InnTest {
  @Test
  public void should_return_liste_for_one_Inn_updateQuality() {
	  LegacyInn juste = new LegacyInn();
	  Inn test = new Inn();
	  Item itemJuste= new Item(null,0,0);
	  Item itemTest= new Item(null,0,0);
	  
	  
	  
	  juste.updateQuality();
	  juste.updateQuality();
	  juste.updateQuality();
	  juste.updateQuality();
	  juste.updateQuality();
	  juste.updateQuality();
	  juste.updateQuality();
	  juste.updateQuality();
	  juste.updateQuality();
	  juste.updateQuality();
	  juste.updateQuality();
	  juste.updateQuality();
	  
	  test.updateQuality();
	  test.updateQuality();
	  test.updateQuality();
	  test.updateQuality();
	  test.updateQuality();
	  test.updateQuality();
	  test.updateQuality();
	  test.updateQuality();
	  test.updateQuality();
	  test.updateQuality();
	  test.updateQuality();
	  test.updateQuality();
	  
	  Iterator<Item> iteJuste=juste.getItems().iterator();
	  Iterator<Item> iteTest=test.getItems().iterator();
	  
	 while(iteJuste.hasNext()) {
		 itemJuste=iteJuste.next();
		 itemTest=iteTest.next();
		 assertEquals(itemJuste.getName(),itemTest.getName());
		 assertEquals(itemJuste.getQuality(),itemTest.getQuality());
		 assertEquals(itemJuste.getSellIn(),itemTest.getSellIn());
		 
	 }
  }
}