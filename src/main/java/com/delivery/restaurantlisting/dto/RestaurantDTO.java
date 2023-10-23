package com.delivery.restaurantlisting.dto;

import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestaurantDTO {


    private int id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;
}
