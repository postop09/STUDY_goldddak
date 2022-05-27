package test.map.goldddak.mainfragment.tabfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import test.map.goldddak.databinding.ActivityGoldTabFragmentBinding
import test.map.goldddak.databinding.GoldFragmentBinding

class GoldTab_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = ActivityGoldTabFragmentBinding.inflate(inflater, container, false)

        return binding.root

    }

}