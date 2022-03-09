package com.web.project2.pojo;

public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private String img="static/img/1.jpg";

    public Product() {
    }

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        if(img!=null&&!"".equals(img)){
            this.img = img;
        }
    }

    public Product(Integer id, String name, Integer price, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        if(img!=null&&!"".equals(img)){
            this.img = img;
        }

    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", img='" + img + '\'' +
                '}';
    }
}
