package pl.mj.schronisko_dla_zwierzat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {

    List<Category> categoriesList = new ArrayList<>();

    public CategoryRepository() {
    }

    public List<Category>findAll(){
        return categoriesList;
    }

}
