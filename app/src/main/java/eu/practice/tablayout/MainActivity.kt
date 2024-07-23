package eu.practice.tablayout



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tab)
        viewPager = findViewById(R.id.viewPage)

        // Set up the ViewPager adapter
        val adapter = ViewPagerMessengerAdapter(supportFragmentManager)
        viewPager.adapter = adapter

        // Connect the TabLayout to the ViewPager
        tabLayout.setupWithViewPager(viewPager)
    }
}

