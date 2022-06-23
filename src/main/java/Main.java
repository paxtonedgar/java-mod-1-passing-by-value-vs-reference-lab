

public class Main {

    public static void main(String[] args) {

        //solution 1
        System.out.println("solution 1");
        NumberContainer myNumber = new NumberContainer();
        multiplyNums(myNumber, 12, 3);
        System.out.println("Result = " + myNumber.number);
        System.out.println();
        //solution 2
        System.out.println("solution 2");
        NumberContainer newNumber = new NumberContainer();
        multiplyNumbers(newNumber, 12, 3);
        System.out.println("Result = " + myNumber.number);
        System.out.println();
        //solution 3
        System.out.println("solution 3");
        StringContainer myString = new StringContainer();
        myString.text = "initial value";
        addText(myString, " - adding new text");
        System.out.println("modified text: " + myString.text);
        System.out.println();
        //solution 4
        System.out.println("solution 4");
        String str = "initial value";
        addText(str, " - adding new text");
        System.out.println("modified text: " + str);
        


    }


public static void multiplyNums(NumberContainer result, int firstNumber, int secondNumber) {
    result.number = firstNumber * secondNumber;
}

public static void multiplyNumbers(NumberContainer result, int firstNumber, int secondNumber) {
    result = new NumberContainer();
    result.number = firstNumber * secondNumber;
}

public static void addText(StringContainer result, String newText) {
    result.text = result.text + newText;
}

public static void addText(String result, String newText) {
    result = result + newText;
}

}