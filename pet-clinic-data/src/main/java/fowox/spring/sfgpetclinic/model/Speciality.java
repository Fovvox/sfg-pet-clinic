package fowox.spring.sfgpetclinic.model;

public class Speciality extends BaseEntity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}