package pl.mj.schronisko_dla_zwierzat;


public class Animal {

    private String name;
    private String description;
    private String category;
    private String imgUrl;
    private int id;

    public Animal(String name, String description, String category, String imgUrl, int id) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.imgUrl = imgUrl;
        this.id = id;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortDescription() {
        if (description.length() < 100) {
            return description;
        } else
            return description.substring(0, 100);
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
