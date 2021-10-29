package com.dhruv.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dhruv.affirmations.adapter.ItemAdapter
import com.dhruv.affirmations.data.DataSource
import com.dhruv.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = DataSource().loadAffirmations()
        binding.viewPager.adapter = ItemAdapter(this,myDataset)

    }
}