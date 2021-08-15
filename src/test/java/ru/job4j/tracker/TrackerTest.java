package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Метод sortDescId реализован через создание анонимного класса
     * Comparator. Выполняет сортировку по убыванию по id
     */
    @Test
    public void sortDescId() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        Item item2 = new Item();
        item2.setName("test22");
        Item item3 = new Item();
        item3.setName("test333");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.sortDescId();
        List<Item> result = Arrays.asList(
                item3, item2, item
        );
        assertThat(result, is(tracker.sortDescId()));
    }

    /**
     * Метод sortAscId реализован через переопределение метода
     * compareTo в классе Item. Выполняет сортировку по возрастанию по id
     */
    @Test
    public void sortAscId() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        Item item2 = new Item();
        item2.setName("test22");
        Item item3 = new Item();
        item3.setName("test333");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.sortDescId();

        List<Item> result = Arrays.asList(
                item, item2, item3
        );
        assertThat(result, is(tracker.sortAscId()));
    }

}