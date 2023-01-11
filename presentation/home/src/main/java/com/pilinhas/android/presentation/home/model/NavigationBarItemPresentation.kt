package com.vestibulario.presentation.home.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.vestibulario.core.resources.R

enum class NavigationBarItemPresentation(
    val route: String,
    @DrawableRes val iconResId: Int,
    @StringRes val iconContentDescriptionResId: Int,
    @StringRes val titleResId: Int,
) {

    HOME(route = "home", iconResId = R.drawable.ic_home, iconContentDescriptionResId = R.string.content_description_home, titleResId = R.string.title_home),
    SEARCH(route = "search", iconResId = R.drawable.ic_search, iconContentDescriptionResId = R.string.content_description_search, titleResId = R.string.title_search),
    FEED(route = "feed", iconResId = R.drawable.ic_feed, iconContentDescriptionResId = R.string.content_description_feed, titleResId = R.string.title_feed),
    GOALS(route = "goals", iconResId = R.drawable.ic_goals, iconContentDescriptionResId = R.string.content_description_goals, titleResId = R.string.title_goals),
    PROFILE(route = "profile", iconResId = R.drawable.ic_profile, iconContentDescriptionResId = R.string.content_description_profile, titleResId = R.string.title_profile);

}