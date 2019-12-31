package com.example.insurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, "Position = " + position , Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner.onItemSelectedListener = this
        buttonCakulate.setOnClickListener{
            calculatePremium()
        }

    }
    private fun calculatePremium(){
        val position = spinner.selectedItemPosition
        val gender = radiogroupgender.checkedRadioButtonId
        if (position == 0){
            //
        }else

            if(gender == R.id.radioButtonMale){
                //
            }

    }
}
