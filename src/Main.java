import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws IOException {
//Создайте список учеников с баллами.
//Попросите пользователя ввести минимальный проходной балл.
//Выведите список учеников согласно следующим условиям:
//каждый ученик выведен в отдельной строке
//сумма баллов каждого ученика выше минимального проходного
//ученики отсортированы по убыванию среднего балла
//в списке не больше 10 учеников (извините, конкурс)
//Для обработки и вывода результата используйте потоки (Stream).

    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Ivan", 2));
    studentList.add(new Student("Denis", 3));
    studentList.add(new Student("Oleg", 5));
    studentList.add(new Student("Irina", 6));
    studentList.add(new Student("Egor", 4));
    System.out.println("Enter score");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int scorePassing = Integer.parseInt(br.readLine());
    studentList.stream()
        .filter(p -> (p.getScore() > scorePassing))
        .sorted(Comparator.comparing(Student::getScore).reversed())
        .limit(10)
        .collect(Collectors.toList())
        .forEach(System.out::println);
    ;

  }
}