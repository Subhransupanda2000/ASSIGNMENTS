package Java;

import java.sql.SQLOutput;

public enum Status {
    OK(200, "OK"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_ERROR(500, "Internal Server Error");

    private final int CODE;
    private final String MESSAGE;

    private Status(int CODE, String MESSAGE) {
        this.CODE = CODE;
        this.MESSAGE = MESSAGE;
    }

    public int getCODE() {
        return CODE;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public static void main(String[] args) {
        Status status1 = Status.OK;
        Status status2 = Status.NOT_FOUND;

        System.out.println(status1.getCODE()); // 200
        System.out.println(status2.getMESSAGE()); // "Not Found"
    }


}


