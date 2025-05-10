class Day {
    private int dayNum; // 0=Sun, 1=Mon, ..., 6=Sat
    private static final String[] DAYS = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    
    // Default constructor
    public Day() {
        dayNum = 0; // Sunday
    }
    
    // Constructor with string day
    public Day(String day) {
        setDay(day);
    }
    
    // Set the day
    public void setDay(String day) {
        for (int i = 0; i < DAYS.length; i++) {
            if (DAYS[i].equals(day)) {
                dayNum = i;
                return;
            }
        }
        dayNum = 0; // Default to Sunday if invalid
    }
    
    // Print the day
    public void printDay() {
        System.out.println(DAYS[dayNum]);
    }
    
    // Return the day
    public String getDay() {
        return DAYS[dayNum];
    }
    
    // Return next day
    public String nextDay() {
        return DAYS[(dayNum + 1) % 7];
    }
    
    // Return previous day
    public String previousDay() {
        return DAYS[(dayNum + 6) % 7];
    }
    
    // Add days and return result
    public String addDays(int n) {
        return DAYS[(dayNum + n) % 7];
    }
}

public class TestDay {
    public static void main(String[] args) {
        Day d1 = new Day();
        System.out.print("Default day: ");
        d1.printDay();
        
        Day d2 = new Day("Wed");
        System.out.print("Wednesday: ");
        d2.printDay();
        
        System.out.println("Next day: " + d2.nextDay());
        System.out.println("Previous day: " + d2.previousDay());
        System.out.println("Adding 10 days: " + d2.addDays(10));
        
        d2.setDay("Fri");
        System.out.println("After setting to Friday: " + d2.getDay());
    }
}
