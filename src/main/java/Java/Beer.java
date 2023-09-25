package Java;

public enum Beer {
    KF(100),KO(70),RC(65),Fo(90);
    int price;
    Beer(int price)
    {
        this.price=price;
    }

    public int getPrice()
    {
        return price;
    }

}
class Test
{
    public static void main(String[] args) {
        Beer[] b=Beer.values();
        for (Beer b1:b)
        {
            System.out.println(b1+"......."+b1.getPrice());
        }
    }
}
