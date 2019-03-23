package pl.mj.schronisko_dla_zwierzat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {

    List<String> categoriesList = new ArrayList<>();

    public CategoryRepository() {
        categoriesList.add("pies");
        categoriesList.add("kot");
        categoriesList.add("inne");
    }

    public List<String>findAll(){
        return categoriesList;
    }

}
