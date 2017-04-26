package net.ukr.dreamsicle.Lesson1Reflection.task3;

        import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.ObjectInputStream;
        import java.io.ObjectOutputStream;
        import java.lang.reflect.Field;
        import java.lang.reflect.Modifier;
        import java.util.ArrayList;

/**
 * Created by Yura on 24.04.2017.
 */
public class DeserializeRunner {
    public static void main(String[] args) {

        String filename = "person.out";
        // создадим список объектов, которые будем записывать

        ArrayList<Person> people = new ArrayList();

        people.add(new Person("Ann", "annutochka", "qwerty"));
        people.add(new Person("Yura","dreamsicle", "qazwsx"));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {

            Class<? extends ArrayList> personClass = people.getClass();
            //StringBuilder stringBuilder = new StringBuilder();

            Field [] fields = personClass.getDeclaredFields();
            for (Field field : fields) {
                if (!field.isAnnotationPresent(Save.class))
                    continue;
                if (Modifier.isPrivate(field.getModifiers()))
                    field.setAccessible(true);
            }

            oos.writeObject(people);
            System.out.println("Запись произведена");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        // десериализация в новый список
        ArrayList<Person> newPeople = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            newPeople=(ArrayList<Person>)ois.readObject();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        for(Person p : newPeople)
            System.out.println(p.toString());
    }

}
