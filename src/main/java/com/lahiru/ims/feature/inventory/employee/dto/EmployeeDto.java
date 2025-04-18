package com.lahiru.ims.feature.inventory.employee.dto;

import com.lahiru.ims.common.dto.feature.BasicInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class EmployeeDto extends BasicInfo {
    public EmployeeDto(Integer id, String name) {
        super(id, name);
    }
}
