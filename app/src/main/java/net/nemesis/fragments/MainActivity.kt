package net.nemesis.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.nemesis.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentFreezer = FreezerFragment()

        val parameters = Bundle()
        parameters.putSerializable("phase", FreezerPhase.Phase3)
        fragmentFreezer.arguments = parameters

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_freezer, fragmentFreezer)
        transaction.commit()
    }
}