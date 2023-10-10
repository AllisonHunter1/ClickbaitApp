package com.example.clickbaitapp.data

import com.example.clickbaitapp.R
import com.example.clickbaitapp.model.ClickBait

object DataSource {

    val clickBaits = listOf(
        ClickBait(R.drawable.travel,R.string.buzzfeed, R.string.travel, R.string.time1),
        ClickBait(R.drawable.pet, R.string.infoHub, R.string.pet, R.string.time2),
        ClickBait(R.drawable.fantasy, R.string.viralglobe, R.string.fantasy, R.string.time3),
        ClickBait(R.drawable.diy, R.string.buzzfeed, R.string.diy, R.string.time4),
        ClickBait(R.drawable.cartoons, R.string.infoHub, R.string.nostalgia, R.string.time5),
        ClickBait(R.drawable.pizza, R.string.viralglobe, R.string.pizza, R.string.time6),
        ClickBait(R.drawable.celebrity, R.string.buzzfeed, R.string.celebritylookalike, R.string.time7),
        ClickBait(R.drawable.junkfood, R.string.infoHub, R.string.food, R.string.time8),
        ClickBait(R.drawable.soulmate, R.string.buzzfeed, R.string.soulmate, R.string.time9),
        ClickBait(R.drawable.lifehacks,R.string.viralglobe, R.string.lifehack, R.string.time10)
    )
}

