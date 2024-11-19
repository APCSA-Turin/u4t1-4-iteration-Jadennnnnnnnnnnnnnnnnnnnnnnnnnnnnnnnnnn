public class Person {
    private String fName;
    private String lName;
    private int meetings = 0;

    public Person(String f, String l) {
        fName = f;
        lName = l;
    }

    public int getMeetings() {
        return meetings;
    }

    public String getFirstName() {
        return fName;
    }

    public void setMeetings(int newMeetings) {
        meetings = newMeetings;
    }

    public void meet(Person p2) {
        System.out.println("Hello, my name is " + fName);
        System.out.println("Hi, my name is " + p2.getFirstName());
        meetings++;
        p2.setMeetings(p2.getMeetings() + 1);
    }
}
