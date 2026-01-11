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
};