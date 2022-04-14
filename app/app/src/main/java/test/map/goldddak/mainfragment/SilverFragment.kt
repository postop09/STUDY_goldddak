package test.map.goldddak.mainfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import test.map.goldddak.databinding.SilverFragmentBinding

class SilverFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = SilverFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }
}