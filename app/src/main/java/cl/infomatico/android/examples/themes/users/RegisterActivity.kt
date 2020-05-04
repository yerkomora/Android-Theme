package cl.infomatico.android.examples.themes.users

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import cl.infomatico.android.examples.themes.R
import kotlinx.android.synthetic.main.activity_user_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_register)

        var genderValue: String? = null
        register_gender.setOnCheckedChangeListener { _, i: Int ->
            when (i) {
                R.id.register_genderMale ->
                    genderValue = "m"
                R.id.register_genderFemale ->
                    genderValue = "f"
            }
        }


        Log.d("genderValue", genderValue!!)

        // Buttons

        register_action.setOnClickListener {
            register_namesLayout.error = "Error"
            register_surnameFirstLayout.error = null
        }
    }
}