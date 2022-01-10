package toDoList;

public class ToDo {
    private int id;
    private String name;
    private boolean isCompleted;
    String date;


    public ToDo(String name, String date) {
        this.name = name;
        this.date = date;
        this.id++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void changeStatus() {
        this.isCompleted = !this.isCompleted;
    }

    public void print() {
        System.out.printf("%s (%s ; %s) %n", name, date, (isCompleted)? "Done \u2714" : "Not Completed");
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
