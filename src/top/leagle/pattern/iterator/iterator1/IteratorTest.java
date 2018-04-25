package top.leagle.pattern.iterator.iterator1;

import java.util.ArrayList;

import org.junit.Test;

import top.leagle.pattern.iterator.iterator1.menu.DinerMenu;
import top.leagle.pattern.iterator.iterator1.menu.MenuItem;
import top.leagle.pattern.iterator.iterator1.menu.PancakeHouseMenu;

public class IteratorTest {

	@Test
	public void test1() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		ArrayList<MenuItem> pancakeHouseItems = pancakeHouseMenu.getMenuItems();
		MenuItem[] dinerItems = dinerMenu.getMenuItems();
		
		System.out.println("----- pancakeHouseItems -----");
		for (int i = 0; i < pancakeHouseItems.size(); i++) {
			MenuItem menuItem = pancakeHouseItems.get(i);
			System.out.println(menuItem);
		}
		
		System.out.println("\n----- dinerItems -----");
		for (int i = 0; i < dinerItems.length; i++) {
			MenuItem menuItem = dinerItems[i];
			System.out.println(menuItem);
		}
	}
}
