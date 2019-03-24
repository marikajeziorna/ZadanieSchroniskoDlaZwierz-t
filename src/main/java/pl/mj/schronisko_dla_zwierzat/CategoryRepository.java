package pl.mj.schronisko_dla_zwierzat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {

    List<String> categoriesList = new ArrayList<>();

    public CategoryRepository() {
        categoriesList.add("Pies");
        categoriesList.add("Kot");
        categoriesList.add("Inne");
    }

    public List<String>findAll(){
        return categoriesList;
    }

}
