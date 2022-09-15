package com.ravi.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.ravi.todocompose.ui.theme.HighPriorityColor
import com.ravi.todocompose.ui.theme.LowPriorityColor
import com.ravi.todocompose.ui.theme.MediumPriorityColor
import com.ravi.todocompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}