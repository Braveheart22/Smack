package com.johnstrack.smack.Controller

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.johnstrack.smack.R
import com.johnstrack.smack.Services.AuthService
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {

    var userAvatar = "profileDefault"
    var avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar (view: View) {
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt (28)

        userAvatar = if (color == 0) {
            "light$avatar"
        } else {
            "dark$avatar"
        }

        val resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
        createAvatarImageView.setImageResource(resourceId)
    }

    fun createUserClicked (view: View) {
        val email = createEmailTxt.toString()
        val password = createPasswordTxt.toString()

        AuthService.registerUser(this, email, password) {registerSuccess ->
            if (registerSuccess) {
                AuthService.loginUser(this, email, password) {loginSuccess ->
                    if (loginSuccess) {

                    }
                }
            }
        }
    }

    fun generateColorClicked (view: View) {
        val random = Random ()
        val r = random.nextInt (255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        createAvatarImageView.setBackgroundColor(Color.rgb(r, g, b))

        val savedR = r.toDouble()/255
        val savedG = g.toDouble()/255
        val savedB = b.toDouble()/255

        avatarColor = "[$savedR, $savedG, $savedB, 1]"
    }
}