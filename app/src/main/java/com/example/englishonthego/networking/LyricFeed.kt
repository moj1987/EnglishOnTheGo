package com.example.englishonthego.networking

import com.google.gson.annotations.SerializedName

data class LyricFeed (@SerializedName("result") var lyricResult: Lyric){}