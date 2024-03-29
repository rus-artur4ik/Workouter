package com.rus_artur4ik.workouter.common

import com.rus_artur4ik.workouter.Day
import com.rus_artur4ik.workouter.Day.FRIDAY
import com.rus_artur4ik.workouter.Day.MONDAY
import com.rus_artur4ik.workouter.Day.SATURDAY
import com.rus_artur4ik.workouter.Day.SUNDAY
import com.rus_artur4ik.workouter.Day.THURSDAY
import com.rus_artur4ik.workouter.Day.TUESDAY
import com.rus_artur4ik.workouter.Day.WEDNESDAY
import com.rus_artur4ik.workouter.R

fun Day.fullNameRes(): Int {
    return when(this) {
        MONDAY -> R.string.monday
        TUESDAY -> R.string.tuesday
        WEDNESDAY -> R.string.wednesday
        THURSDAY -> R.string.thursday
        FRIDAY -> R.string.friday
        SATURDAY -> R.string.saturday
        SUNDAY -> R.string.sunday
    }
}

fun Day.shortNameRes(): Int {
    return when(this) {
        MONDAY -> R.string.monday_short
        TUESDAY -> R.string.tuesday_short
        WEDNESDAY -> R.string.wednesday_short
        THURSDAY -> R.string.thursday_short
        FRIDAY -> R.string.friday_short
        SATURDAY -> R.string.saturday_short
        SUNDAY -> R.string.sunday_short
    }
}