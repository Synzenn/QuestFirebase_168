package com.example.firebase2jan26.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firebase2jan26.modeldata.DetailSiswa
import com.example.firebase2jan26.modeldata.UIStateSiswa
import com.example.firebase2jan26.modeldata.toDataSiswa
import com.example.firebase2jan26.modeldata.toUiStateSiswa
import com.example.firebase2jan26.repositori.RepositorySiswa
import com.example.firebase2jan26.view.route.DestinasiDetail
import kotlinx.coroutines.launch
