package com.marc.spinnerfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.marc.spinnerfragments.databinding.FragmentIniBinding
import com.marc.spinnerfragments.databinding.FragmentTornarBinding

class FragmentTornar : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentTornarBinding>(inflater,
            R.layout.fragment_tornar,container,false)
        binding.button5.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.action_fragmentTornar2_to_fragmentLlistat2)}
        return binding.root
    }

}