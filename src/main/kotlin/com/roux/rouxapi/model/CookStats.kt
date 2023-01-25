package com.roux.rouxapi.model

import java.time.LocalDateTime

data class CookStats (
    var timesCooked: Int,
    var lastMade: LocalDateTime?
)