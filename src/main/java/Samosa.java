public class Samosa {
    private static Samosa samosa;

    private Samosa() {

    }

    public static Samosa getSamosa() {
        if (samosa == null) {
            synchronized (Samosa.class) {
                samosa = new Samosa();
            }

        }
        return samosa;
    }


    public static void main(String[] args) {
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

    }
}

