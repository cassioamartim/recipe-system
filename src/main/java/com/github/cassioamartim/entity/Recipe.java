package com.github.cassioamartim.entity;

import com.github.cassioamartim.entity.ingredient.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Recipe {

    private final String name;
    private final List<Ingredient> ingredients = new ArrayList<>();

    public void printRecipe() {
        System.out.println("<------------------------------------------------>");

        System.out.println("Nome da receita: " + name);
        System.out.println("Ingredientes (" + ingredients.size() + "):");
        System.out.println();

        int index = 1;
        for (Ingredient ingredient : ingredients) {
            System.out.println("Ingrediente #" + index);
            System.out.println("-> Nome: " + ingredient.getName());
            System.out.println("-> Quantidade: " + ingredient.getQuantity());
            System.out.println("-> Medida: " + ingredient.getMeasure().getName());
            System.out.println();

            index++;
        }

        System.out.println("<------------------------------------------------>");
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(String name) {
        ingredients.removeIf(ingredient -> ingredient.getName().equalsIgnoreCase(name));
    }
}
