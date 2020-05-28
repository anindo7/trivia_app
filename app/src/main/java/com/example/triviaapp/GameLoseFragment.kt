package com.example.triviaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.triviaapp.databinding.FragmentGameLoseBinding

/**
 * A simple [Fragment] subclass.
 */
class GameLoseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameLoseBinding>(inflater, R.layout.fragment_game_lose, container, false)
        binding.tryAgainButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_gameLoseFragment_to_gameFragment)
        )
        return binding.root
    }

}
