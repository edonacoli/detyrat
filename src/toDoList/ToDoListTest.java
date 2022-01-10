package toDoList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ToDoListTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ToDo> toDoList = new ArrayList<>();
        ToDoList t = new ToDoList(toDoList);
        int number;

        String activity;
        String date;
        label:
        while(true) {
            System.out.println();
            System.out.println("Zgjedhni nga menyja: ");
            t.menu();
            String input = sc.nextLine();
            switch (input.trim()) {
                case "1":
                    //System.out.println("ffffffffff");
                    System.out.print("Shkruaj aktivitetin qe doni te shtoni: ");
                    activity = sc.nextLine();
                    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date date1 = new Date();

                    while (true) {
                        System.out.print("Shkruaj daten e realizimit te aktivitetit (dd/mm/yyyy): ");
                        date = sc.nextLine();
                        Date testDate;
                        try {
                            testDate = df.parse(date);
                            if (!df.format(testDate).equals(date)) {
                                System.out.println("Kjo date nuk eshte valide!");
                            } else {
                                if (date1.before(testDate)) {
                                    break;
                                }
                                System.out.println("Ju duhet te shtoni aktivitete per ditet ne vijim!");
                            }
                        } catch (ParseException e) {
                            System.out.println("Daten shenojeni ne formatin (dd/mm/yyyy)!");
                        }

                    }
                    t.addToList(activity, date);
                    System.out.println();
                    System.out.println("Ky aktivitet u shtua me sukses!");
                    break;
                case "2":
                    if (toDoList.isEmpty()) System.out.println("Lista e gjerave per te bere eshte bosh!");
                    else {
                        System.out.print("Shkruani aktivitetin qe deshironi te gjeni: ");
                        activity = sc.nextLine();
                        t.viewAnActivityInList(activity);
                    }
                    break;
                case "3":
                    if (toDoList.isEmpty()) System.out.println("Lista e gjerave per te bere eshte bosh!");
                    else {
                        t.viewToDoList();
                        System.out.print("Shkruaj numrin e aktivitetit qe deshironi te fshini:  ");
                        sc.nextInt();
                        number = sc.nextInt();
                        t.removeAnActivity(number);
                        System.out.print("Aktiviteti u fshi me sukses!");
                    }
                    break;
                case "4":
                    if (toDoList.isEmpty())
                        System.out.println("Lista e gjerave per te bere eshte bosh!");
                    else
                        t.viewToDoList();
                    break;
                case "5":
                    if (toDoList.isEmpty()) {
                        System.out.println("Lista e gjerave per te bere eshte bosh!");
                    } else {
                        toDoList.clear();
                        System.out.println("Ne listen e gjerave per te bere jane fshire me sukses te gjitha aktivitetet!");
                    }
                    break;
                case "6":
                    System.out.println("Numri total i aktiviteve eshte: " + toDoList.size());
                    break;
                case "7":
                    if (toDoList.isEmpty()) {
                        System.out.println("Lista e gjerave per te bere eshte bosh!");
                    } else {
                        t.viewToDoList();
                        System.out.print("Shkruaj numrin e aktivitetit qe e keni perfunduar:  ");
                        number = sc.nextInt();
                        t.markAnActivityAsCompleted(number);
                        System.out.println("Ky aktivitet tashme eshte markuar!");
                    }
                    break;
                case "8":
                    if (toDoList.isEmpty()) {
                        System.out.println("Lista e gjerave per te bere eshte bosh!");
                    } else {
                        t.removeAllCompletedActivity();
                        System.out.println("Aktivitetet e markuara jane fshire me sukses!");
                    }

                    break;
                case "9":
                    System.out.println("Programi u mbyll!");
                    break label;
                default:
                    System.out.println("Zgjedhja e juaj nuk i takon menyse, shiko opsionet qe mund t'i zgjedhni: ");
                    break;
            }

        }
    }


}