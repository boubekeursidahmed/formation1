package dz.anpt.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)


        val textName: TextView = findViewById(R.id.a2_id_name)
        val texEmail: TextView = findViewById(R.id.a2_id_email)
        val textPassword: TextView = findViewById(R.id.a2_id_password)

        textName.text = intent.getStringExtra("cleName")
        texEmail.text = intent.getStringExtra("cleEmail")
        textPassword.text = intent.getStringExtra("clePassword")

    }
}