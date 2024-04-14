package com.example.review_service.models;

import jakarta.persistence.Entity;

@Entity
public class PassengerReview  extends BaseModel
{
    protected String passengerReviewComment;
}
