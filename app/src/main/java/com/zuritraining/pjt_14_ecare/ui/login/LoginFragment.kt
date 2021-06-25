package com.zuritraining.pjt_14_ecare.ui.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.zuritraining.pjt_14_ecare.R
import com.zuritraining.pjt_14_ecare.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    companion object {}

    private lateinit var viewModel: LoginViewModel
    private lateinit var  binding:FragmentLoginBinding
    private lateinit var  dialogView:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonLogin.setOnClickListener {
           // findNavController().navigate(R.id.action_loginFragment_to_nav_home)
           showCongratulationsDialog()
        }
    }

    private fun showCongratulationsDialog() {

        val congratulationsAlertDialog: AlertDialog? = activity?.let {
            val builder = AlertDialog.Builder(it)
            // Set other dialog properties
            // Get the layout inflater
            val inflater = requireActivity().layoutInflater;
            dialogView = inflater.inflate(R.layout.dialog_congratulations, null)
            builder.setView(dialogView)
            // Create the AlertDialog
            builder.create()
        }

        val cancelButton = dialogView.findViewById<Button>(R.id.button_close)
        cancelButton.setOnClickListener {
            congratulationsAlertDialog?.cancel()
        }
        congratulationsAlertDialog?.show()

    }
}