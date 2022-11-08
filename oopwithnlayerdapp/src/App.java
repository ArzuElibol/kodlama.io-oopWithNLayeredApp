import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.concretes.HibernateDao;
import dataAccess.concretes.JdbcDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Educator;

public class App {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = { new MailLogger(), new DatabaseLogger(), new FileLogger() };

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "Programlama"));
        categories.add(new Category(2, "Mobil Programlama"));
      

        CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers, categories);

        try {
            categoryManager.add(new Category(3, "Web Tasarımı"));

        } catch (Exception e) {
            System.out.println(e);
        }

        List<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "Programlama", 200));
        courses.add(new Course(2,  "Mobil Programlama", 250));

        CourseManager courseManager = new CourseManager(new JdbcDao(), loggers, courses);

        try {
            courseManager.add(new Course(3, "Flutter",9));
        } catch (Exception e1) {
            System.out.println(e1);
        }

        Educator educator = new Educator(1, "Engin", "Demirog", "engindemirog@gmail");

        EducatorManager educatorManager = new EducatorManager(new JdbcDao(), loggers);
        educatorManager.add(educator);
     

    }
}
