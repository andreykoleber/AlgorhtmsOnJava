/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsonjava.sort;

/**
 * a
 *
 * @author Andrey Koleber
 */
public class Date implements Comparable<Date> {

    private final int year;
    private final int month;
    private final int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
   

    
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }

    @Override
    public int compareTo(Date that) {
        if (this.year > that.year) {
            return 1;
        }
        if (this.year < that.year) {
            return -1;
        }

        if (this.month > that.month) {
            return 1;
        }
        if (this.month < that.month) {
            return -1;
        }

        if (this.day > that.day) {
            return 1;
        }
        if (this.day < that.day) {
            return -1;
        }
        return 0;
    }
}
