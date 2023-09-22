package DesignPattern;


public interface Employee {
    int salary();
}


class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(("ANDROID DEVELOPER"));
        int salary = employee.salary();
        System.out.println(salary);
        Employee employee2 = EmployeeFactory.getEmployee(("WEB DEVELOPER"));
        System.out.println("salary" + employee2.salary());


    }
}

 class EmployeeFactory {
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}


class AndroidDeveloper implements Employee {
    public int salary() {
        System.out.println("getting android development salary");
        return 40000;
    }

}

class WebDeveloper implements Employee {
    public int salary() {
        System.out.println("Webdeveloper salary");
        return 50000;
    }

}



