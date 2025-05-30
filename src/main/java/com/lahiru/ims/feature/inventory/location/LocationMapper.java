package com.lahiru.ims.feature.inventory.location;


import com.lahiru.ims.feature.inventory.location.dto.LocationRequestDto;
import com.lahiru.ims.feature.inventory.location.dto.LocationResponseDto;

public class LocationMapper {
    public static LocationResponseDto toDto(Location location) {
        return new LocationResponseDto(location.getId(), location.getName(), location.getAddress());
    }

    public static Location toModel(LocationRequestDto requestDto) {
        return new Location(requestDto.getName(), requestDto.getAddress());
    }
}
