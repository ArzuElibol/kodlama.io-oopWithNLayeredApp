package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import dataAccess.abstracts.CourseDao;
import dataAccess.abstracts.EducatorDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Educator;

public class HibernateDao implements EducatorDao, CategoryDao, CourseDao {

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile  Course eklendi.");
        
    }

    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile  Kategori eklendi.");
        
    }

    @Override
    public void add(Educator educator) {
        System.out.println("Hibernate ile  Eğitimci eklendi.");
        
    }
    
}
