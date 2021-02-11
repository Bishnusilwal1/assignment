public class hello {
public static void main(String[] args) {
boolean isSnowing = false;
boolean isRaining = false;
double temperature = 50;

if (isSnowing || isRaining || temperature<50) {
System.out.println("Let's stay home");
} else {
System.out.println("Let's go out");
}
}
}