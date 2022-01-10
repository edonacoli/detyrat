package toDoList;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<ToDo> toDoList;


    public ToDoList(ArrayList<ToDo> toDoList) {
        this.toDoList = toDoList;
    }

    public void addToList(String activity, String date) {
        ToDo toDo = new ToDo(activity, date);
        this.toDoList.add(toDo);
        toDo.print();
    }

    public void removeAllCompletedActivity( ) {
        this.toDoList.removeIf(ToDo::isCompleted);

    }

    public void removeAnActivity(int number) {
        toDoList.removeIf(toDo -> number == toDo.getId());
    }

    public void viewAnActivityInList(String activity) {
        var test = true;
        for (ToDo toDo : toDoList ) {
            if (toDo.getName().contains(activity)) {
                System.out.print(toDoList.indexOf(toDo) + 1 + ". ");
                toDo.print();
                test = false;
            }
        }
        if(test)
            System.out.println("Nje aktivitet i tille nuk ekziston ne listen e tuaj!");
    }

    public void viewToDoList() {
        System.out.println("Lista: ");
        for (ToDo toDo : toDoList) {
            System.out.print(toDoList.indexOf(toDo) + 1 + ". ");
            toDo.print();
        }
    }

    public void markAnActivityAsCompleted(int number) {
        for (ToDo toDo : toDoList ) {
            if (number == toDoList.indexOf(toDo) + 1)  {
                toDo.changeStatus();
            }
        }

    }

    public void menu() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("1 - Per te shtuar nje aktivitet ne toDoList");
        System.out.println("2 - Per te gjetur nje aktivitet nga toDoList");
        System.out.println("3 - Per te fshire nje aktivitet nga toDoList");
        System.out.println("4 - Per te shfaqur gjithe toDoList");
        System.out.println("5 - Per te fshire te gjitha aktivitet nga toDoList");
        System.out.println("6 - Per te shfaqur numrin total te aktiviteve ne toDoList");
        System.out.println("7 - Per te markuar aktivitetin nga toDoList, si te kompletuar");
        System.out.println("8 - Per te fshire aktivitetet e perfunduara");
        System.out.println("9 - Per mbylljen e programit");
        System.out.println("-----------------------------------------------------------------");
    }
}

