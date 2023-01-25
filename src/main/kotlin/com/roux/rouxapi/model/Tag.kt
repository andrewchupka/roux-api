package com.roux.rouxapi.model

import org.bson.types.ObjectId

data class Tag(
    var id: ObjectId = ObjectId.get(),
    var name: String
) {


    fun equals(other: Tag?): Boolean {
        return name.equals(other?.name)
    }
}