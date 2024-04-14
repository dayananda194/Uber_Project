package com.example.review_service.models;

import jakarta.persistence.*;

@Entity

public class Review extends BaseModel{

    protected  String content;

    protected String rating;


}