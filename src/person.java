import java.io.Serializable;

public class person implements Serializable{
    private static final long serialVersionUID = 480l;
    private int id;
    private String name;

    public person(){
        this.id = 0;
        this.name = "";
    }

    public person(int id ,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person{id: "+ this.id + ", name: "+ this.name+"}";
    }

}
