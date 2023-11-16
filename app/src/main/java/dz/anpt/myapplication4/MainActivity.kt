package dz.anpt.myapplication4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputTextName:EditText = findViewById(R.id.id_name)
        val inputTextEmail:EditText = findViewById(R.id.id_email)
        val inputPassword: EditText = findViewById(R.id.id_password)

        val btnValidate : Button = findViewById(R.id.button)

        //btnValidate.isEnabled = true

        btnValidate.setOnClickListener {
            var name = inputTextName.text.toString()
            var email = inputTextEmail.text.toString()
            var password = inputPassword.text.toString()

            Toast.makeText(this, "Enregistrement effectué", Toast.LENGTH_SHORT).show()

            intent = Intent(this, Activity2::class.java)
            intent.putExtra("cleName", name)
            intent.putExtra("cleEmail", email)
            intent.putExtra("clePassword", password)

            startActivity(intent)

        }

    }
}