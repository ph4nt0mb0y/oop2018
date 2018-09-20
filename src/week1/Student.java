package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student

    private String name;
    private String id;
    private String groups;
    private String emai;


    // TODO: khai báo các phương thức getter, setter cho Student

    public String getName(){
        return name;
    }
    public void setName(String s) { name = s; }
    public String getId(){
        return id;
    }
    public void setId(String s){
        id = s;
    }
    public String getGroups(){
        return groups;
    }
    public void setGroups(String s) { groups = s; }
    public String getEmai(){
        return emai;
    }
    public void setEmai(String s) { emai = s; }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        setName("Student");
        setId	("000");
        setGroups ("INT22041");
        setEmai ("uet@vnu.uet.vn");
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        setName(n);
        setId(sid);
        setEmai(em);
        setGroups("INT22041");

    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        setName(s.getName());
        setId(s.getId());
        setEmai(s.getEmai());
        setGroups(s.getGroups());
    }

    String getInfo() {
        // TODO:
        System.out.println("Name :" + name);
        System.out.println("Ma SV :" + id);
        System.out.println("Nhom :" + groups);
        System.out.println("Email :" + emai);
        return null; // xóa dòng này sau khi cài đặt
    }


}
