package br.com.igor.p1.model.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Product {
    private Integer id;
    private String name;
    private String description;
    private String image_url;
    private LocalDate created_at;
    private LocalTime hour_create_at;
    private Timestamp update_at;
    private Float unity_value;
    private List<Category> categoryList;
    private List<PromotionItem> promotionItemList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalTime getHour_create_at() {
        return hour_create_at;
    }

    public void setHour_create_at(LocalTime hour_create_at) {
        this.hour_create_at = hour_create_at;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }

    public Float getUnity_value() {
        return unity_value;
    }

    public void setUnity_value(Float unity_value) {
        this.unity_value = unity_value;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public List<PromotionItem> getPromotionItemList() {
        return promotionItemList;
    }

    public void setPromotionItemList(List<PromotionItem> promotionItemList) {
        this.promotionItemList = promotionItemList;
    }
}