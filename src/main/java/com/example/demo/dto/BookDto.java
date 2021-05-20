package com.example.demo.dto;



public class BookDto {
    private Integer id;
    private String title;


    public BookDto() {
    }

    public BookDto(Integer id, String title) {
        this.id = id;
        this.title = title;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
