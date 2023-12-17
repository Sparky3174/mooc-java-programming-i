/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.recipes = new ArrayList<Recipe>();
    }

    public void Start() {
        readFile();
        readCommands(scanner);

    }

    public void readCommands(Scanner scanner) {
        boolean isProgramRunning = true;
        while (isProgramRunning) {
            printCommands();
            String userin = scanner.nextLine();
            switch (userin) {
                case "list":
                    for (Recipe recipe : this.recipes) {
                        System.out.println(recipe.toString());
                    }
                    break;
                case "stop":
                    isProgramRunning = false;
                    break;
                case "find name":
                    System.out.println("Searched word: ");
                    String word = scanner.nextLine();
                    findRecipeByName(word);
                    break;
                case "find cooking time":
                    System.out.println("Max cooking time: ");
                    int maxCookingTime = Integer.valueOf(scanner.nextLine());
                    findRecipeByCookingTime(maxCookingTime);
                    break;
                case "find ingredient":
                    System.out.println("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    findRecipeByIngredient(ingredient);
                    break;
            }
        }
    }

    public void printCommands() {
        StringBuilder commands = new StringBuilder();
        commands.append("Commands:\n");
        commands.append("list - lists the recipes\n");
        commands.append("stop - stops the program\n");
        commands.append("find name - searches recipes by name\n");
        commands.append("find cooking time - searches recipes by cooking time\n");
        commands.append("find ingredient - searches recipes by ingredient");
        System.out.println(commands.toString());

    }

    //while the file still has lines
    //until the reader hits a blank line
    //add each line as a string to the list
    //then make a recipe from the list where i 1 is the name i 2 is the cooktime, and i 3+ are the ingredients
    //add recipe to recipes ArrayList
    public void readFile() {
        System.out.println("File to read: ");
        String file = scanner.nextLine();

        ArrayList<String> recipeTemplate = new ArrayList<>();
        ArrayList<String> ingredients = new ArrayList<>();
        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();
                if (line.equals("") || !fileReader.hasNextLine()) {
                    Recipe recipe = new Recipe(recipeTemplate.get(0), Integer.valueOf(recipeTemplate.get(1)), new ArrayList(ingredients));
                    recipes.add(recipe);
                    recipeTemplate.clear();
                    ingredients.clear();
                    continue;
                } else if (recipeTemplate.size() > 1) {
                    ingredients.add(line);
                    continue;
                }
                recipeTemplate.add(line);
            }
        } catch (Exception e) {
            System.out.println("Wuh woh. " + e.getMessage());
            System.out.println("Current list: " + recipeTemplate.toString());
        }

    }

    public void findRecipeByName(String name) {
        ArrayList<Recipe> recipes = new ArrayList();
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)) {
                recipes.add(recipe);
            }
        }

        for (Recipe recipe : recipes) {
            System.out.println(recipe.toString());
        }
    }

    public void findRecipeByCookingTime(int cookingTime) {
        ArrayList<Recipe> recipes = new ArrayList();
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                recipes.add(recipe);
            }
        }

        for (Recipe recipe : recipes) {
            System.out.println(recipe.toString());
        }
    }

    public void findRecipeByIngredient(String ingredient) {
        ArrayList<Recipe> recipes = new ArrayList();
        for (Recipe recipe : this.recipes) {
            for (String checkIngredient : recipe.getIngredients()) {
                if (checkIngredient.equals(ingredient)) {
                    recipes.add(recipe);
                }
            }
        }

        for (Recipe recipe : recipes) {
            System.out.println(recipe.toString());
        }
    }

}
