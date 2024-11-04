class StringLoops {
  public StringLoops() { }

  public int countCharacters(String character, String searchString) {
    int count = 0;
    String chara = character.toLowerCase();
    String search = searchString.toLowerCase();

    for (int i = 0; i < search.length(); i ++) {
      String x = search.substring(i, i + 1);
      if (x.equals(chara)) {
        count ++;
      }
    }
    return count;
  }

  public String reverseString(String origString) {
    String reverse = "";
    String x;
    for (int i = origString.length() - 1; i >= 0; i --) {
      x = origString.substring(i, i + 1);
      reverse += x;
    }
    return reverse;
  }
}