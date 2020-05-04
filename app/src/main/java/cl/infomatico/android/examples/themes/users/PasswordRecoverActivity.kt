package cl.infomatico.android.examples.themes.users

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cl.infomatico.android.examples.themes.R
import kotlinx.android.synthetic.main.activity_user_password_recover.*

class PasswordRecoverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_password_recover)

        // Buttons

        passwordRecover_action.setOnClickListener {
            passwordRecover_emailLayout.error = null
        }
    }
}