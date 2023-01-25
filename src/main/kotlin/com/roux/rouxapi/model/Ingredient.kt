package com.roux.rouxapi.model

import org.bson.types.ObjectId
import java.util.LinkedList

data class Ingredient (
    val id: ObjectId = ObjectId.get(),
    val item: String,
    val amount: Float,
    val descriptors: LinkedList<String> = LinkedList<String>(),
    val unit: String
)