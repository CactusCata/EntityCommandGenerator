package fr.cactuscata.entitycommandgenerator.tags.list.villager;

import fr.cactuscata.entitycommandgenerator.utils.Serializable;
import fr.cactuscata.entitycommandgenerator.utils.SerializableList;

public class Offers implements Serializable {

	private final SerializableList<Recipe> recipes = new SerializableList<>();

	public Offers(Recipe recipe, Recipe... recipes) {
		this.recipes.add(recipe);
		this.recipes.addAll(recipes);
	}

	@Override
	public String serialize() {
		return String.valueOf(this.getRecipes());
	}

	public SerializableList<Recipe> getRecipes() {
		return recipes;
	}

}
