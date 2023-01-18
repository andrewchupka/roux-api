package com.roux.rouxapi.repository

import com.roux.rouxapi.model.Recipe
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface RecipeRepository : MongoRepository<Recipe, String> {
    fun findOneById(id: ObjectId) : Recipe
}