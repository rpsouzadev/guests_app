package com.example.guests.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.guests.repository.GuestRepository

class GuestsFormViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = GuestRepository.getInstance(application)

}