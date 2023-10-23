package com.delivery.restaurantlisting.mapper;

import com.delivery.restaurantlisting.dto.RestaurantDTO;
import com.delivery.restaurantlisting.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDto);
    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
