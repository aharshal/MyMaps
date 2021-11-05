package com.aharshal.mymaps.models

import java.io.Serializable

data class Place(val title:String, val description:String, val latitude:Double, val longitud:Double) : Serializable