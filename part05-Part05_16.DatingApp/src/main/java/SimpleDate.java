
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day += 1;
        if (this.day > 30) {
            this.month += 1;
            this.day -= 30;
        }
        if (this.month > 12) {
            this.year += 1;
            this.month -= 12;
        }
    }

    public void advance(int days) {
        //do this the number of times specified
        for (int i = days; i > 0; i -= 1) {
            this.day += 1;
            //if the day is more than a month, subtract 30 days + add one month
            if (this.day > 30) {
                this.month += 1;
                this.day -= 30;
            }
            //if the months are more than a year, subtract 12 months + add one year
            if (this.month > 12) {
                this.year += 1;
                this.month -= 12;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

}
