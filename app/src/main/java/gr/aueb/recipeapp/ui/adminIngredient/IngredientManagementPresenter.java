package gr.aueb.recipeapp.ui.adminIngredient;

import gr.aueb.recipeapp.dao.IngredientDao;
import gr.aueb.recipeapp.dao.UserDao;
import gr.aueb.recipeapp.domain.Ingredient;
import gr.aueb.recipeapp.domain.User;

public class IngredientManagementPresenter {

    IngredientDao ingredientDao = new IngredientDao();

    public Ingredient registerIngredient(String name, int calories){
        for (Ingredient i : IngredientDao.allIngredients){
            if (i.getName().equals(name)){
                return null;
            }
        }
        return ingredientDao.registerIngredient(name, calories);
    }

    public void editIngredient(String oldName, String newName, int newCalories){
        ingredientDao.editIngredient(oldName, newName, newCalories);
    }

}