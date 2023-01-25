package com.roux.rouxapi.model

import org.bson.types.ObjectId

data class Tag(
    val id: ObjectId = ObjectId.get(),
    var name: String
) {
    fun equals(other: Tag?): Boolean {
        return name.equals(other?.name)
    }
}