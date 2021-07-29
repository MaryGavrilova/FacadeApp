
public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Результат вычислений: " + bins.sum("1110", "101"));
        System.out.println("Результат вычислений: " + bins.mult("1110", "101"));
        System.out.println("Результат вычислений: " + bins.mult("grt", "101"));
        System.out.println("Результат вычислений: " + bins.mult("56", "101"));
    }
}