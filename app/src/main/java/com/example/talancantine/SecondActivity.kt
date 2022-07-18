package com.example.talancantine
import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_second.*
import java.text.SimpleDateFormat
import java.util.*


class SecondActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")

    var formatDate= SimpleDateFormat("dd MMMM YYYY",Locale.US)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        // date de la creation de menu du jour
        button_date_picked.setOnClickListener(View.OnClickListener {
            val getDate : Calendar = Calendar.getInstance()
            val datepicker= DatePickerDialog(this, android.R.style.Theme_Holo_Light_Dialog_MinWidth, DatePickerDialog.OnDateSetListener{ datepicker,i,i2,i3->


                val  selectDate: Calendar = Calendar.getInstance()
                selectDate.set(Calendar.YEAR,i)
                selectDate.set(Calendar.MONTH,i2)
                selectDate.set(Calendar.DAY_OF_MONTH,i3)
                val date : String =formatDate.format(selectDate.time)
                Toast.makeText(this," Date : "+date, Toast.LENGTH_SHORT).show()
                txt_view_date_picked.text=date

            }, getDate.get(Calendar.YEAR), getDate.get(Calendar.MONTH), getDate.get(Calendar.DAY_OF_MONTH))
            datepicker.show()
        })





        }
}

