package pl.mj.schronisko_dla_zwierzat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AnimalController {

    private AnimalRepository animalRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public AnimalController(AnimalRepository animalRepository, CategoryRepository categoryRepository) {
        this.animalRepository = animalRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/")
    public String homePage(Model model){
        List<Animal> animalRepositoryAll = animalRepository.findAll();
        model.addAttribute("animalsList", animalRepositoryAll);
        List<Category> categoryRepositoryAll = categoryRepository.findAll();
        model.addAttribute("categoryRepository", categoryRepositoryAll);
        return "stronaGlowna";
    }

    @GetMapping("/szczegoly")
    public String details(@RequestParam String name, Model model){
        Animal animalRepositoryByName = animalRepository.findByName(name);
        model.addAttribute("nameAnimal", animalRepositoryByName);
        return "szczegoly";
    }

    @PostMapping("/dodaj")
    public String addForm(Animal animal){
        animalRepository.add(animal);
        return "stworzono";
    }



}
