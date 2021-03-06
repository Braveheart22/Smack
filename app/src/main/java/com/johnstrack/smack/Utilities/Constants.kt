package com.johnstrack.smack.Utilities

/**
 * Created by John on 4/16/2018 at 4:58 PM.
 */

const val BASE_URL = "https://slack-ii.herokuapp.com/v1/"
const val SOCKET_URL = "https://slack-ii.herokuapp.com/"
const val URL_REGISTER = "${BASE_URL}account/register"
const val URL_LOGIN = "${BASE_URL}account/login"
const val URL_CREATE_USER = "${BASE_URL}user/add"
const val URL_GET_USER = "${BASE_URL}user/byEmail/"
const val URL_GET_CHANNELS = "${BASE_URL}channel/"
const val URL_GET_MESSAGES = "${BASE_URL}message/byChannel/"

//Broadcast constants
const val BROADCAST_USER_DATA_CHANGE = "BROADCAST_USER_DATA_CHANGE"