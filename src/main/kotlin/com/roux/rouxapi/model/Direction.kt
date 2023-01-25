package com.roux.rouxapi.model

data class Direction(
    var order: Int,
    var text: String,

    // TODO: Need to figure out some kind of facility to link ingredients / supply items into the directions
) {
}