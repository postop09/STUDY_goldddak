package test.map.goldddak.mainfragment.tabfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class TablayoutAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {

    private var fragments : ArrayList<GoldTab_Fragment> = ArrayList()

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
       return fragments[position]
    }
}