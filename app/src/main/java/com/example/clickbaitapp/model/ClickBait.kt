package com.example.clickbaitapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ClickBait(
    @DrawableRes val imageResourceId: Int,
    @StringRes val publisher: Int,
    @StringRes val stringResourceId1: Int,
    @StringRes val stringResourceId2: Int,
)
