package lab11.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMultiMapValue {
    private MultiMapValue<String, String> map;

    @BeforeEach
    public void setup() {
        map = new MultiMapValue<>();
    }

    @AfterEach
    public void clean() {
        map = null;
    }

    @Test
    public void testAddElementWithOneValue() {
        map.add("key", "value");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(1, map.getValues("key").size());
    }

    @Test
    public void testAddElementWithMoreValues() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(2, map.getValues("key").size());
    }

    @Test
    public void testAddTwoElements() {
        // TODO - DONE
        map.add("key1", "value1");
        map.add("key1", "value2");
        map.add("key2", "value3");
        map.add("key2", "value4");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(2, map.size());
    }

    @Test
    public void testGetFirst() {
        // TODO  - DONE
        map.add("key1", "value1");
        map.add("key1", "value2");
        map.add("key2", "value3");
        map.add("key2", "value4");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals("value1", map.getFirst("key1"));
        Assertions.assertEquals("value3", map.getFirst("key2"));
    }

    @Test
    public void testContainsKey() {
        // TODO - DONE
        map.add("key1", "value1");
        map.add("key1", "value2");
        map.add("key2", "value3");
        map.add("key2", "value4");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertFalse(map.containsKey("key"));
        Assertions.assertTrue(map.containsKey("key1"));
        Assertions.assertTrue(map.containsKey("key2"));
    }

    @Test
    public void testSize() {
        // TODO - DONE
        map.add("key1", "value1");
        map.add("key1", "value2");
        map.add("key1", "value3");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        map.add("key2", "value4");
        map.add("key2", "value5");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(2, map.size());
        map.add("key3", "value6");
        map.add("key3", "value7");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(3, map.size());
    }

    @Test
    public void testRemoveKey() {
        // TODO - DONE
        map.add("key1", "value1");
        map.add("key1", "value2");
        map.add("key1", "value3");
        Assertions.assertEquals(1, map.size());
        map.add("key2", "value4");
        map.add("key2", "value5");
        Assertions.assertEquals(2, map.size());
        map.add("key3", "value6");
        map.add("key3", "value7");
        Assertions.assertEquals(3, map.size());

        map.remove("key1");
        Assertions.assertEquals(2, map.size());
        map.remove("key2");
        Assertions.assertEquals(1, map.size());
        map.remove("key3");
        Assertions.assertEquals(0, map.size());
    }

    @Test
    public void testAddAllWithList() {
        // TODO - DONE
        map.add("key1", "value1");
        map.add("key1", "value2");
        map.add("key1", "value3");
        List<String> list = new ArrayList<String>();
        list.add("val1");
        list.add("val2");
        list.add("val3");
        map.addAll("key1", list);
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertFalse(map.containsKey("key"));
        Assertions.assertTrue(map.containsKey("key1"));
    }

    @Test
    public void testAddAllWithMultiMapValue() {
        // TODO - DONE
        map.add("key", "value0");
        MultiMapValue multiMapValue = new MultiMapValue();
        multiMapValue.add("key1", "value1");
        multiMapValue.add("key1", "value2");
        multiMapValue.add("key2", "value3");
        multiMapValue.add("key2", "value4");
        map.addAll(multiMapValue);
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertTrue(map.containsKey("key1"));
        Assertions.assertTrue(map.containsKey("key2"));
    }
}
