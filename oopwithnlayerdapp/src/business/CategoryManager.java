package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager() {
    
    }



    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
this.categories=categories;
        
    }



    public void add(Category category) throws Exception {

        for (Category c : categories) {
            if (category.getCategoryName() == c.getCategoryName()) {
                throw new Exception("Bu Kategori daha önce ekli");
            }
            categoryDao.add(category);
        }
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }

    }

}
