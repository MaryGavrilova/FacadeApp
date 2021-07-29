public class BinOps {
    public String sum(String a, String b) {
        String resultSum = null;
        try {
            int number1 = Integer.parseInt(a, 2);
            int number2 = Integer.parseInt(b, 2);
            int result = number1 + number2;
            resultSum = Integer.toBinaryString(result);
        } catch (NumberFormatException exception) {
            System.out.println("Введен параметр не в двоичной системе записи");
        }
        return resultSum;
    }

    public String mult(String a, String b) {
        String resultMult = null;
        try {
            int number1 = Integer.parseInt(a, 2);
            int number2 = Integer.parseInt(b, 2);
            int result = number1 * number2;
            resultMult = Integer.toBinaryString(result);
        } catch (NumberFormatException exception) {
            System.out.println("Введен параметр не в двоичной системе записи");
        }
        return resultMult;
    }
}