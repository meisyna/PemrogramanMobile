package com.meisy.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//mengambil data dari file string dan drawable
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)