import java.util.ArrayList;
import java.util.List;

public class Registry {
    private List<Object> employees = new ArrayList<Object>();

    public Registry(){

    }

    public void addOfficeEmployee(OfficeEmployee officeEmployee){
//        OfficeEmployee officeEmployee = new OfficeEmployee("przemek", "Guzek",30, 1, 123, 60, 234);
        employees.add(officeEmployee);
    }

}
