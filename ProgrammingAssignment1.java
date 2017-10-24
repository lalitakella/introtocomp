package classexamples;

public class ProgrammingAssignment1 {
	public static void main(String[]args){
	String statement = "Wow, the cubs are in the World Series!";
	System.out.println(statement.substring(25));
    System.out.println(statement.substring(5,13));
    int win = 1908;
    int last = 2017 - win;
    System.out.println("It's been these many years since the Cubs won a World Series: " + last);
}
}
