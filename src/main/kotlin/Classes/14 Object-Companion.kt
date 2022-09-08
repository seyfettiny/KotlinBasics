package Classes

interface HomeFragmentPresenter{
    fun navigate()
}

class HomeFragment {
    var color = "Red"

    //  Can be named and can have inheritance
    companion object Named: HomeFragmentPresenter {
        private var homeFragment: HomeFragment? = null
        fun getInstance(): HomeFragment {
            if (homeFragment == null) {
                homeFragment = HomeFragment()
            }
            return homeFragment!!
        }

        override fun navigate() {
            println("Navigating")
        }
    }

}

fun main() {
    HomeFragment().color
    val homeFragment = HomeFragment.getInstance()
    homeFragment.color = "Blue"
}