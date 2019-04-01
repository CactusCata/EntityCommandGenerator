package fr.cactuscata.entitycommandgenerator.inventory;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

import fr.cactuscata.entitycommandgenerator.inv.Item;
import fr.cactuscata.entitycommandgenerator.inv.Material;
import fr.cactuscata.entitycommandgenerator.utils.Disencouraged;
import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public class Inventory extends AbstractList<Item> implements Serializable {

	private final Item[] items;

	public Inventory(int size, Item... items) {
		this.items = new Item[size];
		this.addAll(items);
	}

	@Override
	public boolean add(Item item) {
		this.add(0, item);
		return true;
	}

	@Override
	public void add(int index, Item item) {
		int itemAmount = item.getAmount();
		Material itemMaterial = item.getMaterial();
		int maxSize = itemMaterial.getMaxSize();

		for (; index < this.size(); index++) {
			Item slotItem = this.get(index);
			if (slotItem.getMaterial() == itemMaterial && slotItem.getAmount() < maxSize) {
				int canTake = maxSize - slotItem.getAmount();
				if (itemAmount > canTake) {
					slotItem.setAmount(maxSize);
					itemAmount -= canTake;
				} else {
					slotItem.addAmount(itemAmount);
					return;
				}
			}
		}

		throw new InventoryCanStoreException(item);

	}

	@Override
	public boolean addAll(Collection<? extends Item> items) {
		return this.addAll(0, items);
	}

	@Override
	public boolean addAll(int startIndex, Collection<? extends Item> items) {
		items.forEach(item -> this.add(startIndex, item));
		return true;
	}

	public void addAll(Item... items) {
		this.addAll(Arrays.asList(items));
	}

	@Override
	public void clear() {
		this.forEach(this::remove);
	}

	@Override
	public boolean contains(Object itemO) {
		if (!(itemO instanceof Item)) { return false; }
		return (this.stream().filter(i -> i.equals(itemO)).count()) > 1;
	}

	@Override
	public boolean containsAll(Collection<?> items) {
		items.forEach(items::contains);
		return true;
	}

	@Override
	public Item get(int index) {
		return this.items[index];
	}

	@Override
	public boolean isEmpty() {
		for (Item item : this) {
			if (item.getMaterial() != null || item.getMaterial() != Material.AIR) return true;
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		if (!(o instanceof Item)) return false;

		Item item = (Item) o;

		int itemAmount = item.getAmount();
		Material itemMaterial = item.getMaterial();

		for (int index = 0; index < this.size(); index++) {
			Item slotItem = this.get(index);
			if (slotItem.getMaterial() == itemMaterial) {
				int slotItemAmount = slotItem.getAmount();
				if (slotItemAmount > itemAmount) {
					remove(index);
					itemAmount -= slotItemAmount;
				} else {
					slotItem.removeAmount(itemAmount);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Item remove(int index) {
		return set(index, null);
	}

	@Override
	public boolean removeAll(Collection<?> items) {
		this.forEach(this::remove);
		return true;
	}

	@Override
	public Item set(int index, Item item) {
		return this.items[index] = item;
	}

	@Override
	public int size() {
		return this.items.length;
	}

	@Override
	@Disencouraged
	public String serialize() {
		return "ISN'T WORKS TODAY, MAYBE AN OTHER DAY :))) (check on Monday (maybe))";
	}

}
