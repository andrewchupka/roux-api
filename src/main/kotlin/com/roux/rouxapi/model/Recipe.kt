package com.roux.rouxapi.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Recipe (
        @Id
        val id: ObjectId = ObjectId.get(),
        var name: String,
        var description: String,
        var createdDate: LocalDateTime = LocalDateTime.now(),
        var modifiedDate: LocalDateTime = LocalDateTime.now(),
        var tags: List<Tag>? = null,
        var recipeTime: CookTime,
        var ingredients: List<Ingredient>,
        var supplies: List<Utensil>,
        var directions: List<Direction>,
        var cookStats: CookStats = CookStats(0, null)
)