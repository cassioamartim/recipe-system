package com.github.cassioamartim;

import com.github.cassioamartim.entity.Recipe;
import com.github.cassioamartim.entity.ingredient.Ingredient;
import com.github.cassioamartim.entity.ingredient.Measure;

/**
 * @author Cassio Martim
 * Projeto realizado em 09/06/2022.
 */
public class Program {

    public static void main(String[] args) {
        // Criando uma nova receita <- Lasanha ->

        // Instanciando o objeto Recipe
        Recipe recipe = new Recipe("Lasanha");

        // Adicionando novos ingredientes para fazer nossa Lasanha
        recipe.addIngredient(new Ingredient("Massa de Lasanha", 1, Measure.UN));
        recipe.addIngredient(new Ingredient("Presunto", 500, Measure.GR));
        recipe.addIngredient(new Ingredient("Queijo Mussarela", 500, Measure.GR));
        recipe.addIngredient(new Ingredient("Carne Moída", 500, Measure.GR));
        recipe.addIngredient(new Ingredient("Massa de Tomate", 1, Measure.UN));

        // Imprimindo na sua tela a receita e seus respectivos ingredientes
        recipe.printRecipe();

        // Agora vamos tentar remover algum ingrediente pelo nome e ver no que vai dar
        recipe.removeIngredient("Massa de Lasanha");

        // Imprimir na tela
        recipe.printRecipe();

        // Pronto, funcionando e bonitinho, obrigado por vir até aqui!
    }
}
