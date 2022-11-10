package com.marc.spinnerfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.marc.spinnerfragments.databinding.FragmentLlistatBinding

class FragmentLlistat : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentLlistatBinding>(inflater,
            R.layout.fragment_llistat,container,false)
        return binding.root
    }

}