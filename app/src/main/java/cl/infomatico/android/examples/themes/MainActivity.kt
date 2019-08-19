package cl.infomatico.android.examples.themes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: TextInputEditText = findViewById(R.id.editText)

        val a: MaterialButton = findViewById(R.id.button)
        a.setOnClickListener { editText.error = "Error" }
    }
}
