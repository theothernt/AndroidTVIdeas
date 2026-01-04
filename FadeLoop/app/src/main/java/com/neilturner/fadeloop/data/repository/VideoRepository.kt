package com.neilturner.fadeloop.data.repository

import com.neilturner.fadeloop.data.model.Video

class VideoRepository {
    fun getVideos(): List<Video> {
        return listOf(
            Video(
                url = "https://github.com/glouel/AerialCommunity/releases/download/mw2-1080p-h264/video_inspire_florida_miami_brickell_sunset_00036.1080-h264.mov",
                title = "Miami Sunset",
                durationMs = 30000L
            ),
            Video(
                url = "https://github.com/glouel/AerialCommunity/releases/download/mw2-1080p-h264/video_inspire_california_catalina_00005.1080-h264.mov",
                title = "Catalina Island",
                durationMs = 30000L
            )
        )
    }
}
