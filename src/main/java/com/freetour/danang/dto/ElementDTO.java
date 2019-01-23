package com.freetour.danang.dto;

public class ElementDTO {
    String code;

    @Override
    public String toString() {
        return "ElementDTO{" +
                "code='" + code + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
