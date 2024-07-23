package eu.practice.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerMessengerAdapter(
    private val fm: FragmentManager
) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        // Return the number of tabs
        return 3
    }

    override fun getItem(position: Int): Fragment {

        when (position) {
            0 -> {
                return  ChatFragment()
            }
            1 -> {
                return StatusFragment()
            }
            else -> {
                return CallsFragment()
            }
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> {
                return  "Chats"
            }
            1 -> {
                return "Status"
            }
            else -> {
                return "Calls"
            }
        }
    }
}

