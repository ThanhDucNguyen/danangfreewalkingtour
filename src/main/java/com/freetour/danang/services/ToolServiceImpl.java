package com.freetour.danang.services;

import com.freetour.danang.dto.ElementDTO;
import org.springframework.stereotype.Service;

@Service
public class ToolServiceImpl implements ToolService{
    @Override
    public ElementDTO addCode(ElementDTO elementDTO) {
        elementDTO.setCode(elementDTO.getCode());
        return elementDTO;
    }
    public Object showCode
}
