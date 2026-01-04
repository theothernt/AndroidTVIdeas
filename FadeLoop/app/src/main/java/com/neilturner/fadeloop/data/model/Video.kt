package com.neilturner.fadeloop.data.model

data class Video(
    val url: String,
    val title: String = "",
    val durationMs: Long? = null
)
