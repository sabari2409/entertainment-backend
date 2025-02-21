package com.tvmaze.tvmaze.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "category_details")
public class CategoryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @Column(name = "img_path")
    private String imgPath;

    @Column(name = "ratings")
    private double ratings;


    public CategoryDetails() {
        super();
    }

    public CategoryDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public double getRatings() {
         return ratings;
    }
    
     public void setRatings(double ratings) {
        this.ratings = ratings;
     }




}
