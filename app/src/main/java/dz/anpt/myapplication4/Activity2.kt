package dz.anpt.myapplication4

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Activity2 : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        sharedPreferences = this.getSharedPreferences("data_app", Context.MODE_PRIVATE)

        val textName: TextView = findViewById(R.id.a2_id_name)
        val texEmail: TextView = findViewById(R.id.a2_id_email)
        val textPassword: TextView = findViewById(R.id.a2_id_password)


        val btnSave : Button = findViewById(R.id.a2_btn_save)

        var name_user = intent.getStringExtra("cleName")
        textName.text  = name_user

        var email_user = intent.getStringExtra("cleEmail")
        texEmail.text = email_user

        var password_user = intent.getStringExtra("clePassword")
        textPassword.text = password_user

        btnSave.setOnClickListener {
            val editor = sharedPreferences.edit()

            editor.putString("data_name",name_user)
            editor.putString("data_email", email_user)
            editor.putString("data_password", password_user)
            editor.putBoolean("isSaved", true)

            editor.apply()

            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()

            intent = Intent(this, Activity3::class.java).also {
                startActivity(it)
            }
        }
    }
}