package cl.infomatico.android.examples.themes.users

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import cl.infomatico.android.examples.themes.R
import kotlinx.android.synthetic.main.activity_user_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        // RadioGroup

        var genderValue: String? = null
        profile_gender.setOnCheckedChangeListener { _, i: Int ->
            when (i) {
                R.id.profile_gender_male ->
                    genderValue = "m"
                R.id.profile_gender_female ->
                    genderValue = "f"
            }
        }

        Log.d("genderValue", genderValue!!)

        // Buttons

        profile_action.setOnClickListener {
            profile_names_layout.error = "Error"
            profile_surname_first_layout.error = null
        }
    }
}
