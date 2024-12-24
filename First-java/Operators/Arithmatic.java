package Operators;

public class operators {
    public static void main(String args[])
    {
        int num1= 7;
        int num2= 5;

        //Add two numbers 
        int result1 = num1+num2;
        System.out.println(result1);

        //Substract two numbers 
        int result2 = num1 - num2;
        System.out.println(result2);

        //Multiply  two numbers 
        int result3 = num1*num2;
        System.out.println(result3);

        //Divide two numbers 
        int result4 = num1/num2;
        System.out.println("Division is " + result4);

        // incrementing values

        num1= num1+2;
        num1 = num1+2;
        num1 +=1;
        num1++ ; // post increment
        ++num1; // pre increment
        num1--; // post decrement
        num2-- ;// pre decrement

        System.out.println(num1);
        System.out.println(num2);

        int num3=5;

        System.out.println(num3);

        num3++;
        System.out.println(num3);

        ++num3;
        System.out.println(num3);

        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);

        int result5 = myStr.codePointAt(3);
        System.out.println(result5);


  }

    
}
