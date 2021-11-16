package br.com.igor.p1.model.entity;

public class Category {
    private Integer id;
    private String image_url;
    private String name;
    private String slug;
    private String description;
    private Administrator administrator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public String getSlug() { return slug; }

    public void setSlug(String slug) { this.slug = slug; }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
}
