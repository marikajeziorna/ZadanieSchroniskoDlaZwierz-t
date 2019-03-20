package pl.mj.schronisko_dla_zwierzat;


public class Animal {

    private String name;
    private String description;
    private Category category;
    private String imgUrl;

    public Animal(String name, String description, Category category, String imgUrl) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.imgUrl = imgUrl;
    }

    public Animal() {
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
