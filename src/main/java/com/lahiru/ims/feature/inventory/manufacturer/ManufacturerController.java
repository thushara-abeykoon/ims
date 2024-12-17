package com.lahiru.ims.feature.inventory.manufacturer;


import com.lahiru.ims.common.controller.GenericController;
import com.lahiru.ims.common.dto.PaginationResponse;
import com.lahiru.ims.common.dto.StandardReponse;
import com.lahiru.ims.feature.inventory.manufacturer.dto.ManufacturerRequestDto;
import com.lahiru.ims.feature.inventory.manufacturer.dto.ManufacturerResponseDto;
import com.lahiru.ims.feature.inventory.model.dto.ModelResponseDto;
import com.lahiru.ims.feature.inventory.status.dto.StatusResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ManufacturerController implements GenericController<ManufacturerRequestDto, ManufacturerResponseDto> {
    @Override
    public ResponseEntity<PaginationResponse<ManufacturerResponseDto>> getAllByPageWise(int page, int pageSize) throws Exception {
        new ModelResponseDto(1, "name");
        return null;
    }

    @Override
    public ResponseEntity<StandardReponse<List<ManufacturerResponseDto>>> getAll() throws Exception {
        return null;
    }

    @Override
    public ResponseEntity<StandardReponse<ManufacturerResponseDto>> createOne(ManufacturerRequestDto manufacturerRequestDto) throws Exception {
        return null;
    }

    @Override
    public ResponseEntity<StandardReponse<ManufacturerResponseDto>> updateOne(int id, ManufacturerRequestDto manufacturerRequestDto) throws Exception {
        return null;
    }

    @Override
    public ResponseEntity<StandardReponse<ManufacturerResponseDto>> deleteOne(int id) throws Exception {
        return null;
    }
}
