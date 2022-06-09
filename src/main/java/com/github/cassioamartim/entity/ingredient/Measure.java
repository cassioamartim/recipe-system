package com.github.cassioamartim.entity.ingredient;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Measure {

    KG("Quilo"),
    LT("Litros"),
    GR("Gramas"),
    UN("Unidade"),
    XI("Xícara"),
    CX("Colher de chá"),
    CS("Colher de sopa");

    String name;
}
