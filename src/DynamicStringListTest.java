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
  /*
  @Test
  public void remove() {

  }

  @Test
  public void size() {

  }

  @Test
  public void capacity() {
    
  }
  */
}
