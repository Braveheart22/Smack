package com.johnstrack.smack.Model

/**
 * Created by John on 4/24/2018 at 4:38 PM.
 */
class Channel (val name: String, val description: String, val id: String){

    override fun toString(): String {
        return "#$name"
    }

}