package cl.infomatico.android.examples.themes.users

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cl.infomatico.android.examples.themes.R
import kotlinx.android.synthetic.main.activity_user_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)

        // Buttons

        login_action.setOnClickListener {
            goMain()
        }

        login_register.setOnClickListener {
            goRegister()
        }

        login_passwordRecover.setOnClickListener {
            goPasswordRecover()
        }

        login_skip.setOnClickListener {
            goMain()
        }
    }

    private fun goMain() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }

    private fun goRegister() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    private fun goPasswordRecover() {
        val intent = Intent(this, PasswordRecoverActivity::class.java)
        startActivity(intent)
    }
}