package com.example.spotifydupe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference the ImageView and set the profile image
        val animalProfileImage = findViewById<ImageView>(R.id.animalProfileImage)
        animalProfileImage.setImageResource(R.drawable.spotify_profile)

        // Set the username and counts
        val username = findViewById<TextView>(R.id.username)
        val followersCount = findViewById<TextView>(R.id.followersCount)
        val followingCount = findViewById<TextView>(R.id.followingCount)

        // Set data
        username.text = "JohnDoe"  // Replace with dynamic data later if needed
        followersCount.text = "500 Followers"
        followingCount.text = "300 Following"
    }
}
