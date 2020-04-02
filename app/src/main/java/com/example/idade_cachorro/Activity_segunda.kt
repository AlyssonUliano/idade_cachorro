package com.example.idade_cachorro


import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_segunda.*


@ExperimentalUnsignedTypes
class Activity_segunda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val dados: Bundle? = intent.extras

        val idade = dados?.getInt("idade")
        text_idade.text = "Seu cão tem: " + idade.toString() + " anos humanos"

        var id = idade?.toUInt()

        id?.toInt()?.let { seekBar.setProgress(it) }


        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

    }
}
