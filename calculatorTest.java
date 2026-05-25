public class calculatorTest{
    public static void main(String[] args){
        calculator cal=new calculator();
        if(cal.add(2,3)==5){
            System.out.println("Test Passed");
        
        }else{
            System.out.println("Test Failed")
        }
         if (calc.subtraction(10, 4) == 6) {
            System.out.println("Subtraction Test Passed");
        } else {
            System.out.println("Subtraction Test Failed");
        }
        if (calc.multiplication(2, 5) == 10) {
            System.out.println("Multiplication Test Passed");
        } else {
            System.out.println("Multiplication Test Failed");
        }
         if (calc.division(20, 4) == 5) {
            System.out.println("Division Test Passed");
        } else {
            System.out.println("Division Test Failed");
        }
    }
}