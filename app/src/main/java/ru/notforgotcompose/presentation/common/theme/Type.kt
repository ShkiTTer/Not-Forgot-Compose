package ru.notforgotcompose.presentation.common.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.notforgotcompose.R

private val nunitoRegular = FontFamily(Font(resId = R.font.nunito_regular))
private val nunitoBold = FontFamily(Font(resId = R.font.nunito_bold, weight = FontWeight.Bold))

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = nunitoBold,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
    ),
    h2 = TextStyle(
        fontFamily = nunitoBold,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    h3 = TextStyle(
        fontFamily = nunitoRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    h4 = TextStyle(
        fontFamily = nunitoBold,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),
    body1 = TextStyle(
        fontFamily = nunitoRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = nunitoRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = nunitoRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    button = TextStyle(
        fontFamily = nunitoRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = nunitoRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)