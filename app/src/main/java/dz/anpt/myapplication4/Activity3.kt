package dz.anpt.myapplication4

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Activity3 : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        sharedPreferences = this.getSharedPreferences("data_app", Context.MODE_PRIVATE)

        val txtName = findViewById<TextView>(R.id.a3_txt_name)
        val txtEmail = findViewById<TextView>(R.id.a3_txt_email)
        val txtIsSaved = findViewById<TextView>(R.id.a3_txt_issaved)


        if(sharedPreferences.getBoolean("isSaved", false)){
            txtName.text = sharedPreferences.getString("data_name", "no_data_name")
            txtIsSaved.text = sharedPreferences.getBoolean("isSaved", false).toString()
            txtEmail.text = sharedPreferences.getString("data_email", "no_data_ email")
        } else{
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show()
        }

    }
}