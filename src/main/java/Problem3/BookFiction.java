package Problem3;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        // homework
        // tip: use the 'super' keyword
        super(title, author);
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        // homework
        // tip: use the 'super' keyword
        super(anotherBook);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        if (numOfDaysPastDue > 0 && numOfDaysPastDue < 5) {
            return(numOfDaysPastDue * lateFeePerDayInDollar);
        } else if (numOfDaysPastDue >= 5) {
            return((numOfDaysPastDue * lateFeePerDayInDollar));
        }
        return 0;
    }
}
