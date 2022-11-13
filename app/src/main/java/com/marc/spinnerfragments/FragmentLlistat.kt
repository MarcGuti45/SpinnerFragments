package com.marc.spinnerfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.marc.spinnerfragments.databinding.FragmentLlistatBinding

class FragmentLlistat : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentLlistatBinding>(inflater,
            R.layout.fragment_llistat,container,false)
        binding.button.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.action_fragmentLlistat2_to_fragmentTornar2)}
        return binding.root
    }

}