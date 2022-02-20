package com.example.telegramuix.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegramuix.R
import com.example.telegramuix.model.Theme
import com.example.telegramuix.adapter.ThemeAdapter

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class AppearanceFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    lateinit var root:View
    lateinit var recyclerView_theme: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        root = inflater.inflate(R.layout.fragment_appearance, container, false)

        recyclerView_theme = root.findViewById(R.id.recylerView_theme)

        initViews()
        return root
    }

    fun initViews(){
        initHorizantal()

        var themes = prepareThemeList()

        refreshAdapter(themes)
    }

    private fun refreshAdapter(themes: ArrayList<Theme>) {
        var adapter = ThemeAdapter(themes)
        recyclerView_theme.adapter = adapter
    }

    private fun prepareThemeList(): ArrayList<Theme> {
        var themes = ArrayList<Theme>()
        themes.add(Theme(R.drawable.img_9, R.drawable.ic_home_svgrepo_com))
        themes.add(Theme(R.drawable.img_8, R.drawable.ic_chicken_svgrepo_com))
        themes.add(Theme(R.drawable.img_7, R.drawable.ic_snowman_svgrepo_com))
        themes.add(Theme(R.drawable.img_6, R.drawable.ic_diamond_svgrepo_com__1_))
        themes.add(Theme(R.drawable.img_5, R.drawable.ic_home_svgrepo_com))
        themes.add(Theme(R.drawable.img_4, R.drawable.ic_man_teacher_svgrepo_com))
        themes.add(Theme(R.drawable.img_3, R.drawable.ic_heart_svgrepo_com))
        themes.add(Theme(R.drawable.img_2, R.drawable.ic_christmas_tree_svgrepo_com))
        themes.add(Theme(R.drawable.img_1, R.drawable.ic_game_controller_svgrepo_com))

        return themes
    }

    @SuppressLint("WrongConstant")
    fun initHorizantal(){
        recyclerView_theme.layoutManager = LinearLayoutManager(requireContext(),  LinearLayout.HORIZONTAL, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AppearanceFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}