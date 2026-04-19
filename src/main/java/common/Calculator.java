package common;

public class Calculator {

    // Variabler för att spara de två talen och resultatet
    private double frist;
    private double second;
    private double result;

    // Konstruktor: Sparar talen när man skapar en ny kalkylator
    public Calculator(double frist, double second) {
        this.frist = frist;
        this.second = second;
    }

    // Metod för att addera (plus)
    public void add() {
        result = frist + second;
    }

    // Hämtar det uträknade resultatet
    public double getResult() {
        return result;
    }

    // Metod för att subtrahera (minus)
    public void subtract() {
        // Skriver ut ett meddelande i konsolen och räknar ut skillnaden
        System.out.println("Ingen svar");
        result = frist - second;
    }

    // Metod för att multiplicera (gånger)
    public void multiply() {
        result = frist * second;
    }

    // Metod för att dividera (delat med)
    public void divide() {
        result = frist / second;
    }
}
