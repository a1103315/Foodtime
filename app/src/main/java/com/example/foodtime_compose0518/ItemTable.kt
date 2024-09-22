package com.example.foodtime_compose0518

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item_table")
data class ItemTable(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "item_id")
    val itemId: Int = 0,

    @ColumnInfo(name = "holiday_id")
    val holidayId: Int = 0,

    @ColumnInfo(name = "number")
    var number: Int = 0
)