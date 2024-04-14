package com.example.review_service.models;

import jakarta.persistence.*;

import java.util.Date;


@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class BaseModel {

    @Id
    Long id;

    protected Date updatedAt;
    protected  Date createdAt;

}
