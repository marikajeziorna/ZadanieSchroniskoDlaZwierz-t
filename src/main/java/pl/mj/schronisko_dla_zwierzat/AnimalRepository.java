package pl.mj.schronisko_dla_zwierzat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository{

    List<Animal> animalsList = new ArrayList<>();

    public AnimalRepository() {
        animalsList.add(new Animal("Burek", "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. ", new Category("pies"), "https://thumbs.img-sprzedajemy.pl/1000x901c/fd/f9/19/yorkshire-terrier-pieski-rodowod-szczepienia-bedzin-485491966.jpg"));
        animalsList.add(new Animal("Reksio", "hsdkj lfd kgjhfd97 ", new Category("pies"), "https://thumbs.img-sprzedajemy.pl/1000x901c/b3/87/53/male-pieski-kock-sprzedam-486412860.jpg"));
        animalsList.add(new Animal("Kira", "hsdkj lfd kgfdskgj jhfdskl ", new Category("kot"), "https://www.koty.pl/wp-content/uploads/2013/09/czarny-kot-864x575.jpg"));
        animalsList.add(new Animal("Bonifacy", "hsdkj bjkblfd kgjhfdskl ", new Category("kot"), "https://static1.s-trojmiasto.pl/zdj/c/n/9/2098/620x0/2098166-Koty-to-czyste-zwierzeta-ale-zdarza-sie-ze-nie-bez-powodu-nie-odwiedzaja.jpg"));
    }

    public void add(Animal animal){
        animalsList.add(animal);
    }

    public List<Animal>findAll(){
        return animalsList;
    }

    public Animal findByName(String name){
        for (Animal animal:animalsList) {
            if (name.equals(animal.getName()))
                return animal;
        }
        return null;
    }

    public static List<Animal> getAnimalByCategory(List<Animal> list, Category category) {
        List<Animal> animalListByCategory = new ArrayList<>();
        for (Animal a : list) {
            if (a.getCategory().equals(category)) {
                animalListByCategory.add(a);
            }
        }
        return animalListByCategory;
    }
}
