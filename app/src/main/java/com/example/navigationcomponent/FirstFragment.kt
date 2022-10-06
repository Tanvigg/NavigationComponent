package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation


private const val ARG_PARAM2 = "param2"

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_first, container, false)
        view.findViewById<TextView>(R.id.textView1).setOnClickListener{Navigation.findNavController(view).navigate(R.id.navigationToSecondFragment)}
        return view
    }
}