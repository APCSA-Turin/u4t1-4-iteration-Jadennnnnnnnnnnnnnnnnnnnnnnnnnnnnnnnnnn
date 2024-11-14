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

  public String removeA(String str) {
    str = str.toLowerCase();
    int index;
    while (str.indexOf("a") != -1) {
      index = str.indexOf("a");
      str = str.substring(0, index) + str.substring(index + 1);
    }
    return str;
 }

 public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
  for (int i = 0; i < origStr.length(); i ++) {
    if (origStr.substring(i, i + 1).equals(searchChar)) {
      origStr = origStr.substring(0, i) + replaceChar + origStr.substring(i + 1);
    }
  }
  return origStr;
 }
 public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
  int index;
  while (origStr.indexOf(searchChar) != -1) {
    index = origStr.indexOf(searchChar);
    origStr = origStr.substring(0, index) + replaceChar + origStr.substring(index + 1);
  }
  return origStr;
 }

 public int countString(String searchString, String origString) {
  int count = 0;
  int index = 0;
  while ((index = origString.indexOf(searchString, index)) != -1) {
    count ++;
    index ++;
  }
  return count;
 }

 public String removeString(String searchString, String origString) {
  while (origString.indexOf(searchString) != -1) {
    origString = origString.replace(searchString, "");
  }
  return origString;
 }


 public void commaSeparated(int fromNum, int toNum) {
  if (fromNum > toNum) {
    for (int i = fromNum; i >= toNum; i --) {
      if (i != toNum) {
        System.out.print(i + ", ");
      } else System.out.print(i);
    }
  } else if (fromNum <= toNum) {
    for (int i = fromNum; i <= toNum; i ++) {
      if (i != toNum)
        System.out.print(i + ", ");
      else System.out.print(i);
    }
  }
  System.out.println();
 }

 public boolean isPalindrome(String myString) {
  myString = replaceCharacterV2(" ", myString, "");
  String palindrome = "";
  for (int i = 0; i < myString.length(); i ++) {
    palindrome = myString.substring(i, i + 1) + palindrome;
  }
  return myString.equals(palindrome);
}

public void multiPrint(String toPrint, int num) {
  String str = "[";
  for (int i = num; i > 0; i --) {
    str = str + toPrint;
    if (i != 1) {
      str += " ";
    }
  }
  System.out.println(str + "]");
}

}