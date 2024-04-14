package com.example.review_service.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Booking extends BaseModel {

    @OneToOne
    private Review review;
    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;


    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startDate;
    private Date endTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Long totalDistance;
}
