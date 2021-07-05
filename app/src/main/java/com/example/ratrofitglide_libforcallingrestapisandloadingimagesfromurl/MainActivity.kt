package com.example.ratrofitglide_libforcallingrestapisandloadingimagesfromurl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.ratrofitglide_libforcallingrestapisandloadingimagesfromurl.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private  var bindind:ActivityMainBinding? = null
    private var url = "https://www.pikpng.com/pngl/m/85-856889_bugs-makes-a-silly-face-even-though-hes.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindind = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(bindind!!.root)




        //this app is test app for glide library

        bindind!!.button.setOnClickListener()
        {

            // button couldnt  load the image cause  the internet connection is not given in the maniifest file

            Toast.makeText(this, "hehe , button is working. wait Im loading the image.  ", Toast.LENGTH_SHORT).show()

            Glide.with(applicationContext).load(url).placeholder(R.drawable.temp).into(bindind!!.imageview)

        }



    }
}