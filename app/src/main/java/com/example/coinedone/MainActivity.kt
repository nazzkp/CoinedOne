package com.example.coinedone

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatDelegate
import com.androidplot.pie.PieChart
import com.androidplot.pie.Segment
import com.androidplot.pie.SegmentFormatter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        val arrayList = ArrayList<Int>()
        arrayList.add(140)
        arrayList.add(20)
        arrayList.add(30)

        val s1 = Segment("",arrayList.get(0))
        val s2 = Segment("",arrayList.get(1))
        val s3 = Segment("",arrayList.get(2))

        val sf1 = SegmentFormatter(Color.rgb(45, 130, 254))
        val sf2 = SegmentFormatter(Color.rgb(255, 158, 87))
        val sf3 = SegmentFormatter(Color.rgb(47, 237, 81))

        val piec = findViewById<PieChart>(R.id.pieChart)

        piec.addSegment(s1,sf1)
        piec.addSegment(s2,sf2)
        piec.addSegment(s3,sf3)

        val pbar = findViewById<ProgressBar>(R.id.probar)

        val CurrentProgress = 30
        pbar.setProgress(CurrentProgress)
        pbar.setMax(120)

    }
}