package com.example.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ContactList = mutableListOf<ContactList>()
        ContactList.add(ContactList(R.drawable.sample_0, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_1, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_2, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_3, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_4, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_0, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_1, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_2, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_3, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_4, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_0, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_1, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_2, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_3, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))
        ContactList.add(ContactList(R.drawable.sample_4, "양윤혁", "010-7115-7244", R.drawable.baseline_star_24))


        binding.recyclerView.adapter = MyAdapter(ContactList)

        val adapter = MyAdapter(ContactList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}