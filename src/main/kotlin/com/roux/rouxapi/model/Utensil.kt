package com.roux.rouxapi.model

import org.bson.types.ObjectId

data class Utensil (
    val id : ObjectId = ObjectId.get(),
    var name: String,
    var size: String,
    var purpose: String
)