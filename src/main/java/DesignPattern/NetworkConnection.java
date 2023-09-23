package DesignPattern;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;

    public String getIp() {
        return ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void loadVeryImportantData() {
        this.importantData = "Very Very Important Data";
    }
    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class mainn
{
    public static void main(String[] args) {
        System.out.println("object for prototype Design pattern");
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp("123.45.89");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);
        try {
            NetworkConnection networkConnection2=(NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        }catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
