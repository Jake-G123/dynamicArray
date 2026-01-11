public class DynamicStringList implements StringList {

  private String[] data;
  private int size;

  public DynamicStringList() {
    data = new String[10];
    size = 0;
  }

    /**
   * Retrieves the string at the specified index in the list.
   *
   * @param index the index of the string to retrieve.
   * @return the string at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
  public String get(int index) {
    if (index > size || index < 0) {
      throw new IndexOutOfBoundsException("Index is out of range.");
    }
    return data[index];
  }

  /**
   * Replaces the string at the specified index with the given value.
   *
   * @param index the index of the string to replace.
   * @param value the new value to set at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
  public void set(int index, String value) {
    if (index > size || index < 0) {
      throw new IndexOutOfBoundsException("Index is out of range.");
    }
    data[index] = value;
  }

  /**
   * Adds a new string to the end of the list.
   *
   * @param value the string to add to the list.
   */
  public void add(String value) {
    if (size == data.length - 1) {
      String[] temp = new String[data.length];
      System.arraycopy(data, 0, temp, 0, temp.length);
      data = new String[temp.length*2];
      System.arraycopy(temp, 0, data, 0, temp.length);
    }
    data[size++] = value;
  }

  /**
   * Removes the string at the specified index from the list.
   *
   * @param index the index of the string to remove.
   * @return the string that was removed.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
  public String remove(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Error: index is out of bounds.");
    }

    String removed = data[index];
    for (int i = index; i < size() - 1; i++) {
        data[i] = data[i + 1];  
      }
      size--;

    return removed;
  }

  /**
   * Returns the number of strings currently in the list.
   *
   * @return the size of the list.
   */
  public int size() {  
    return size;
  }

  /**
   * Returns the current capacity of the list (i.e., the number of elements it can hold before resizing).
   *
   * @return the capacity of the list.
   */
  public int capacity() {
    return data.length;
  }
}