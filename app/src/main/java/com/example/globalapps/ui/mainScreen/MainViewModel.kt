package com.example.globalapps.ui.mainScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.globalapps.domain.useCase.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCase: UseCase
) : ViewModel() {

    private var _activity: MutableLiveData<String> = MutableLiveData("")
    var activity: LiveData<String> = _activity

    init {
        getActivity()
    }

    private fun getActivity() {
        viewModelScope.launch(Dispatchers.IO) {
            _activity.postValue(
                useCase.getActivity().body()?.activity ?: throw IllegalStateException("not info")
            )
        }
    }
}