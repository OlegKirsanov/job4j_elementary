package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(item, "test1");
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAdd3ItemsThenTrackerFinds2ndItem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        tracker.add(item1, "test1");
        tracker.add(item2, "test2");
        tracker.add(item3, "test3");
        Item result = tracker.findById(item2.getId());
        assertThat(result.getName(), is(item2.getName()));
    }
}
