public class MyClass {
    public static void main(String args[]) {

//Instructions
//intilize month by setting equal to a number between 1-12
//Complete this switch statement by 1) writing the last case (case 12), so that it prints out "December"
// and 2) writing a default case that for any month number not between 1 and 12, will print out "Invalid month"
//test your code by executing for month 12 and 13

int month; // should be a number 1-12, intize the month here by adding a number
String monthString;

switch(month) {
    case 1: monthString = "January";
        break;
    case 2: monthString = "February";
        break;
    case 3: monthString = "March";
        break;
    case 4: monthString = "April";
        break;
    case 5: monthString = "May";
        break;
    case 6: monthString = "June";
        break;
    case 7: monthString = "July";
        break;
    case 8: monthString = "August";
        break;
    case 9: monthString = "September";
        break;
    case 10: monthString = "October";
        break;
    case 11: monthString = "November";
        break;
    // write case 12 and a default case below

}
System.out.println(monthString);
    }
}
