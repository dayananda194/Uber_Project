package com.example.review_service.models;


import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

@Entity
public class DriverReview  extends  BaseModel{

    protected String driverReviewComment;

}
