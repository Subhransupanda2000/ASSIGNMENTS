package Collection;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList1 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String>copyOnWriteArrayList=new CopyOnWriteArrayList();
        copyOnWriteArrayList.add("jimi");
        copyOnWriteArrayList.add("mimi");
        System.out.println(copyOnWriteArrayList);
        for (String item:copyOnWriteArrayList)
        {
            System.out.println(item);
        }

    }
}
