/**
 * Created by yinxu on 2016/10/23.
 */
public class Student {
    public Student(String  name){}
    public  Student(){}
    int  id;
    String   name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
