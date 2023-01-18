package com.roux.rouxapi.controller

import com.roux.rouxapi.model.Recipe
import com.roux.rouxapi.model.requests.CreateRecipe
import com.roux.rouxapi.model.requests.UpdateRecipe
import com.roux.rouxapi.repository.RecipeRepository
import com.roux.rouxapi.util.mapUpdateRequestToRecipe
import org.apache.coyote.Response
import org.bson.types.ObjectId
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/recipes")
class RecipeController (
        private val recipesRepository: RecipeRepository
){

    @GetMapping
    fun getAllRecipes(): ResponseEntity<List<Recipe>> {
        val recipes = recipesRepository.findAll()
        return ResponseEntity.ok(recipes)
    }

    @GetMapping("/{id}")
    fun getRecipeById( @PathVariable("id") id: String) : ResponseEntity<Recipe> {
        val recipe = recipesRepository.findOneById(ObjectId(id))
        return ResponseEntity.ok(recipe)
    }

    @PostMapping
    fun createRecipe(@RequestBody request: CreateRecipe): ResponseEntity<Recipe> {
        val recipe = recipesRepository.save(
                Recipe (
                        name = request.name,
                        description = request.description
                )
        )
        return ResponseEntity(recipe, HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun updateRecipe(@PathVariable id: String, @RequestBody request: UpdateRecipe): ResponseEntity<Recipe> {
        var recipe = recipesRepository.findOneById(ObjectId(id))
        recipe = mapUpdateRequestToRecipe(request, recipe)
        recipesRepository.save(recipe)
        return ResponseEntity.ok(recipe)
    }

    @DeleteMapping("/{id}")
    fun deleteRecipe(@PathVariable id: String): ResponseEntity<Recipe> {
        var recipe = recipesRepository.findOneById(ObjectId(id))
        recipesRepository.delete(recipe)
        return ResponseEntity.ok(recipe)
    }

}