package com.example.flixsterlist

import com.google.gson.annotations.SerializedName

class Movie {

    @SerializedName("rank")
    var rank = 0

    @JvmField
    @SerializedName("title")
    var title: String? = null



    @SerializedName("book_image")
    var movieImageUrl: String? = null



    @SerializedName("description")
    var description: String? = null


}
