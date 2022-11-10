package com.marc.spinnerfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.marc.spinnerfragments.databinding.FragmentIniBinding


class FragmentIni : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentIniBinding>(inflater,
            R.layout.fragment_ini,container,false)
        binding.button4.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.action_fragmentIni2_to_fragmentLlistat2)}
        return binding.root
    }
}