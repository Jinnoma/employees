import java.util.ArrayList;
import java.util.List;

public class Registry {
    private List<Object> employees = new ArrayList<Object>();

    public Registry(){

    }

    public void addEmployee(Object employee){
        employees.add(employee);
    }

    public Object getEmployee(int index){
        return employees.get(index);
    }

}
