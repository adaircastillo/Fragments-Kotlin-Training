package net.nemesis.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.nemesis.fragments.databinding.FragmentFreezerBinding

class FreezerFragment : Fragment() {

    private lateinit var binding: FragmentFreezerBinding

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View {
        binding = FragmentFreezerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val phase = arguments?.getSerializable("phase") as? FreezerPhase

        if(phase != null){

            val image = when(phase) {
                FreezerPhase.Phase0 -> R.drawable.img_freezer
                FreezerPhase.Phase1 -> R.drawable.img_freezer_f1
                FreezerPhase.Phase2 -> R.drawable.img_freezer_f2
                FreezerPhase.Phase3 -> R.drawable.img_freezer_f3
                else -> R.drawable.img_freezer
            }
            binding.freezerImage.setImageResource(image)
        }

    }

}