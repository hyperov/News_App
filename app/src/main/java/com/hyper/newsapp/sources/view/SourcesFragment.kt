package com.hyper.newsapp.sources.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hyper.newsapp.databinding.FragmentSourcesBinding
import com.hyper.newsapp.sources.viewmodel.SourcesViewModel

class SourcesFragment : Fragment() {

    private var _binding: FragmentSourcesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val sourcesViewModel =
            ViewModelProvider(this).get(SourcesViewModel::class.java)

        _binding = FragmentSourcesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSources
        sourcesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}