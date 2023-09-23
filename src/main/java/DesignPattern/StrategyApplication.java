package DesignPattern;

public class StrategyApplication {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("Addition: " + context.executeStrategy(10, 5));

        context = new Context(new SubOperation());
        System.out.println("Subtraction: " + context.executeStrategy(10, 5));

        context = new Context(new MulOperation());
        System.out.println("Multiplication: " + context.executeStrategy(10, 5));
    }
}
