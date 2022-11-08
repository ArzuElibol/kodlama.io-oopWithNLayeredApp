package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;


public class CourseManager {
    private CourseDao coursedao;
    private Logger loggers[];
    private List<Course> courses;

    public CourseManager(CourseDao coursedao, Logger loggers[],List<Course> courses) {
        this.coursedao = coursedao;
        this.loggers = loggers;
        this.courses=courses;
        
    }

public void add(Course course) throws Exception{
 for (Course c : courses) {
    if (course.getPrice()<10) {
        throw  new Exception("Kurs fiyatı 10'dan küçük olamaz");
           }
 if (course.getName().equals(c.getName())){
            throw  new Exception("Kurs zaten ekli");
        }
    }
    for (Logger logger : loggers) {
        logger.log(course.getName());
    }
    coursedao.add(course);
}

    
}
