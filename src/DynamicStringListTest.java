import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DynamicStringListTest {

  @Test
  public void getInRangeTest() {
    DynamicStringList test = new DynamicStringList();
    test.add("test1");
    test.add("test2");
    test.add("test3");
    String result = test.get(2);
    assertEquals(result, "test3");
  }
   
  @Test
  public void setFirstElementTest() {
    DynamicStringList test = new DynamicStringList();
    test.add("test1");
    test.add("test2");
    test.add("test3");
    test.set(0, "test4");
    String result = test.get(0);
    assertEquals(result, "test4");
  }

  @Test
  public void addToFullArrayTest() {
    DynamicStringList test = new DynamicStringList();
    test.add("test1");
    test.add("test2");
    test.add("test3");
    test.add("test4");
    test.add("test5");
    test.add("test6");
    test.add("test7");
    test.add("test8");
    test.add("test9");
    test.add("test10");
    test.add("test11");
    String result = test.get(0);
    assertEquals(result, "test1");
  }
  
  @Test
  public void removeTest_removeFirstElement() {
    DynamicStringList planets = new DynamicStringList();
    planets.add("Mercury");
    planets.add("Venus");
    planets.add("Earth");
    planets.add("Mars");
    String removed = planets.remove(0);
    assertEquals("Mercury", removed);   
  }

  @Test
  public void removeTest_removeLastElement() {
    DynamicStringList planets = new DynamicStringList();
    planets.add("Saturn");
    planets.add("Uranus");
    planets.add("Neptune");
    planets.add("Pluto");
    String removed = planets.remove(3);
    assertEquals("Pluto", removed);   
  }

  @Test
  public void removeTest_removeNonExistentIndex() {
    DynamicStringList planets = new DynamicStringList();
    planets.add("Saturn");
    planets.add("Uranus");
    planets.add("Neptune");
    planets.add("Pluto");
    assertThrows(IndexOutOfBoundsException.class, () -> {
      planets.remove(4);
    });
  }

  @Test
  public void removeTest_whenStringListIsEmpty() {
    DynamicStringList planets = new DynamicStringList();
    assertThrows(IndexOutOfBoundsException.class, () -> {
      planets.remove(0);
    });
  }

  @Test
  public void sizeTest_testWhenListIsEmpty() {
    DynamicStringList list = new DynamicStringList();
    assertEquals(0, list.size());
  }

  @Test
  public void sizeTest_addElements() {
    DynamicStringList list = new DynamicStringList();
    list.add("coffee");
    list.add("tea");
    list.add("chai");
    assertEquals(3, list.size());
  }

  @Test
  public void sizeTest_removeTwoElements() {
    DynamicStringList list = new DynamicStringList();
    list.add("coffee");
    list.add("tea");
    list.add("chai");
    list.remove(2);
    list.remove(1);
    assertEquals(1, list.size());
  }

  @Test
  public void sizeTest_removeMultipleElementsFromSameIndex() {
    DynamicStringList list = new DynamicStringList();
    list.add("coffee");
    list.add("chai");
    list.add("cappuccino");
    list.add("tea");
    list.add("yerba mate");
    assertEquals(5, list.size());
    list.remove(2);
    assertEquals(4, list.size());
    list.remove(2);
    assertEquals(3, list.size());
    list.remove(2);
    assertEquals(2, list.size());
  }

// Expect the default capacity to be ten
@Test
public void capacityTest_whenListIsEmpty() {
  DynamicStringList list = new DynamicStringList();
  assertEquals(10, list.capacity());
}

@Test
public void capacityTest_postInsertion() {
  DynamicStringList list = new DynamicStringList();
  list.add("Dynamic");
  list.add("String");
  list.add("List");
  assertEquals(10, list.capacity());
}

@Test
public void capacityTest_setSizeTo20AndCapacityToForty() {
  DynamicStringList list = new DynamicStringList();
  for (int i = 0; i < 20; i++) {
    list.add("Element " + i);
  }
  assertEquals(40, list.capacity());
  }

@Test
public void capacityTest_setSizeToThirtyAndCapacityToForty() {
  DynamicStringList list = new DynamicStringList();
  for (int i = 0; i < 30; i++) {
    list.add("Element " + i);
  }
  assertEquals(40, list.capacity());
  }
}