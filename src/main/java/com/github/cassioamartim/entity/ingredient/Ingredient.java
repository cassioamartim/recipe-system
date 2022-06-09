package com.github.cassioamartim.entity.ingredient;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Ingredient {

    private final String name;
    private final double quantity;

    private final Measure measure;
}
